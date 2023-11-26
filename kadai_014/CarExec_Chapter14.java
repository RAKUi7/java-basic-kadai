package kadai_014;

public class CarExec_Chapter14 {

	public static void main(String[] args) {

		Car_Chapter14 cargear = new Car_Chapter14();

		for (int i = 2; i <= 5; i++) {
			cargear.gearChange(i);
			cargear.run();
		}
	}

}
