#include<stdio.h>

void display(int iNo)
{
    int iCnt=0;

    //filter
    if(iNo<0)
    {
        printf("Invalid input\n");
        return 0;
    }
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