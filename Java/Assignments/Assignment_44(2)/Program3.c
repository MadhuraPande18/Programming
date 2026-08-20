#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>
#define BUFFER_SIZE 1024

int main()
{
    char FileName[50];
    char Buffer[BUFFER_SIZE];
    int fd=0;
    int iRet=0;

    printf("Enter the filename:");
    scanf("%s",FileName);

    fd=open(FileName,O_CREAT,O_RDONLY);

    if(fd==-1)
    {
        printf("unable to open the file");
    }

    else
    {
        printf("File opened successfully\n");
        printf("file descriptor is:%d\n",fd);
    }

    // Read the contents of the file into the buffer
    iRet=read(fd,Buffer,BUFFER_SIZE);

    if(iRet==-1)
    {
        printf("Unable to read the file\n");
    }

    else
    {
       Buffer[iRet] = '\0';   // Null terminate the string
       printf("Contents of the file are\n:");
       printf("%s",Buffer);
    }

    close(fd);

    return 0;
}