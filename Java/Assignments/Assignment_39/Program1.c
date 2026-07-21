#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

struct node
{
    int Data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node* PNODE;
typedef struct node** PPNODE;

// Insert at First
void InsertFirst(PPNODE First, int iNo)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->Data = iNo;
    newn->next = NULL;

    if(*First == NULL)
    {
        *First = newn;
    }
    else
    {
        newn->next = *First;
        *First = newn;
    }
}

// Display Linked List
void Display(PNODE First)
{
    while(First != NULL)
    {
        printf("|%d| -> ", First->Data);
        First = First->next;
    }

    printf("NULL\n");
}

// Search Element
bool Search(PNODE Head, int iNo)
{
    while(Head != NULL)
    {
        if(Head->Data == iNo)
        {
            return true;
        }

        Head = Head->next;
    }

    return false;
}

int main()
{
    PNODE First = NULL;
    int Value = 0;

    InsertFirst(&First, 51);
    InsertFirst(&First, 21);
    InsertFirst(&First, 11);
    InsertFirst(&First, 101);

    printf("Linked List:\n");
    Display(First);

    printf("Enter element to search: ");
    scanf("%d", &Value);

    if(Search(First, Value) == true)
    {
        printf("%d is present in the linked list.\n", Value);
    }
    else
    {
        printf("%d is not present in the linked list.\n", Value);
    }

    return 0;
}