import java.util.Scanner;

public class Practice6{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Letter: ");
		char check = sc.next().charAt(0);
		
		if(check=='a'|| check=='e' || check=='i' || check=='o' || check=='u'){
			System.out.println("This is a vowel");
		}
		else{
			System.out.println("This is a constant");
        }
	}
}