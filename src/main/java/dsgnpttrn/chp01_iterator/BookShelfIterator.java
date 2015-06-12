package study.dsgnpttrn.chp01_iterator;

import java.util.Iterator;

/**
 * Iterator ...
 *  - �ڷᱸ���� �ڷ� Ž�� �и�.
 * @author gnsl
 *
 */
public class BookShelfIterator implements Iterator<Object> {
	
	private BookShelf bookShelf;
	private int index; // ���⼭ index�� BookShelf ���� index�� �ٸ�.
	
	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	@Override
	public boolean hasNext() {
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}

	@Override
	public void remove() {
	}
	
	

}
