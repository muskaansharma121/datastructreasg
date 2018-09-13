import java.util.Scanner;
class Main 
{
  public static void main(String[] args)
  {
    String str;
    String temp;
    Scanner s = new Scanner(System.in);
    str = s.nextLine();
    int len = str.length();
    for(int i = 0 ; i < len ; i++)
    {
      if(str.charAt(i) != ' ')
      {
       if(str.charAt(i) >='a' && str.charAt(i) <='z')
       {
           temp = (int)str.charAt(i);
           temp -=32;
           System.out.print((char)temp);
       }
       else
       {
           temp = (int)str.charAt(i);
           temp +=32;
           System.out.print((char)temp);
       }
      }
      else System.out.print(" ");
    }
    
  }
}
