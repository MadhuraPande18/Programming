#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<string.h>

void DisplayN(char FName[], int iSize)
{
    int fd = 0;
    int iRet = 0;
    char Buffer[1024] = {'\0'};

    // Open the file
    fd = open(FName, O_RDONLY);

    if(fd == -1)
    {
        printf("Unable to open file\n");
        return;
    }

    // Read only iSize bytes
    iRet = read(fd, Buffer, iSize);

    // Display the characters
    write(1, Buffer, iRet);

    // Close the file
    close(fd);
}

int main()
{
    char FileName[30];
    int iValue = 0;

    printf("Enter file name : ");
    scanf("%29s", FileName);

    printf("Enter number of characters : ");
    scanf("%d", &iValue);

    DisplayN(FileName, iValue);

    return 0;
}