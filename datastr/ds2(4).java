import java.util.Scanner;
class s 
{
   public static void SubString(String str, int n)
    {
       for (int i = 0; i < n; i++) 
           for (int j = i+1; j <= n; j++)
                System.out.println(str.substring(i, j));
    }
 
    public static void main(String[] args)
    {
        Scanner s1 = new Scanner(System.in);
        String str = s1.nextLine();
        int n=str.length();
        SubString(str, str.length());
    }
}