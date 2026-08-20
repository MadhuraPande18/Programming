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
    return 0;
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


void InsertAtPos(PPNODE First,int iPos,int iNo)
{

}

void DeleteFirst(PPNODE first)
{

}

void DeleteLast(PPNODE first)
{
    
}

void DeleteAtPos(PPNODE first,int iPos)
{
    
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

    Display(&head);

    return 0;
}