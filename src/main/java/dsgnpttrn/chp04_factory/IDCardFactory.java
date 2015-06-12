package study.dsgnpttrn.chp04_factory;

import java.util.ArrayList;
import java.util.List;

/**
 * <b>Factory Method ����</b>������ �ν��Ͻ��� ����� ����� ����Ŭ���� ������ ����������,
 * ��ü���� Ŭ���� �̸������� �������� �ʽ��ϴ�.
 * ��ü���� ������ ��� ���� Ŭ���� ������ �����մϴ�.<br/> ���� �ν��Ͻ� ������ ����
 * ���(framework)�� ������ �ν��Ͻ� ������ Ŭ������ �и��ؼ� ������ �� �ֽ��ϴ�.<br/>
 *  Factory (����), IDCard�� �߱����� <b>CreditCard</b>�� �߱������� �������� ����.<br/>
 *   - �߱޿� ��� ������ ����
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
