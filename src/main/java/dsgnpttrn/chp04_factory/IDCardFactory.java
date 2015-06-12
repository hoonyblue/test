package study.dsgnpttrn.chp04_factory;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>Factory Method 패턴</b>에서는 인스턴스를 만드는 방법을 상위클래스 측에서 결정하지만,
 * 구체적인 클래스 이름까지는 결정하지 않습니다.
 * 구체적인 내용은 모두 하위 클래스 측에서 수행합니다.<br/> 따라서 인스턴스 생성을 위한
 * 골격(framework)과 실제의 인스턴스 생성의 클래스를 분리해서 생각할 수 있습니다.<br/>
 *  Factory (공장), IDCard를 발급할지 <b>CreditCard</b>를 발급할지는 하위에서 결정.<br/>
 *   - 발급와 등록 행위만 정의
 * @author gnsl
 *
 */
public class IDCardFactory extends Factory {

	private List<String> owners = new ArrayList<String>();

	@Override
	protected Product createProduct(String owner) {
		return new IDCard(owner);
	}

	@Override
	void registerProduct(Product product) {
		owners.add(((IDCard)product).getOwner());
	}

	public List<String> getOwners() {
		return this.owners;
	}

}
