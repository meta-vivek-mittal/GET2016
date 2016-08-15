/* Assignment 2 */

USE lis;

/*View which display member name and all issue details of the member*/
CREATE OR REPLACE VIEW  MEMBERDATA 
AS
SELECT  distinct  member_nm,accession_no,due_dt,issue_dt 
FROM members INNER JOIN book_issue 
ON  book_issue.member_id=members.member_id;

SELECT * FROM MEMBERDATA;

/*View which contains 3 cols, member name, member id and full description of category*/
CREATE VIEW member 
AS
SELECT member_nm,member_id, 
CASE cateogry WHEN 'F' THEN 'FACULTY' 
WHEN 'S' THEN 'STUDENT' ELSE 'OTHERS' END 
FROM members;
 
SELECT * FROM member;

/*View which contains the info-> subject name,title,membr name, category, issue date, due date and return date. If books not returned, then display NULL*/
CREATE OR REPLACE VIEW overallView
AS
SELECT subject_nm,title_nm,member_nm,cateogry,bi.issue_dt, return_dt,bi.due_dt

FROM book_issue bi
INNER JOIN members m
ON bi.member_id=m.member_id

INNER JOIN Books b
ON b.accession_no=bi.accession_no
INNER JOIN titles t
ON t.title_id= b.title_id
INNER JOIN subjects s
ON s.subject_id=t.subject_id
LEFT JOIN book_return br
ON br.issue_dt = bi.issue_dt and bi.accession_no=br.accession_no and bi.member_id=br.member_id;
SELECT * FROM overallView;