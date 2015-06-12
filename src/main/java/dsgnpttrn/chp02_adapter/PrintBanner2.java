package study.dsgnpttrn.chp02_adapter;

/**
 * 아래와 같은 방법을 '위임을 이용한 Apater 패턴'
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
