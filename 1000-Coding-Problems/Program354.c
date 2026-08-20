#include<stdio.h>

#pragma pack(1)
struct node
{
    int Data;
    struct node *next;

};

int main()
{
    struct node obj1,obj2;        //here memory got allocated
   
    obj1.Data=11;
    obj1.next=&obj2;
    obj2.Data=21;
    obj2.next=NULL;
   
    printf("%d\n",obj1.Data);
    printf("%d\n",obj2.Data);

    return 0;
}