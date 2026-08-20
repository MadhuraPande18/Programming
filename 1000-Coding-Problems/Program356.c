#include<stdio.h>

#pragma pack(1)
struct node
{
    int Data;
    struct node *next;

};

int main()
{
    struct node obj1,obj2,obj3;        //here memory got allocated
   
    obj1.Data=11;
    obj1.next=&obj2;
    obj2.Data=21;
    obj2.next=&obj3;
    obj3.Data=51;
    obj3.next=NULL;
   
    printf("%u\n",&obj1);
    printf("%d\n",obj2.Data);
    printf("%u\n",&obj2);
    printf("%d\n",obj3.Data);
    printf("%u\n",&obj3);
    printf("%u\n",obj1.next);
    printf("%u\n",obj2.next);
    printf("%u\n",obj2.next);
     printf("%d\n",obj1.Data);
    printf("%d\n",obj1.next->Data);  //obj1.next cha data==21 aani obj1.next means next cha address
    printf("%d\n",obj1.next->next->Data);


    return 0;
}