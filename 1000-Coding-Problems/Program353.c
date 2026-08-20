#include<stdio.h>

#pragma pack(1)
struct node
{
    int Data;
    struct node *next;

};

int main()
{
    struct node obj;        //here memory got allocated
    printf("%d\n",sizeof(obj));     //12
                                    //4(int)+8(pointer)
    obj.Data=11;
    obj.next=NULL;
    

    return 0;
}