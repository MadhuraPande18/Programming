#include<stdio.h>

void display(int iNo)
{
    int iCnt=0;
    for(int iCnt=1;iCnt<=iNo;iCnt++)
    {
        printf("Jay Ganesh\n");
    }

}
int main()
{
    int iValue=0;
    printf("Enter the frequency");
    scanf("%d",&iValue);
    //iteration

    display(iValue);
    
    return 0;
}