package study.dsgnpttrn.chp06_prototype;

public interface Product extends Cloneable{
	public abstract void use(String s);
	public abstract Product createClone();
}
