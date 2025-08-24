package Ch06;

interface Remocon {
	int MAX_VOL = 100; // public static final
	int MIN_VOL = 0; // public static final

	void powerOn(); // 추상 메서드

	void powerOff(); // 추상 메서드

	void setVolumn(int vol);

	void increaseVolumn(int incVol);
}

interface Browser {
	void searchURL(String url);
}

class Tv implements Remocon {
	private int nowVol;

	@Override
	public void powerOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void powerOff() {
		System.out.println("TV를 끕니다.");

	}

	@Override
	public void setVolumn(int vol) {
		if (vol >= MAX_VOL)
			this.nowVol = MAX_VOL;
		else if (vol <= MIN_VOL)
			this.nowVol = MIN_VOL;
		else
			this.nowVol = vol;

		System.out.println("TV 현재 볼륨 : " + nowVol);

	}

	@Override
	public void increaseVolumn(int incVol) {

	}
}

class Radio implements Remocon {
	private int nowVol;

	@Override
	public void powerOn() {
		System.out.println("라디오를 켭니다.");

	}

	@Override
	public void powerOff() {
		System.out.println("라디오를 끕니다.");

	}

	@Override
	public void setVolumn(int vol) {
		if (vol >= MAX_VOL)
			this.nowVol = MAX_VOL;
		else if (vol <= MIN_VOL)
			this.nowVol = MIN_VOL;
		else
			this.nowVol = vol;

		System.out.println("RADIO 현재 볼륨 : " + nowVol);

	}

	@Override
	public void increaseVolumn(int incVol) {
		int newVol = nowVol + incVol;
		if (newVol >= MAX_VOL)
			this.nowVol = MAX_VOL;
		else if (newVol <= MIN_VOL)
			this.nowVol = MIN_VOL;
		else
			this.nowVol = newVol;

		System.out.println("RADIO 현재 볼륨 : " + nowVol);

	}

}

class SmartTV extends Tv implements Browser {

	@Override
	public void searchURL(String url) {
		System.out.println(url + "로 이동합니다-!");

	}

}

public class C03InterfaceMain {
	public static void TurnOn(Remocon controller) // TV / Radio 객체
													// Remocon controller = new Tv
	{
		controller.powerOn();
	}

	public static void TurnOff(Remocon controller) {
		controller.powerOff();
	}

	public static void ChangeVolumn(Remocon controller, int vol) {
		controller.setVolumn(vol);
	}

	public static void Internet(Browser browser, String url) {
		browser.searchURL(url);
	}
	public static void IncreaseVolumn(Remocon controller, int incVol) {
		controller.
	}

	public static void main(String[] args) {
		Tv tv = new Tv();
		Radio radio = new Radio();
		SmartTV smartTv = new SmartTV();

		TurnOn(smartTv);
		ChangeVolumn(smartTv, 10);
		Internet(smartTv, "www.naver.com");

		TurnOff(smartTv);

//		TurnOn(tv);
//		TurnOn(radio);
//		
//		ChangeVolumn(tv, 50);
//		ChangeVolumn(tv, 120);
//		ChangeVolumn(radio, -1);
//		ChangeVolumn(radio, 70);
//				
//		TurnOff(tv);
//		TurnOff(radio);

	}

}
