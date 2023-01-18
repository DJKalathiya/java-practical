import java.util.*;
class Practice15
{
     public static void main(String arg[])
     {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter binary num to convert it decimal: ");
       String a =sc.nextLine();
       try
       {
        System.out.println("decimal of binary num is :"+bin2dec(a));
       }
       catch(NumberFormatException ex)
       {
        System.out.println(ex);
       }
     }
     public static int bin2dec(String b) throws NumberFormatException
     {
        int c =b.length();
        int i;
        int decimal=0;
        for(i=0;i<c;i++)
         {
           if(b.charAt(i)<'0' || b.charAt(i)>'1')
             {
               throw new NumberFormatException("please enter valid binary num.");
             }
           decimal+=((b.charAt(i)-'0') * Math.pow(2,c - i -1) );
         }
       return decimal;
     } 
}