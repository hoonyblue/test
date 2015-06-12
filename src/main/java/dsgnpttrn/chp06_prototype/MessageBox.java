package study.dsgnpttrn.chp06_prototype;

/**
 * Prototype 패턴에서  ConcretePrototype(구체적인 원형)의 역할<br/>
 *   - ConcretePrototype은 인스턴스를 복사해서 새로운 인스턴스를 만드를 메소드를 실제 구현
 *
 * @author gnsl
 *
 */
public class MessageBox implements Product {
	private char decoChar;

	public MessageBox(char decoChar) {
		this.decoChar = decoChar;
	}

	public void use(String s) {
		int length = s.getBytes().length;
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decoChar);
		}
		System.out.println("");
		System.out.println(decoChar + "" + s + "" + decoChar);
		for (int i = 0; i < length + 4; i++) {
			System.out.print(decoChar);
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
