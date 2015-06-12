package study.dsgnpttrn.chp01_iterator;

import java.util.Iterator;

/**
 * Iterator ...
 *  - 자료구조와 자료 탐색 분리.
 * @author gnsl
 *
 */
public class BookShelfIterator implements Iterator<Object> {
	
	private BookShelf bookShelf;
	private int index; // 여기서 index는 BookShelf 내부 index와 다름.
	
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
