import java.util.Scanner;
public class Practice4{
	public static void main(String [] args){
		double pound,inch;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight in pounds : " );
		pound = sc.nextDouble();
		System.out.println("Enter height in inch : " );
		inch = sc.nextDouble();

		Double BMI = (pound*0.45355923)/(inch*inch*0.0254);

		System.out.println("YOur BMI is : "+ BMI );

	}
}	