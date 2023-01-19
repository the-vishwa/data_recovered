package stack_queue;

import java.util.LinkedList;

public class MyOwnStack {
		private LinkedList<Book> list;
		public MyOwnStack() {
			this.list = new LinkedList<>() ;
		}
		void push(Book book) {
			this.list.addLast(book);
		}
		public Book baher() {
			return this.list.removeLast();
		}
		public static void main(String[] args) {
			MyOwnStack stack = new MyOwnStack();
			stack.push(new Book("A", "a", 10)); // 1
			stack.push(new Book("B", "b", 20));// 2
			stack.push(new Book("C", "c", 25));// 3
			stack.push(new Book("D", "d", 25));// 4
			
			Book b = stack.baher();
			System.out.println(b);
			
			Book b1 = stack.baher();
			System.out.println(b1);

			Book b2 = stack.baher();
			System.out.println(b2);
			
			Book b3 = stack.baher();
			System.out.println(b3);
		}
}
 