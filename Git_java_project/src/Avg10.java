import java.util.Scanner;

public class Avg10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers do you want to put in to get AVG");
		System.out.print("> ");
		int cnt = sc.nextInt();
		System.out.println("Input "+ cnt +"numbers to get AVG");
		int sum=0;
		for(int i=0;i<cnt;i++) {
			System.out.print("> ");
			int x= sc.nextInt();
			sum += x;
		}
		System.out.println("AVG: "+ (sum/cnt));	

	}

}
