import java.util.*;
class Rever 
{
  public int[] Rev(int arr[],int f,int l)
  {
    int i,temp;
    if(f<l)
    {
      temp=arr[f];
      arr[f]=arr[l];
      arr[l]=temp;
      Rev(arr,f+1,l-1);
    }
return arr;
  }
  public int[] Reverse(int arr[])
  {
    return Rev(arr,0,arr.length-1);
  }
  public static void main(String[] args) {
    Rever m=new Rever();
    int n,i,num;
    Scanner o=new Scanner(System.in);
    System.out.println("enter array size");
    n=o.nextInt();
    int arr[]=new int[n];
    System.out.println("enter array elements");
    for(i=0;i<n;i++)
    {
      arr[i]=o.nextInt();
    }
    int b[]=new int[arr.length];
    b=m.Reverse(arr);
    System.out.println("Reverse array elements");
    for(i=0;i<arr.length;i++)
    {System.out.println(b[i]);}
  }
}