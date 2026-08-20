typedef unsigned int UINT;       
#include<stdio.h>

int main()
{
    UINT iMask=1;    
    int iCnt=0;
    
    for(iCnt=1;iCnt<=32;iCnt++)
    {
        printf("%u: %u\n",iMask);
        iMask=iMask<<1;
    }
    

    
    return 0;
}