import java.util.*; 
class node 
{
  int data;
  node next;
  node(int d)
  {data = d;} 
}
class Stack
{
  node head;
  Scanner sc = new Scanner(System.in);
  node push(int data)
  {
    node new1 = new node(data);
    if(head == null)
    {
      head = new1;
    }
    else
    {
      new1.next = head;
      head = new1;
    }
    return head;   
  }
  int pop()
  {
    if(head == null)
    {
      return 0;
    }
    else
    {
      int t = head.data;
      head = head.next;
      return t;
    }
  }
  boolean isEmpty()
  {
     if(head == null)
     {
       return true;
     }
     else
     {
        return false;
     }
  }
}
class Queue  
{  
    Stack s1 = new Stack();  
    Stack s2 = new Stack();  
  
    void enQueue(int x)  
    {  
        while (!s1.isEmpty()) 
        {  
            s2.push(s1.pop());  
        }   
        s1.push(x);  
        while (!s2.isEmpty())  
        {  
            s1.push(s2.pop());   
        }  
    }  
    int deQueue()  
    {  
        if (s1.isEmpty())  
        {  
            System.out.println("Queue is Empty");    
        }  

        int x = s1.pop();  
        return x;  
    } 
    public void traverse(int n){

        while(n > 0){
            int d = deQueue();
            System.out.print(d+" ");
            n--;
        }
    } 
}
  public class QueueUsingStack{
         
        public static void main(String[] args)  
        {  
            Queue q = new Queue();  
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of queue");
            int n = sc.nextInt();
            for(int i = 0; i < n; i++){
                int d = sc.nextInt();
                q.enQueue(d);
            }  
            q.traverse(n);
        }  
} 