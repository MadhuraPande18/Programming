#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

//O(N)--->time complexity(for loop runs 5 times)

bool LinearSearch(int Arr[],int iSize,int iNo)
{
    int iCnt=0;
   
    for(iCnt=0;iCnt<iSize;iCnt++)
    {   
       if(Arr[iCnt]==iNo)
       {
            break;   //early exit (loop does not moves n times..breaks when it getss)
       }
    }

    if(iCnt<iSize)
    {
        return true;
    }
    else
    {
        return false;
    }

}
int main()
{   
    int *Brr=NULL;   //pointer pointing to null
    int iLength=0,iCnt=0,iValue=0;
    bool bRet=false;

    //step1:accept the number of elements
    printf("enter number of elements:\n");
    scanf("%d",&iLength);

    //step2:allocate the memory
    Brr=(int*) malloc (iLength*sizeof(int));  //bites saperation

    //step3:accept the values from user
    printf("Enter the elements: ");

    for(iCnt=0;iCnt<iLength;iCnt++)
    {           
        scanf("%d",&Brr[iCnt]);
        
    }

    printf("Enter the element that you want to search");
    scanf("%d",&iValue);
    bRet=LinearSearch(Brr,iLength,iValue);

    
    if(bRet==true)
    {
        printf("element is present");
    }

    else
    {
        printf("element is not present");
    }
    //step5:deallocate the memory

    free(Brr);


    return 0;  //this is to close the function
}