class Node
{
    int data;
    Node next;

    public Node(int iNo) 
    {
        data=iNo;
        next=null;
    }
}

class Function
{
    private Node first=null;

    public void InsertFirst(int iNo)
    {
        Node newn=new Node(iNo);
        if(first==null)
        {
            first=newn;

        }

        else
        {
            newn.next=first;
            first=newn;
        }
    }

    public void DisplayOdd()
    {
        Node temp=first;
        while(temp!=null)
        {
            if(temp.data%2!=0)
            {
                System.out.println(temp.data);
            }

            temp=temp.next;
        }
    
    }

}

public class Program1 
{
    public static void main(String[] args) 
    {
        Function fobj=new Function();
        fobj.InsertFirst(11);
        fobj.InsertFirst(12);
        fobj.InsertFirst(13);
        fobj.InsertFirst(14);
        fobj.InsertFirst(33);

        fobj.DisplayOdd();
    }
    

}
