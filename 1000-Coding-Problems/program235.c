#include<stdio.h>
#include<string.h>
int main()
{
    char str[]="Jay Ganesh!";
    printf("%s\n",str);
    int iRet=0;
    iRet=strlen(str);
    printf("length of string is:%d\n",strlen(str));
    iRet=sizeof(str);
    printf("size of string is:%d\n",iRet);
    return 0;
}