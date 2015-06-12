package study.dsgnpttrn.chp04_factory;

/**
 * Factory 클래스는 Product를 발급해주고 발급 대장에 등록해주는 일을 한다.
 *   - Factory 와 Product 는 추상클래스로  new 해줄 수 없다.
 *   - so, Product p = createProduct(owner);
 *    => 로 new를 내부적인 메소드에 위임한다.
 * @author gnsl
 *
 */
public abstract class Factory {


	abstract Product createProduct(String owner);
	abstract void registerProduct(Product product);
}
