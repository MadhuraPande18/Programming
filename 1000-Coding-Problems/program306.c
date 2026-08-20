// Accept a number and count the number of 1's in its binary representation

#include<stdio.h>

int main()
{
    int No = 0;
    int iCount = 0;
    int iDigit = 0;

    printf("Enter number:\n");
    scanf("%d", &No);

    while(No != 0)
    {
        iDigit = No % 2;

        if(iDigit == 1)
        {
            iCount++;
        }

        No = No / 2;
    }

    printf("Number of 1's are: %d\n", iCount);

    return 0;
}