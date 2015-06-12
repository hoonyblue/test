package study.dsgnpttrn.chp03_template;

/**
 * Template Method 패턴
 *  - 인터페이스와 비슷한 역할을 하는 뼈대 클래스를 구현하여
 *    하위 클래스로 하여금 상세한 동작을 정의하게 하고,
 *    뼈대 클래스는 그 메소드들의 flow만을 정의
 * @author gnsl
 *
 */
public abstract class AbstractDisplay {

		abstract void open();
		abstract void print();
		abstract void close();

		final void display() {
			open();
			for (int i=0; i<5; i++) {
				print();
			}
			close();
		}

}
