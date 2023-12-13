package kadai_024;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter24 {

	public String getMyChoice() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			String input = scanner.next();
			if (!(input.equals("r") || input.equals("s") || input.equals("p"))) {
				System.out.println(input + "はじゃんけんの手ではありません");
				continue;
			} else {
				scanner.close();
				return input;
			}
		}
	}

	public String getRandom() {
		String[] choice = { "r", "s", "p" };

		return choice[(int) Math.floor(Math.random() * 3)];		
	}

	public void playGame(String choice, String random) {
		HashMap<String, String> choiceMap = new HashMap<String, String>();

		choiceMap.put("r", "グー");
		choiceMap.put("s", "チョキ");
		choiceMap.put("p", "パー");

		System.out.println("自分の手は" + choiceMap.get(choice) + ",対戦相手の手は" + choiceMap.get(random));

		if (choice.equals(random)) {
			System.out.println("あいこです");
		} else if (choice.equals("r") && random.equals("s")) {
			System.out.println("自分の勝ちです");
		} else if (choice.equals("r") && random.equals("p")) {
			System.out.println("自分の負けです");
		} else if (choice.equals("s") && random.equals("r")) {
			System.out.println("自分の負けです");
		} else if (choice.equals("s") && random.equals("p")) {
			System.out.println("自分の勝ちです");
		} else if (choice.equals("p") && random.equals("r")) {
			System.out.println("自分の勝ちです");
		} else if (choice.equals("p") && random.equals("s")) {
			System.out.println("自分の負けです");
		}
	}
}
