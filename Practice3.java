import java.util.Scanner;
public class Practice3{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number in meter : ");
		double meter = sc.nextDouble();
		Double feet = meter * 3.28084;
		System.out.println("Feet is = " + feet);
	}
}