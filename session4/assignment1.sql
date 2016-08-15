/* Assignment 1 */

USE lis;

/*Display name of those members who belong as to which member "Joe Snow Belongs" */
SELECT member_nm,member_id
FROM members 
WHERE cateogry = 
(SELECT cateogry
FROM members WHERE member_nm='Joe Snow');

/*Display information on the books that have not been returned till date.*/
SELECT bi.issue_dt,bi.due_dt,member_nm,titles.title_nm 
FROM book_issue AS bi 
INNER JOIN members ON bi.member_id=members.member_id 
INNER JOIN books ON  books.accession_no=bi.accession_no 
INNER JOIN titles ON books.title_id=titles.title_id 
WHERE not exists(SELECT * FROM book_return where bi.issue_dt=book_return.issue_dt)

/*Display information on the books that have been returned after their due date.*/
SELECT title_nm,member_nm,bi.issue_dt,bi.due_dt,t.title_nm, br.return_dt
FROM book_issue bi
INNER JOIN members m
ON bi.member_id=m.member_id

INNER JOIN Books b
ON b.accession_no=bi.accession_no
INNER JOIN titles t
ON t.title_id= b.title_id

INNER JOIN book_return br
ON br.issue_dt = bi.issue_dt AND bi.accession_no=br.accession_no AND bi.member_id=br.member_id WHERE DATEDIFF(br.return_dt,bi.due_dt)>0;

/*Display information of those books whose price is equal to the most expensive book purchase so far.*/
SELECT accession_no,title_nm 
FROM books INNER JOIN titles 
ON books.title_id=titles.title_id
WHERE price IN (SELECT max(price) FROM books);

/*Display the second maximum price of a book*/
SELECT accession_no,title_nm,price
FROM books 
INNER JOIN titles ON books.title_id=titles.title_id 
WHERE price = (SELECT max(price) FROM books
WHERE price <(SELECT max(price) FROM books));
