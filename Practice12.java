import java.util.*;
class Practice12{
	public static void main(String[] args){
		Random number = new Random(1000);
		for(int i=0; i<100; i++){
			System.out.printf("%5d",number.nextInt(49));

			if((i+1)%20 == 0){
				System.out.println();
			}
		}
	}
}