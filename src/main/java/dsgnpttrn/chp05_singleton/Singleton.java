package study.dsgnpttrn.chp05_singleton;

/**
 * �ټ���° ������ �������� �̱��� ����<br/>
 *  - �̱��������� �ý��ۿ��� �� �ϳ��ۿ� �������� �ʴ� ���� ���α׷����� ǥ���ϰ� ���� �� ����Ѵ�.<br/>
 *  - ���� ��� ��ǻ�� ��ü�� ǥ���� Ŭ����, ������ �ý��� ������ ǥ���� Ŭ����, ������ �ý����� ǥ���� Ŭ���� ��.<br/>
 *  - egov(spring)���� ���� ����ϴ� ����(Control, Service, Component<Dao>...)
 * @author gnsl
 *
 */
public class Singleton {

	/**
	 * ��뿹1
	private static Singleton singleton = new Singleton();

	private Singleton() {
		System.out.println("�ν��Ͻ��� �����Ͽ����ϴ�.");
	}

	public static Singleton getInstance() {
		return singleton;
	}
	 */

	/**
	 * ��뿹 2
	 */
	private static Singleton instance = null;
	private Singleton() {
		System.out.println("�ν��Ͻ��� �����Ͽ����ϴ�.");
	}

	public static Singleton getInstance() {

		synchronized (instance) { // sync �߰�
			if (instance == null) {
				instance = new Singleton();
			}
		}
		return instance;
	}

}
