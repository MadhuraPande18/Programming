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

int main()
{
    printf("%d\n",sizeof(NODE));        //20 or 12 bytes(two pointers+1 data)
    
    return 0;
}