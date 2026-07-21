#include<stdio.h>
#include<stdlib.h>

int FirstOcc(int Arr[], int iLength, int iNo)
{
    int i = 0;
    for(i = 0; i < iLength; i++)
    {
        if(Arr[i] == iNo)
        {
            return i;   //return first index
        }
    }
    return -1;          //number not found
}

int main()
{
    int iSize = 0, iCnt = 0, iValue = 0,iRet=0;
    int *p = NULL;
    printf("Enter number of elements: ");
    scanf("%d", &iSize);

    printf("Enter the number to search: ");
    scanf("%d", &iValue);

    p = (int *)malloc(iSize * sizeof(int));

    if(p == NULL)
    {
        printf("Unable to allocate memory\n");
        return -1;
    }

    printf("Enter %d elements:\n", iSize);

    for(iCnt = 0; iCnt < iSize; iCnt++)
    {
        printf("Enter element %d: ", iCnt + 1);
        scanf("%d", &p[iCnt]);
    }

    iRet=FirstOcc(p,iSize,iValue);
    printf("Outout:%d\n",iRet);

    free(p);

    return 0;
}