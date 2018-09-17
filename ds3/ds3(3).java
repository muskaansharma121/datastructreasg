import java.util.*;
class Fibonacci
 {
  public int Fibo(int n)
  {
    if(n<=1)
    return n;
    return Fibo(n-1)+Fibo(n-2);
  }
  public static void main(String[] args) 
  {
    Fibonacci m=new Fibonacci();
    int n,i,num;
    Scanner o=new Scanner(System.in);
    System.out.println("enter Nth term of Fibbonacci series");
    n=o.nextInt();
    int a=m.Fibo(n);
    System.out.println("term is: "+a);
    
  }
}