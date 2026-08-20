//accept number from user and toggle a bit from position 1 and 7
//two positions c
//3 and 8

#include<stdio.h>

typedef unsigned int UINT;

int main()
{
   
    UINT iMask = 0X00000084; //mask for positions 9 and 17
    UINT iNo=0;
    UINT iResult=0;

    printf("Enter number:");
    scanf("%d",&iNo);

    iResult=iNo^iMask;

    printf("Updated number:%d\n",iResult);


    return 0;
}