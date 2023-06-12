package advance1;
import java.util.Scanner;

public class domination {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int[] denominations = {100, 50, 10, 5, 2, 1};
        int count = 0;
        for (int denomination : denominations) {
            count += total / denomination;
            total %= denomination;
        }
        System.out.println(count);
	}
}

