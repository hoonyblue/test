package study.dsgnpttrn.chp02_adapter;

/**
 * Adaper Ŭ����
 *  - extends�� implements�� ���� ����ϴ� ��츦 '����� �̿��� Apater ����' �̶���
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
