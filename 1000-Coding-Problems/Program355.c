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
   
    printf("%u\n",&obj1);
    printf("%u\n",&obj2);
    printf("%u\n",obj1.next);
    printf("%u\n",obj2.next);
    printf("%d\n",obj1.next->Data);  //obj1.next cha data==21

    return 0;
}