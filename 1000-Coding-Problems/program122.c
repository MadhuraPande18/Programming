#include<stdio.h>
#include<stdlib.h>

int Summation(int Arr[],int iSize)

{
    int iCnt=0;
    int iSum=0;
    for(iCnt=0;iCnt<iSize;iCnt++)
    {   
        iSum=iSum+Arr[iCnt];
    }

}
int main()
{   
    int *Brr=NULL;   //pointer pointing to null
    int iLength=0,iCnt=0,iRet=0;

    //step1:accept the number of elements
    printf("enter number of elements:\n");
    scanf("%d",&iLength);

    //step2:allocate the memory
    Brr=(int*) malloc (iLength*sizeof(int));  //bites saperation

    //step3:accept the values from user
    printf("Enter the elements");

    for(iCnt=0;iCnt<iLength;iCnt++)
    {           
        scanf("%d",&Brr[iCnt]);
        
    }

    //step4:use the memory(LOGIC)
    iRet=Summation(Brr,iLength);
    printf("Addition is:%d\n",iRet);
    //step5:deallocate the memory

    free(Brr);


    return 0;
}