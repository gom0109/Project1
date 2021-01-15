import java.util.Scanner;

public class Ifsum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("It will be blow up so be careful.\r\n" + 
				"You and your friend take turns adding numbers between 1 and 10.\nThe one who detonates the bomb is the loser.");
		System.out.println();
		int bomb = (int)(Math.random()*100)+1;
		
		
		do {
			System.out.println("type number between 1~10");
		System.out.print("> ");
		int x= sc.nextInt();
		if (x<1||x>10) {
			System.out.println("out of range");
		}else {
			bomb =bomb- x;
		}
		if(bomb<10) {
			System.out.println("Warning!!!");
		}
		else if(bomb<5&&bomb>1) {
			System.out.println("runaway");
		}
		}while(bomb>0);
		System.out.println("Bomb");
		System.out.println("Bomb");
		System.out.println("Bomb");
		System.out.println("Bomb");
		System.out.println("Bomb");
		
	}

}
