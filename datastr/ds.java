import java.util.Scanner;
public class ds
{
    static char max(String str)
    {
        int arr[] = new int[256];
        int len = str.length();
        for(int i = 0 ; i < len ; i++)
        {
            arr[str.charAt(i)]++;
        }
        int max = 0;
        char character = ' ';
        for(int i = 0 ; i < len ; i++)
        {
            if(max < arr[str.charAt(i)])
            {
                max = arr[str.charAt(i)];
                character = str.charAt(i);
            }
        }
        return character;
    }
  
    public static void main(String[] args)
    {
       String str;
       Scanner s = new Scanner(System.in);
       str = s.nextLine();
       System.out.println(max(str));
    }
}

