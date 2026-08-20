#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iNo = 0;
    UINT iMask = 0x1;
    UINT iPos = 0;

    printf("Enter number:\n");
    scanf("%u", &iNo);

    printf("Enter the bit position:\n");
    scanf("%u", &iPos);

    iMask = iMask << (iPos - 1);

    // Toggle the bit
    iNo = iNo ^ iMask;

    printf("Updated number: %u\n", iNo);

    return 0;
}