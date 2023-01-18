import java.util.*;

public class Practice8 {
	public static void main(String[] args) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number : ");
		num = sc.nextInt();
		int div = 2;
		while (num > 1) {
			if (num % div == 0) {
				System.out.println(div);
				num = num / div;
			} else {
				div++;
			}
		}
	}
}