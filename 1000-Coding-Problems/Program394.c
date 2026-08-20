#include<stdio.h>
#include<stdlib.h> //for malloc

#pragma pack(1);    //to prevent padding

struct node     //declaration 
    {
        int Data;
        struct node *next;
        struct node *prev;      //$
    };

typedef struct  node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;


int Count(PNODE First)     //Count will return integer
{
    int iCount=0;

    while (First!=NULL)     //aapan first la loop vr firawtoy
    {
        iCount++;
        First=First->next;
    }
    
    return iCount;
}

void Display(PNODE First)   //will not return anything
{
    printf("NULL\n");       //start cha next madhe null
    while (First!=NULL)
    {
        printf("|%d| <==> ",First->Data);
        First=First->next;
    }
    
    printf("NULL\n");   //end cha next madhe null
}

void InsertAtFirst(PPNODE First,int iNo)        //PPNODE ch nav is declared now as first 
{
    PNODE newn=NULL;        //newn navacha pnode
    newn=(PNODE)malloc(sizeof(NODE));

    newn->Data=iNo;
    newn->next=NULL;
    newn->prev=NULL;    //$

    if(NULL==*First)        //if ll is empty
    {
       *First=newn;
       
    }

    else
    {
        newn->next=*First;
        (*First)->prev=newn;    //$
        *First=newn;

    }


}

void InsertAtLast(PPNODE First,int iNo)
{
    PNODE newn=NULL;        //newn navacha pnode
    PNODE temp=NULL;
    newn=(PNODE)malloc(sizeof(NODE));

    newn->Data=iNo;
    newn->next=NULL;
    newn->prev=NULL;

    if(NULL==*First)        //if ll is empty
    {
       *First=newn;
    }

    else
    {
        temp=*First;    //100
        while (temp->next!=NULL)        //joparynt temp->next null hot nahi,ha pointer 2nd last element vr thambel
        {
           temp=temp->next;
        }

        temp->next=newn;
        newn->prev=temp;    //$
       
    }
}


void InsertAtPos(PPNODE First,int iNo,int iPos)
{
    int iCount=0;
    iCount=Count(*First);        //icount la 100 pathwla
    PNODE temp=NULL;            //copy 
    PNODE newn=NULL;

    if((iPos<1)||(iPos>iCount+1)) //count+1 mhanje last node nantr ajun ek node add kru shakto pn tyapudhe nahi
    {
        printf("invalid position\n");
        return;
    }

    if(iPos==1)
    {
        InsertAtFirst(First,iNo);
    }

    else if(iPos==iCount+1)  //last node nantr chi position is iCount+1
    {
        InsertAtLast(First,iNo);
    }

    else
    {
        int i=0;
        temp=*First  ;   //100 ala temp mdhe

        newn=(PNODE)malloc(sizeof(NODE)); //aadhi declare kela hota just pn aata memory dili newn cha node la
        newn->Data=iNo;
        newn->next=NULL;
        newn->next=NULL;
     
        for(i=0;i<iPos-1;i++)   //ipos-1 coz jacha nantr insert karaych
        {
            temp=temp->next;
        }

        newn->next=temp->next; //newn cha next la temp cha next sobt jodla
        temp->next->prev=newn;  //temp cha previous  mhanje 400 adress cha prev
        temp->next = newn;
        newn->prev = temp;              // $
    }



}

void DeleteFirst(PPNODE first)
{
    if(*first==NULL)        //ll is empty
    {
        return;
    }

    else if((*first)->next==NULL )    //contains atleast 1 node
    {
        free(*first);
        *first=NULL;
    }

    else
    {
        *first=(*first)->next;        //head madhe aata 200 aala
        free((*first)->prev);       //$

        ((*first)->prev)==NULL;
    }
}

void DeleteLast(PPNODE first)
{
    PNODE temp=NULL;
    if(*first==NULL)        //ll is empty
    {
        return;
    }

    else if((*first)->next==NULL )    //contains atleast 1 node
    {
        free(*first);
        *first=NULL;
    }

    else
    {
        temp=*first;    
        while(temp->next->next!=NULL)       //type 3 (ha loop last 3rd value vr thambel )
        {
            temp=temp->next;
        }

        free(temp->next);
        temp->next=NULL;

    }


}

void DeleteAtPos(PPNODE first,int iPos)
{
    int iCount=0;
    iCount = Count(*first);       //icount la 100 pathwla

    if((iPos<1)||(iPos>iCount)) //ithe iCount+1 nahi chalnar karan insert nahi last node delete karaychie (iCount is last node count)
    {
        printf("invalid position\n");
        return;
    }

    if(iPos==1)
    {
        DeleteFirst(first);
    }

    else if(iPos==iCount)  //last node nantr chi position is iCount+1
    {
        DeleteLast(first); //first is address
    }

    else
    {

    }


}


int main()
{
   PNODE head=NULL;
   InsertAtFirst(&head,51);
   InsertAtFirst(&head,21);
   InsertAtFirst(&head,11);

   InsertAtLast(&head,101);
    InsertAtLast(&head,111);
    InsertAtLast(&head,121);
    InsertAtLast(&head,151);

    Display(head);

    int iRet=0;
    iRet=Count(head);

    printf("Number of elements are:%d\n",iRet);

    DeleteFirst(&head); //address pathwla jo delete karaychay to

    Display(head);

     iRet=0;
    iRet=Count(head);

    printf("Number of elements are:%d\n",iRet);

    DeleteLast(&head);
     Display(head);

     iRet=0;
    iRet=Count(head);

    printf("Number of elements are:%d\n",iRet);

    InsertAtPos(&head,105,4);

    Display(head);

     iRet=0;
    iRet=Count(head);

    printf("Number of elements are:%d\n",iRet);  





    return 0;
}