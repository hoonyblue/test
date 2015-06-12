package study.dsgnpttrn.chp01_iterator;

import java.util.Iterator;

/**
 * Iterator pattern sample
 * @author gnsl
 *
 */
public class BookShelf {

	private Book[] books;
	private int last = 0;
	
	public BookShelf(int maxSize) {
		this.books = new Book[maxSize];
	}
	
	public Book getBookAt(int index) {
		return books[index];
	}
	
	public void appendBook(Book book) {
		this.books[last] = book;
		last++;
	}
	
	public int getLength() {
		return last;
	}
	
	public Iterator<?> iterator() {
		return new BookShelfIterator(this);
	}
}
