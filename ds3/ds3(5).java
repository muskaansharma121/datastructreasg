import java.io.*; 
import java.util.*; 
class S
{ 
    static int getSum(int n) 
    {     
        int sum = 0; 
          
        while (n != 0) 
        { 
            sum = sum + n % 10; 
            n = n/10; 
        } 
      
    return sum; 
    } 
   private static Scanner sc;
    public static void main(String[] args) 
    { 
        sc=new Scanner(System.in);
      
         int n=sc.nextInt();
 
  
        System.out.println(getSum(n)); 
    } 
} 