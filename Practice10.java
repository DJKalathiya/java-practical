import java.util.*;

public class Practice10 {
	public static void rev(int a[]) {
		int len = a.length;
		int temp;
		for (int i = 0, j = len - 1; i < len / 2; i++, j--) {
			temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		System.out.println("Enter 10 number ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("reverse are : ");
		rev(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print( arr[i]+" " );
		}
	}
}