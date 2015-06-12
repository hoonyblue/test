package study.dsgnpttrn.chp02_adapter;

/**
 * Adaper 클래스
 *  - extends와 implements를 같이 사용하는 경우를 '상속을 이용한 Apater 패턴' 이라함
 *  ->
 * @author gnsl
 *
 */
public class PrintBanner extends Banner implements Print {

	public PrintBanner(String string) {
		super(string);
	}

	@Override
	public void printWeak() {
		showWithParen();

	}

	@Override
	public void printStrong() {
		showWithAster();

	}

}
