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

}

void InsertAtFirst(PPNODE First,int iNo)        //PPNODE ch nav is declared now as first 
{

}

void InsertAtLast(PPNODE First,int iNo)
{

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

    return 0;
}