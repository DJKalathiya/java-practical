public class Practice2{
	public static void main(String [] args){
		double a = 3.4;
		double b = 50.2;
		double e = 44.5;
		double c = 2.1;
		double d = 0.55;
		double f = 5.9;

		double x,y;
		x = (e*d - b*f)/(a*d - b*c);
		y = (a*f - e*c)/(a*d - b*c);

		System.out.println("Result of x is : " + x);
		System.out.println("Result of y is : " +y);
	}
}