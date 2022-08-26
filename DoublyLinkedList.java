public class DoublyLinkedList {

    class node{
        int data;
        node prev;
        node next;

        node(int data)
        {
            this.data=data;
            this.next=null;
            this.prev=null;

        }
    }
    node head=null;

    public void inserAtEnd(int val)
    {
        node newNode=new node(val);
         newNode.data=val;

        if(head==null)
        {
            head=newNode;
        }
        else{
            node temp=head;
        while (temp.next!= null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;

    }
    }
    public void removeItem(int item)
    {
        node temp=head;
        if(temp.data==item)
        {
            head=head.next;
            head.prev=null;
        }
        else {
            while(temp.data!=item)
            {
                temp=temp.next;
            }
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
    }
    public void insertAtPosition(int val,int pos)
    {
        node temp=head;
        node newnode=new node(val);
        newnode.data=val;

        if(head==null)
        {
            head=newnode;
        }
        if(pos==0)
        {
            newnode.next=head;
            head.prev=newnode;
            newnode=head;
        }

            for(int i=0; i<=pos;i++)
            {
                temp=temp.next;

            }
            if(temp==null)
            {
                this.inserAtEnd(val);
                return;

            }
            newnode.next=temp;
            newnode.prev=temp.prev;
            temp.prev.next=newnode;
            temp.prev=newnode;
        }

    public void display() {
        node temp = head;

            while (temp!=null) {
                System.out.println(temp.data+"\n");
                temp = temp.next;

            }

        }

    public static void main(String[] args) {
        DoublyLinkedList D=new DoublyLinkedList();
        D.inserAtEnd(5);
        D.inserAtEnd(6);
        D.inserAtEnd(7);
        D.inserAtEnd(2);
        D.inserAtEnd(100);
        D.insertAtPosition(50,1);
        D.removeItem(2);

        D.display();
    }
}