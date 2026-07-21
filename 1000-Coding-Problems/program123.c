#include<stdio.h>
#include<stdlib.h>

int summation(int arr[],int iSize)  //function
    {
        int iCnt=0;
        int iSum=0;
        for(iCnt=0;iCnt<iSize;iCnt++)
        {
            iSum=iSum+arr[iCnt];
        }
    }
    
int main()
{
    int *Brr=NULL;
    int iLength=0;
    int iCnt=0;
    int iRet=0;
    printf("Enter the number of elements:");
    scanf("%d",&iLength);

    Brr=(int*)malloc(sizeof(int)*iLength); //memory allocated

    printf("enter the elements");
    for(iCnt=0;iCnt<iLength;iCnt++)
    {
        scanf("%d",&Brr[iCnt]);
    }

    iRet=summation(Brr,iLength);
    printf("Summation is:%d\n",iRet);
    return 0;   
}