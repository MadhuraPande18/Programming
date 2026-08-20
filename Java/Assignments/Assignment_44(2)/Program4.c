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
    int iSize=0;

    printf("Enter the filename:");
    scanf("%s",FileName);

    fd=open(FileName,O_CREAT,O_RDONLY);

    if(fd==-1)
    {
        printf("unable to open the file");
        return -1;
    }

    
    // Read the contents of the file into the buffer
   while((iRet=read(fd,Buffer,BUFFER_SIZE))!=0)
   {
        iSize=iSize+iRet;
   }
    printf("File size is : %d bytes\n", iSize);

    printf(Buffer);
    close(fd);

    return 0;
}