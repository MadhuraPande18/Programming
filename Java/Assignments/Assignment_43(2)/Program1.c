#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<string.h>

#define BUFFER_SIZE 1024

int CountCapital(char *FileName)
{
    char Buffer[BUFFER_SIZE] = {'\0'};
    int fd = 0, iRet = 0, iCount = 0, i = 0;

    // Open the file in Read Only mode
    fd = open(FileName, O_RDONLY);
    if(fd == -1)
    {
        printf("Unable to open file\n");
        return -1;
    }

    // Read the file until end of file
    while((iRet = read(fd, Buffer, sizeof(Buffer))) != 0)
    {
        // Check each character
        for(i = 0; i < iRet; i++)
        {
            if((Buffer[i] >= 'A') && (Buffer[i] <= 'Z'))
            {
                iCount++;
            }
        }

        // Clear the buffer
        memset(Buffer, '\0', sizeof(Buffer));
    }

    close(fd);

    return iCount;
}

int main()
{
    char Fname[30] = {'\0'};
    int iRet = 0;

    printf("Enter the file name : ");
    scanf("%29s", Fname);

    iRet = CountCapital(Fname);

    if(iRet != -1)
    {
        printf("Number of capital letters are : %d\n", iRet);
    }

    return 0;
}