package kadai_011;

public class Prime_Chapter11 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		boolean[] newArray = new boolean[101];

		for (int i = 2; i <= 100; i++) {
			newArray[i] = true;
		}

		for (int i = 2; i <= 100; i++) {
			if (newArray[i]) {
				for (int j = i * 2; j <= 100; j += i) {
					newArray[j] = false;
				}
			}
		}

		for (int i = 2; i <= 100; i++) {
			if (newArray[i]) {
				System.out.println(i);
			}
		}

	}

}
