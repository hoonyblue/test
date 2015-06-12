package study.dsgnpttrn.chp06_prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Prototype 패턴 에서  client(이용자) 역할 class
 * - client는 인스턴스를 복사하는 메소드를 이용해서 새로운 인스턴스를 만듭니다.
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
