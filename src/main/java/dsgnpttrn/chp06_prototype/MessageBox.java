package study.dsgnpttrn.chp06_prototype;

/**
 * Prototype ���Ͽ���  ConcretePrototype(��ü���� ����)�� ����<br/>
 *   - ConcretePrototype�� �ν��Ͻ��� �����ؼ� ���ο� �ν��Ͻ��� ���带 �޼ҵ带 ���� ����
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
