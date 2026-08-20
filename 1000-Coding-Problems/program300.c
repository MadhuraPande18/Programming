#include<stdio.h>

void StrrevX(char *str)
{
    char *start = NULL;
    char *end = NULL;
    char temp = '\0';

    start = str;

    while(*str != '\0')
    {
        str++;
    }

    end = str - 1;

    while(start <= end)
    {
        temp = *start;
        *start = *end;
        *end = temp;

        start++;
        end--;
    }
}

int main()
{
    char Arr[50] = {'\0'};

    printf("Enter string:\n");
    scanf("%[^\n]s", Arr);

    StrrevX(Arr);

    printf("Updated string is : %s\n", Arr);

    return 0;
}