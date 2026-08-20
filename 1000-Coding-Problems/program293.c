#include<stdio.h>
int main()
{
    void ReverseDisplay(char *str)
    {
        char *start = NULL;
        start=str;
        while (*str != '\0')
        {
            str++;
        }

          str--;

        while(start<=str)
        {
            printf("%c",*str);
            str--;
        }

        printf("\n");
        
    }
    char Arr[50]={'\0'};
    printf("Enter starting:\n");
    scanf("%[^\n]s",Arr);
    ReverseDisplay(Arr);
        return 0;
}