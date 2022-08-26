public class Queue {
    int []arrqueue=new int[100];
    int head=-1;
    int tail=-1;
    public void Enqueue(int val) {

        if (tail == 99) {
            System.out.println("array is full");
        } else if (IsEmpty()) {
            head = tail = 0;

        } else {

            tail++;
        }
        arrqueue[tail] = val;
    }
    public void Dequeue()
    {
        if(IsEmpty())
            System.out.println("array is empty");

        else
          head++;

    }
    public boolean IsEmpty()
    {
        if(head==-1&&tail==-1)
        return true;
        else return false;
    }
    public int headd()
    {
        if(IsEmpty())
            return -1;

        else
          return  arrqueue[head];
    }
    public static void main(String[] args) {
        Queue q=new Queue();
        q.Enqueue(5);
        q.Enqueue(10);
        q.Enqueue(5);

        while (!q.IsEmpty())
        {
            System.out.println(q.headd());
            q.Dequeue();
        }
    }
}