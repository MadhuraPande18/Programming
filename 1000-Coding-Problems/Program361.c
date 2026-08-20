#include<stdio.h>

#pragma pack(1)
struct node
{
    int Data;
    struct node *next;

};

typedef struct node NODE;   //struct node la NODE ni replace kela
typedef struct node* PNODE ;//PNODE=pointer node  (node * la PNODE convert)

int main()
{   PNODE head=NULL;  //100          //head is not node..its pointer 
    PNODE temp=NULL;
    NODE obj1,obj2,obj3;        //here memory got allocated
    head=&obj1;                 //now head is pointing to first node
  
    obj1.Data=11;
    obj1.next=&obj2;    //200
    obj2.Data=21;
    obj2.next=&obj3;    //300
    obj3.Data=51;
    obj3.next=NULL;

    temp=head;   //100      //temp is copy of head created to use insted of head pointer

    //so now sequence is there below
    printf("%d\n",temp->Data);  //11
    temp=temp->next;            //200  temp went to 200 address

    printf("%d\n",temp->Data);  //21
    temp=temp->next;            //300 

    printf("%d\n",temp->Data);  //51

    temp=temp->next;  //null
    return 0;
}