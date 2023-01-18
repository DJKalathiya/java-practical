import java.util.Scanner;
public class Practice5{
	public static void main(String[] args){
		int a,b,c;
		int[] arr = new int[3];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<3; i++){
			System.out.print("Enter number " +(i+1)+ ": ");
			arr[i] = sc.nextInt();			
		}
		System.out.println("In decreasing order : ");
		for(int i=0; i<3-1; i++){
			for(int j=0; j<3-1-i; j++){
				if(arr[j]<arr[j+1]){
					int temp;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int i=0; i<3; i++){
			System.out.println(arr[i] + " " );
		}

	} 
}