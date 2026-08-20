#include<stdio.h>

typedef unsigned int UINT;

int main()
{
    UINT iNo = 0;
    UINT iMask = 0;

    printf("Enter number:\n");
    scanf("%u", &iNo);

    iMask = 0x8;      // Mask for 4th bit (1 << 3)

    iNo = iNo ^ iMask;   // Toggle the 4th bit

    printf("Updated number: %u\n", iNo);
    
    return 0;
}