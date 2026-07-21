#include<stdio.h>
#include<stdlib.h>
//accept n number from user and return the largest value from that no.
//find max no;

//O(N)--->time complexity(for loop runs 5 times)

int Maximum(int Arr[],int iSize) //business logic
{
    int iCnt=0;
    int iMax=0;
    iMax=Arr[0];  //current max value
   
    for(iCnt=0;iCnt<iSize;iCnt++)
    {   
       if(Arr[iCnt]>iMax)
       {
            iMax=Arr[iCnt];
       }
    }
        return iMax;   //return should always be after loop not in the loop
}
int main()
{   
    int *Brr=NULL;   //pointer pointing to null
    int iLength=0,iCnt=0;
    int iRet=0;
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

    iRet=Maximum(Brr,iLength);
    printf("Maximum element is:%d\n",iRet);
    free(Brr);


    return 0;  //this is to close the function
}