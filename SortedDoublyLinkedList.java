public class SortedDoublyLinkedList {

    class node {
        int data;
        node next;
        node prev;

        public node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

        node head = null;
        node tail=null;

       node temp = head;
        public void SortedDoublyLinkedList(int val) {



            node newnode = new node(val);
            newnode.data = val;
            if (head == null) {
                head = newnode;
                tail = head;
            } else if (newnode.data < head.data) {
                head = head.next;
                head.prev = newnode;
                head = newnode;

            } else if (tail == null && newnode.data > tail.data) {
                tail.next = newnode;
                newnode.prev = tail;
                tail = newnode;

            } else {

                while (temp.data< newnode.data) {
                    temp = temp.next;
                }

                newnode.next = temp;
                newnode.prev = temp.prev;
                temp.prev.next = newnode;
                temp.prev = newnode;

            }
        }
                public void display()
            {
                if(head==null)
                {
                    System.out.println("empty linked list");
                }
                else {
                    while(temp!=null)
                    {
                        System.out.println(temp.data+"\n");
                        temp=temp.next;
                    }

                }
            }



    public static void main(String[] args) {


        SortedDoublyLinkedList s=new SortedDoublyLinkedList();
        s.SortedDoublyLinkedList(5);
        s.SortedDoublyLinkedList(7);
        s.SortedDoublyLinkedList(2);
        s.SortedDoublyLinkedList(3);
        s.display();
    }
}