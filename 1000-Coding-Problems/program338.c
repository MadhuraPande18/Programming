#include<stdio.h>

typedef unsigned int UINT;
//13th th bit---->>if ON keep off otherwise keep off as it is
//position=13

int main()
{
    UINT iNo = 0;
    UINT iMask = 0xffffeff;
    UINT iPos = 13;

    printf("Enter number:\n");
    scanf("%u", &iNo);

    // Toggle the bit
    iNo = iNo & iMask;

    printf("Updated number: %u\n", iNo);

    return 0;
}