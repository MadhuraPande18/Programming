class node
{
    public int data;
    public node next;
    public node prev;

    node(int no)    //constructor
    {
        this.data=no;
        this.next=null;
        this.prev=null;
    }    
}

class DoublyLL
{
    private  node first;
    private  int iCount;
    private node last;

    public DoublyLL()
    {
        this.first=null;
        this.iCount=0;
        this.last=null;

    }

    public void Display()
    {
        node temp=first;

        while(temp!=null)
        {
            System.out.print("|"+temp.data+"|<=>");
            temp=temp.next;
        }

        System.out.println("Null");
    }

    public int Count()
    {
        return iCount;
    }

    public void InsertFirst(int iNo)
    {
        node newn=new node(iNo);

        if(first==null)
        {
            first=newn;
        }

        else
        {
            first.prev=newn;
            newn.next=first;
            first=newn;
        }

        if(last == null)
        {
            last = first;
        }

        iCount++;
    }


    public void InsertLast(int iNO)
    {
        node newn=new node(iNO);

        if(first==null)
        {
            first=newn;
            last=newn;
        }

        else
        {
           last.next=newn;
           newn.prev=last;
           last=newn;

        }

        iCount++;
    }

    public void InsertAtPos(int iNo,int iPos)
    {
        node temp=null;
        node newn=null;
        int i=0;

        if((iPos<1)||(iPos>iCount+1))
        {
            return;
        }

        if(iPos==1)
        {
            InsertFirst(iNo);
        }

        else if(iPos==iCount+1)
        {
            InsertLast(iNo);
        }

        else 
        {
            newn=new node(iNo);

            temp=first;

            for(i=1;i<iPos-1;i++)
            {
                temp=temp.next;
            }

            newn.next=temp.next;
            newn.prev=temp;
            temp.next.prev=newn;
            temp.next=newn;

            iCount++;
        }
    }

    public void DeleteFirst()
    {
        if(first == null)
    {
        return;
    }

       else if(first == last)
        {
            first=null;
            last=null;
        }

        else
        {
            first=first.next;
            first.prev=null;
        }
        iCount--;
    }
    
    public void DeleteLast()
    {
         if(first == null)
    {
        return;
    }
    else if(first == last)
    {
        first = null;
        last = null;
    }
    else
    {
        node temp = first;

        while(temp.next != last)
        {
            temp = temp.next;
        }

        last = temp;
        last.next = null;
    }

    iCount--;
    }

    public void DeleteAtPos(int iPos)
    {
        node temp = null;
        int i = 0;
        
        if((iPos < 1) || (iPos > iCount))
        {
            return;
        }

        if(iPos == 1)
        {
            DeleteFirst();
        }
        else if(iPos == iCount)
        {
            DeleteLast();
        }
        else
        {
            temp = first;

            for(i = 1; i < iPos-1; i++)
            {
                temp = temp.next;
            }

            temp.next = temp.next.next;
            temp.next.prev=temp;
            iCount--;
        }        
    }
}

class DoublyLinear
{
    public static void main(String A[])
    {
        int iRet = 0;

        DoublyLL dobj = new DoublyLL();
        
       dobj.InsertFirst(51);
       dobj.InsertFirst(21);
       dobj.InsertFirst(11);

       dobj.InsertLast(101);
       dobj.InsertLast(111);
       dobj.InsertLast(121);
        
       dobj.Display();

        iRet =dobj.Count();

        System.out.println("Number of nodes are : "+iRet);

       dobj.DeleteFirst();
       dobj.DeleteLast();

       dobj.Display();

        iRet =dobj.Count();

        System.out.println("Number of nodes are : "+iRet);

       dobj.InsertAtPos(104,4);

       dobj.Display();

        iRet =dobj.Count();

        System.out.println("Number of nodes are : "+iRet);

       dobj.DeleteAtPos(4);

       dobj.Display();

        iRet =dobj.Count();

        System.out.println("Number of nodes are : "+iRet);
    }
}

