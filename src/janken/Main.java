package janken;
import java.util.Random;
import java.util.Scanner;

public class Main {

	//初期画面メソッド
	static void cli() {
		
		System.out.println("--------------------");
		System.out.println("0ぐー, 1ちょき, 2ぱー");
		System.out.println("数字を選択して");
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		
		//数値入力の例外処理
		try {
			i = sc.nextInt();
			if(0<=i && i<=2) {
				cal(i);
			}else {
				System.out.println("0、1、2以外の数字です");
			}
		}catch(Exception e) {
			System.out.println("数字ではありません");
		}
	}
	
	//勝ち負け判定メソッド
	static void cal(int i) {
		Random rand = new Random();
		
		int cpu = rand.nextInt(3);
		
		switch(cpu) {
		case 0:
			System.out.println("ぐー");
			break;
		case 1:
			System.out.println("ちょき");
			break;
		case 2:
			System.out.println("ぱー");
			break;
		}
		
		switch(i) {
		case 0:
			switch(cpu) {
			case 0:
				System.out.println("あいこ");
				break;
			case 1:
				System.out.println("勝ち");
				break;
			case 2:
				System.out.println("負け");
				break;
			}
			break;
		case 1:
			switch(cpu) {
			case 0:
				System.out.println("負け");
				break;
			case 1:
				System.out.println("あいこ");
				break;
			case 2:
				System.out.println("勝ち");
				break;
			}
			break;
		case 2:
			switch(cpu) {
			case 0:
				System.out.println("勝ち");
				break;
			case 1:
				System.out.println("負け");
				break;
			case 2:
				System.out.println("あいこ");
				break;
			}
			break;
		}
	}
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("ようこそじゃんけん勝負へ");
		
		boolean i=true;
		
		//いいえを選ぶまでじゃんけんが続く
		while(i) {
			cli();
			
			boolean flag = true;
			//正しい値が入力されるまでの処理
			while(flag) {
				System.out.println("もう一度戦う?");
				System.out.println("--------------------");
				System.out.println("1はい, 2いいえ");
				
				Scanner sc = new Scanner(System.in);				
				int j;
				
				//数値入力の例外処理
				try {
					j = sc.nextInt();
					if(j == 1) {
						flag = false;
					}else if(j == 2) {
						i = false;
						flag = false;
					}
				}catch(Exception e) {
					System.out.println("数字ではありません");
				}
			}
		}
	}

}
