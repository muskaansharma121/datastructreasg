import java.util.*; 
class node
{
  int data;
  node next;
  node(int d)
  {
    data = d;
    next = null; 
  }
}
class Queue
{
  node head;
  void add(int d)
  {
    node new1 = new node(d);
    if(head == null)
    {
      head = new1; 
    }
    else
    {
      node t = head;
      while(t.next != null)
      {
        t = t.next;
      }
      t.next = new1;
    }
  } 
 
  boolean isEmpty()
  {
     return head == null;
  }
  int peek()
  {
    int x = head.data;
    return x;
  }
  void remove()
  {
    int x = 0;
    if(head == null)
    {
      System.out.println("underflow");
    }
    else
    {
      //x = head.data;
      head = head.next;
    }
    //return x;
  }
  void display()
  {
     node t = head; 
     while(t!=null)
     {
         System.out.print(t.data+"->");
         t = t.next;
     }
     System.out.println();
  }
}

class Stack  
{  
     Queue q1 = new Queue();
     Queue q2 = new Queue();   
  
    void push(int x)  
    {  
        q2.add(x);  
  
        while (!q1.isEmpty())  
        {  
            q2.add(q1.peek());  
            q1.remove();  
        }  

        Queue tempq = q1;  
        q1 = q2;  
        q2 = tempq;  
    }  
  
    void pop(){  

        if (q1.isEmpty())  
            return ;  
        q1.remove();  
    }  
  
    int top()  
    {  
        if (q1.isEmpty())  
            return -1;  
        return q1.peek();  
    }  
    void traverse(int n){
       while(n > 0){
        int d = top();
        System.out.print(d+" ");
        pop();
        n--;
       }
    }   
}
public class StackUsingQueue{

    public static void main(String[] args)  
    {  
        System.out.println("Enter the size of stack");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack s = new Stack();  
        for(int i = 0; i < n; i++){
            int d = sc.nextInt();
            s.push(d);  
        }
        s.traverse(n);
    } 
} 