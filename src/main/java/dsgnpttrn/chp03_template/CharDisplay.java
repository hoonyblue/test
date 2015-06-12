package study.dsgnpttrn.chp03_template;

public class CharDisplay extends AbstractDisplay {

	private char ch;

	public CharDisplay(char ch) {
		this.ch = ch;
	}

	@Override
	void open() {
		System.out.println("open...");

	}

	@Override
	void print() {
		System.out.println("print: " + ch);
	}

	@Override
	void close() {
		System.out.println("close");

	}

}
