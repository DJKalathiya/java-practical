import java.util.*;
 
public class Practice16
{
  public static void main(String arg[])
   {
     int i=0;
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter decimal number :");
     String a =sc.nextLine();
     System.out.print("Integer part is:");
     while(i<a.length())
      {
          if(a.charAt(i) == '.')
           {
            break;
           }
        System.out.print(""+a.charAt(i));
        i++;
     }
      System.out.print("\nFraction number :");
        System.out.print("0.");
     i++;
     while(i<a.length())
      {
       System.out.print(""+a.charAt(i));
       i++;
      }
   }
}