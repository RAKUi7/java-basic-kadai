package kadai_014;

public class Car_Chapter14 {

	private int gear;
	private int speed;

	public Car_Chapter14() {
		this.gear = 1;
		this.speed = 10;

		System.out.println(this.gear);
		System.out.println(this.speed);
	}

	public void gearChange(int afterGear) {
		if (1 <= afterGear && afterGear <= 5) {
			System.out.println("ギア" + this.gear + "からに" + afterGear + "切り替えました。");
			this.gear = afterGear;
		} else {
			System.out.println("ギアの変更はありませんでした。");
		}
	}

	public void run() {
		int run = this.gear * 10;
		System.out.println("速度は時速" + run + "kmです。");
	}

}
