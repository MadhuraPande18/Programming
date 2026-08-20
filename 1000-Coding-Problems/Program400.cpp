#include<iostream>
using namespace std;

#pragma pack(1);
struct node             //this are nodes
{
   int Data;
   struct node *next;
};

typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

class SinglyLL      //singly linked list
{
    public:
        PNODE first;
        int iCount;
    SinglyLL()
    {
        this->first= NULL;       //this ->to access non-static characteristics
        cout<<"Inside constructor"<<endl;
        this->iCount=0;     //this will replace while

    }
};

int main()
{
    SinglyLL sobj; 
    sobj.first=NULL;        //drawback
    sobj.iCount=15;         //drawback
    return 0;
}