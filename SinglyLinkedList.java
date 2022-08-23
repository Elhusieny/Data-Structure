public class SinglyLinkedList {

        class Node {
            int data;
            Node next;

            public Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
            //carry address of first node
            //بيشاور علي اول نود في linked list
            public Node head = null;
            //carry address of last node
            public Node tail = null;

            //add element to end of the node
            //value :القيمه بتاعت العنصر اللي هيبقي في النود دي
            public void insertatend(int data) {
                Node newnode = new Node(data);
                //if list is empty
                //add newnode to first linked list and make head pointer on it
                if (head == null) {
                    head = newnode;
                    tail = newnode;
                } else {
                    //make tail next pointer on newnode
                    //make new node the tail (last node in linkedlist)
                    tail.next = newnode;
                    tail = newnode;
                }
            }

            //'''''''''''''''''''''''''''''''''''''''
            //implementation of delete function()

              public void removeItem(int val)
              {
                  //=head this initial value
                  Node temp=head;
                  Node prev=head;
                  //first check if list is empty
                  if(head==null)
                  {
                      System.out.println("empty linkedList");

                      //if data you want yo delete it in the first node (delete it "delete temp")
                      //but first make head pointer to the next
                  } if (temp.data==val)
                  {
                      head=head.next;

                  }
                  //check if we arrived to the end of the list and we dident find the elemnt
                  //loop is working during we dident find the elemet
                  while(temp!=null&&temp.data!=val)
                  {
                      prev=temp;
                      temp=temp.next;
                  }
                  if(temp==null)
                      System.out.println("element not found");
                  else {
                      prev.next=temp.next;
                  }

              }
              public void insetAtPosition(int val,int pos)
              {
                  Node newnode=new Node(val);
                  newnode.data=val;
                  newnode.next=null;
                  Node temp=head;
                  //if you want to add element at index 0 (pos 0)
                  //you should make element next pointer on head and make this element =head
                  if(pos==0)
                  {
                      newnode.next=head;
                      head=newnode;
                      return;
                  }

                  for(int i=0;i<pos-1;i++)
                  {
                      if(temp.next==null)
                          break;
                      temp=temp.next;
                  }
                  newnode.next=temp.next;
                  temp.next=newnode;
              }

              public void RemoveAtPosition(int pos)
              {
                  Node temp=head;
                  if(pos==0)
                  {
                      head=head.next;
                  }
                  for (int i=0;i<pos-1;i++)
                  {
                      if (temp.next==null)
                          break;

                          temp = temp.next;

                  }
                  if(temp.next==null)
                  {
                      System.out.println("invalid position");
                  }
                  temp.next=temp.next.next;
              }
              public void display()
              {
                  Node temp=head;
                  while(temp!=null)
                  {
                      System.out.println(temp.data+"\n");
                      temp=temp.next;
                  }
              }






    public static void main(String[] args) {
        SinglyLinkedList s=new SinglyLinkedList();
        s.insertatend(5);//0
        s.insertatend(4);//1
        s.insertatend(10);//2
        s.insertatend(20);//3
        s.RemoveAtPosition(1);
        /// s.removeItem(5);
       // s.insetAtPosition(100,0);
        s.display();

}}
