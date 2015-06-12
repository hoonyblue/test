package study.dsgnpttrn.chp04_factory;

/**
 * Factory Ŭ������ Product�� �߱����ְ� �߱� ���忡 ������ִ� ���� �Ѵ�.
 *   - Factory �� Product �� �߻�Ŭ������  new ���� �� ����.
 *   - so, Product p = createProduct(owner);
 *    => �� new�� �������� �޼ҵ忡 �����Ѵ�.
 * @author gnsl
 *
 */
public abstract class Factory {


	abstract Product createProduct(String owner);
	abstract void registerProduct(Product product);
}
