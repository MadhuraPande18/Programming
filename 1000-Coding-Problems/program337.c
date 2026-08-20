#include<stdio.h>

typedef unsigned int UINT;
//4th bit---->>if already ON keep off otherwise off as it is
//position=13

int main()
{
    UINT iNo = 0;
    UINT iMask = 0x1fffffff7;
    UINT iPos = 4;

    printf("Enter number:\n");
    scanf("%u", &iNo);

    // Toggle the bit
    iNo = iNo & iMask;

    printf("Updated number: %u\n", iNo);

    return 0;
}