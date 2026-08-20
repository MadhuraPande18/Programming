#include<stdio.h>
int main()
{
    void ReverseDisplay(char *str)
    {
        printf("%s\n",str);
    }
    char Arr[50]={'\0'};
    printf("Enter starting:\n");
    scanf("%[^\n]s",Arr);
    ReverseDisplay(Arr);
        return 0;
}