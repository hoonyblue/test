package study.dsgnpttrn.chp03_template;

public class StringDisplay extends AbstractDisplay {

	private String str;

	public StringDisplay(String str) {
		this.str = str;
	}

	@Override
	void open() {
		System.out.println("open...");

	}

	@Override
	void print() {
		System.out.println("print: " + str);
	}

	@Override
	void close() {
		System.out.println("close");

	}

}
