package study.dsgnpttrn.chp03_template;

/**
 * 상위 클래스의 flow 대로 display ...
 * @author gnsl
 *
 */
public class TemplateMain {

	/**
	 * "로직을 공통화 할 수 있다."
	 * @param args
	 */
	public static void main(String[] args) {

			AbstractDisplay d1 = new CharDisplay('H');
			AbstractDisplay d2 = new StringDisplay("Hello, World!");
			AbstractDisplay d3 = new StringDisplay("안녕하세요");

			d1.display();
			d2.display();
			d3.display();

	}

}
