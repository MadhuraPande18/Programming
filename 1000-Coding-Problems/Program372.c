#include<stdio.h>
#include<stdlib.h>

struct node
{
   int data;
   struct node *next;
};

typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

void display(PNODE first)       //only declared
{
    while (first!=NULL)
    {
       printf("|%d|-->",first->data);
       first=first->next;       //to move like i++;
    }
    
    printf("NULL\n");
}

int Count(PNODE first)
{
    return 0;
}

void insertFirst(PPNODE first,int iNO )
{
    PNODE newn=NULL;
    newn=(PNODE)malloc(sizeof(NODE));
    newn->data=iNO;
    newn->next=NULL;

    if(*first==NULL) //ll is empty
    {
        *first=newn;
    }

    else            //ll contains atleast one node
    {
        newn->next=*first;
        *first=newn;
    }


}

void insertLast(PPNODE first,int iNO )
{
    PNODE newn=NULL;
    newn=(PNODE)malloc(sizeof(NODE));
    newn->data=iNO;
    newn->next=NULL;

    if(*first==NULL) //ll is empty
    {
        *first=newn;
    }

    else            //ll contains atleast one node
    {
        
    }


}


void InsertAtPos(PPNODE first,int iNO,int iPos )
{}
void deleteFirst(PPNODE first)
{}
void deleteLast(PPNODE first)
{}

void deleteAtPos(PPNODE first,int iPos)
{}

int main()
{
    PNODE head=NULL;

    insertFirst(&head,101);
    insertFirst(&head,51);
    insertFirst(&head,21);
    insertFirst(&head,11);

    display(head);
        return 0;


}