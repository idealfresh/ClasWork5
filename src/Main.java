import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		int num = 1;
		System.out.println("Insert number: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		while (num <= n) {
			if (num % 2 != 0) {
				System.out.println(num);
			}
			num++;
		}
		sc.close();

	}

}
