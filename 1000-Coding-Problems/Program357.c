#include<stdio.h>

#pragma pack(1)
struct node
{
    int Data;
    struct node *next;

};

typedef struct node NODE;   //struct node la NODE ni replace kela

int main()
{   NODE *head=NULL;            //head is not node..its pointer 
    NODE obj1,obj2,obj3;        //here memory got allocated
    head=&obj1;                 //now head is pointing to first node
  
    obj1.Data=11;
    obj1.next=&obj2;
    obj2.Data=21;
    obj2.next=&obj3;
    obj3.Data=51;
    obj3.next=NULL;

//here we can use .dot operator coz its pointer hence use ->to access
   printf("%u\n",head->Data);  //11
   printf("%d\n",head->next->Data); //21
   printf("%d\n",head->next->next->Data); //51
  
    return 0;
}