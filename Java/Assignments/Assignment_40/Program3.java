

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


   public int Occurence(int iNo)
   {
        int LastPose=-1;
        int iPos=1;
        Node temp=null;
        temp=first;
        while(temp!=null)
        {
            if(temp.data==iNo)
            {
                LastPose=iPos;
            }

            temp=temp.next;
            iPos++;
        }

        return LastPose;
   }

}

public class Program3
{
    public static void main(String[] args) 
    {
        Function fobj=new Function();
        fobj.InsertFirst(11);
        fobj.InsertFirst(12);
        fobj.InsertFirst(13);
        fobj.InsertFirst(14);
        fobj.InsertFirst(33);
         fobj.InsertFirst(11);


        int iRet=0;
        iRet=fobj.Occurence(11);
        System.out.println(iRet);
    }
    

}
