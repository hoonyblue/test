package study.dsgnpttrn.chp06_prototype;

public class UnderlinePen implements Product {
	private char ulChar;

	public UnderlinePen(char ulChar) {
		this.ulChar = ulChar;
	}

	public void use(String s) {
		int length = s.getBytes().length;
		System.out.println("\"" + s + "\"");
		System.out.print("");
		for (int i = 0; i < length; i++) {
			System.out.print(ulChar);
		}
		System.out.println("");
	}

	@Override
	public Product createClone() {
		Product p = null;
		try {
			p = (Product)clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return p;
	}


}
