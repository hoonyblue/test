package study.dsgnpttrn.chp02_adapter;

public class AdapterMain {

	public static void main(String[] args) {

		Print p = new PrintBanner("Hello");
		p.printStrong();
		p.printWeak();

	}

}
