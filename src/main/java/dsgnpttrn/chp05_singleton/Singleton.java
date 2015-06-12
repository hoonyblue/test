package study.dsgnpttrn.chp05_singleton;

/**
 * 다섯번째 디자인 패턴으로 싱글톤 패턴<br/>
 *  - 싱글톤패턴은 시스템에서 단 하나밖에 존재하지 않는 것을 프로그램으로 표현하고 싶을 때 사용한다.<br/>
 *  - 예를 들면 컴퓨터 자체를 표한한 클래스, 현재의 시스템 설정을 표현한 클래스, 윈도우 시스템을 표현한 클래스 등.<br/>
 *  - egov(spring)에서 흔히 사용하는 패턴(Control, Service, Component<Dao>...)
 * @author gnsl
 *
 */
public class Singleton {

	/**
	 * 사용예1
	private static Singleton singleton = new Singleton();

	private Singleton() {
		System.out.println("인스턴스를 생성하였습니다.");
	}

	public static Singleton getInstance() {
		return singleton;
	}
	 */

	/**
	 * 사용예 2
	 */
	private static Singleton instance = null;
	private Singleton() {
		System.out.println("인스턴스를 생성하였습니다.");
	}

	public static Singleton getInstance() {

		synchronized (instance) { // sync 추가
			if (instance == null) {
				instance = new Singleton();
			}
		}
		return instance;
	}

}
