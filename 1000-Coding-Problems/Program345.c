//Doubly circular linked list
#include<stdio.h>
#include<stdlib.h>


struct  node
{
    int Data;
    struct node  *next;
    struct node *prev;

};
typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

void Display(PNODE firse,node NULL)
{
    do
    {
      printfuk()
    } while (condition);
    
}


{
    if(F)
}

int Count()
{

}

void InsertFirst(PPNODE first,PPNODE last,int iNo)
{
    PNODE newn=NULL;
    newn=(PNODE)malloc(sizeof(NODE));

    newn->Data=iNo;
    newn->next=NULL;
    newn->prev=NULL;


    if(*first==NULL && *last)
    {
        *first=newn;
        *last=newn;
    }

    else
    {
        newn->next=*first;
        (*first)->prev=newn;
        *first=newn;
    }

    (*last)->next=*first;
    (*first)->prev=**last;
}


void InsertLast(PPNODE first,PPNODE last,int iNo)
{
    PNODE newn=NULL;
    newn=(PNODE)malloc(sizeof(NODE));

    newn->Data=iNo;
    newn->next=NULL;
    newn->prev=NULL;


    if(*first==NULL && *last)
    {
        *first=newn;
        *last=newn;
    }


    else
    {
       ( *last)->next=newn;
        newn->prev=*last;

        *last=last

    }

     (*last)->next=*first;
    (*first)->prev=**last;
}

void InsertAtPos(PPNODE first,PPNODE last,int iNo,int iPos)
{

}

void DeleteFirst(PPNODE first,PPNODE last)
{

}

void DeleteLast(PNODE first,PPNODE last)
{

}

void DeleteAtPos(PNODE first,PPNODE last,int iPos)
{
    
}
int main()
{
    PNODE head=NULL;
    PNODE tail=NULL;

    InsertFirst(51);
    InsertFirst(21);
    InsertFirst(11);

    InsertLast(71);
    InsertAtPos(65);
    return 0;
}