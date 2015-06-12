package study.dsgnpttrn.chp02_adapter;

/**
 * �Ʒ��� ���� ����� '������ �̿��� Apater ����'
 * @author gnsl
 *
 */
public class PrintBanner2 implements Print {

	private Banner banner;

	public PrintBanner2(String string) {
		this.banner = new Banner(string);
	}

	@Override
	public void printWeak() {
		this.banner.showWithParen();
	}

	@Override
	public void printStrong() {
		this.banner.showWithAster();
	}

}
