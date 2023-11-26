package kadai_014;

public class Car_Chapter14 {

	private int gear;
	private int speed;

	public Car_Chapter14() {
		this.gear = 1;
		this.speed = 10;

		System.out.println("ギアは" + this.gear);
		System.out.println("速度は時速" + this.speed + "kmです。");
	}

	public void gearChange(int afterGear) {
		System.out.println("ギア" + this.gear + "から" + afterGear + "に切り替えました。");
		this.gear = afterGear;
		switch (this.gear) {
			case 1:
				this.speed = 10;
				break;
			case 2:
				this.speed = 20;
				break;
			case 3:
				this.speed = 30;
				break;
			case 4:
				this.speed = 40;
				break;
			case 5:
				this.speed = 50;
				break;
			default:
				this.speed = 10;
		}
	}

	public void run() {
		System.out.println("速度は時速" + this.speed + "kmです。");
	}

}
