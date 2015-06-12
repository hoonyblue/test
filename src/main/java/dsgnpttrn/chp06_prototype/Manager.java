package study.dsgnpttrn.chp06_prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Prototype ���� ����  client(�̿���) ���� class
 * - client�� �ν��Ͻ��� �����ϴ� �޼ҵ带 �̿��ؼ� ���ο� �ν��Ͻ��� ����ϴ�.
 * @author gnsl
 *
 */
public class Manager {
	private Map<String, Product> showcase = new HashMap<String, Product>();

	public void register(String name, Product proto) {
		showcase.put(name, proto);
	}

	public Product create(String protoName) {
		Product p = (Product)showcase.get(protoName);
		return p.createClone();
	}
}
