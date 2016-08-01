package session2.assignment1;

import java.util.*;

class LinkedStack<E>  {
	private Node<E> head; // the first node
	private int size; // number of items

	// Nested class to define node
	@SuppressWarnings("hiding")
	private class Node<E> {
		E item;
		Node<E> next;

		Node() {
			this.item = null;
			this.next = null;
		}
	}

	/**
	 * Zero Argument Constructor
	 */
	public LinkedStack() {
		head = null;
		size = 0;
	}

	/**
	 * Following Function Checks for Empty Condition
	 * @return true/false
	 */
	public boolean isEmpty() {
		return (size == 0);
	}

	/**
	 * Following function remove item from the beginning of the list.
	 * @return return(E) the popped item.
	 */
	public E pop() {
		if (isEmpty()) {
			System.out.println("Stack Underflow : ");
			return null;
		}
		E item = head.item;
		head = head.next;
		size--;
		return item;
	}
	
	/**
	 * Following Function returns the item at the specified position
	 * @param position(int) denotes the position of item to be fetched.
	 * @return return(E) the item at the specified position.
	 */
	public E get(int position) {
		Node<E> temp = head;
		if (position == 1) {
			return head.item;
		} else if (position == 2) {
			return head.next.item;
		} else {
			int i = 1;
			while (i < position && temp != null) {
				temp = temp.next;
				i++;
			}
			return temp.item;
		}
	}

	/**
	 * Following function gives the topmost element in the stack
	 * @return (E) returns the topmost item in the stack
	 */
	public E peep() {
		if (isEmpty()) {
			System.out.println("Stack Empty: ");
			return null;
		}
		return head.item;
	}

	/**
	 * Following funciton add item to the beginning of the list.
	 * @param item(E) denotes the item to be pushed in to the stack
	 */
	public void push(E item) {
		Node<E> oldHead = head;
		head = new Node<E>();
		head.item = item;
		head.next = oldHead;
		size++;
	}

	/**
	 * Following function returns number of items present in the stack
	 * @return (int) returns the total items in the stack
	 */
	public int size() {
		return size;
	}

	// Iterator for traversing stack items
	public Iterator<E> iterator() {
		return new LinkedStackIterator();
	}

	// inner class to implement iterator interface
	private class LinkedStackIterator implements Iterator<E> {
		private int i = size;
		private Node<E> first = head; // the first node

		public boolean hasNext() {
			return (i > 0);
		}

		public E next() {
			E item = first.item;
			first = first.next;
			i--;
			return item;
		}

		@Override
		public void remove() {
			//no need
		}
	}

	/**
	 * Following function changes the expression from infix to postfix form
	 * @param expression(Srting) denotes the infix expression entered by the user.
	 * @return returns(String) the Postfix expression.
	 */
	public String infixToPostfix(String expression) {
		LinkedStack<String> stack = new LinkedStack<String>();
		int i = 0;
		String postFix = "";
		String temp="";
		
		while (i < expression.length()) 
		{
			String character = expression.charAt(i) + "";
			System.out.println("Entered character : "+character);
			if (character.equalsIgnoreCase("(")) 
			{
				stack.push(character);
				System.out.println("Stacked Character : "+character);
			} else if (character.equalsIgnoreCase(")"))
			{
				temp = stack.pop();
				System.out.println("Popped Character: "+temp);
				while(!temp.equalsIgnoreCase("("))
				{
					System.out.println("Inside while condition");
					postFix+=temp;
					temp=stack.pop();
				}
			} else if (character.codePointAt(0) >= 65
					&& character.codePointAt(0) <= 90
					|| character.codePointAt(0) >= 97
					&& character.codePointAt(0) <= 122) 
			{
				postFix += character;
				System.out.println("Postfix :  "+postFix);
			} else if (character.equalsIgnoreCase("+")
					|| character.equalsIgnoreCase("-")
					|| character.equalsIgnoreCase("*")
					|| character.equalsIgnoreCase("/")) 
			{
				System.out.println("Inside Operator: ");
				temp = stack.peep();
				System.out.println("peeped temp:" + temp);
				if (temp == null)
				{
					stack.push(character);
					i++;
					continue;
				}else if (temp.equalsIgnoreCase("("))
				{
					System.out.println("Inside temp equals ignorecase condition : "+temp);
					stack.push(character);
					System.out.println("Postfix Now : "+postFix);
				}
				else if (precedence(character) > precedence(temp))
				{
					stack .push(character);
				}
				else if (precedence(character) == precedence(temp)) {
					postFix += stack.pop();
					stack .push(character);
				} else 
				{
					postFix += stack .pop();
					continue;
				}
			} else
				return null;
			i++;
		 }
		while (!stack.isEmpty()) {
			postFix += stack.pop();
		}
		return postFix;
	}
	/**
	 * Following function checks for precedence of operators
	 * @param symbol(String) denotes the operator.
	 * @return (int) returns the precedence value.
	 */
	public int precedence(String symbol) {
		if (symbol.equalsIgnoreCase("*") || symbol.equalsIgnoreCase("/"))
			return 2;
		else
			return 1;
	}
}
