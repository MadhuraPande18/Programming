#include<stdio.h>
#include<fcntl.h>
#include<unistd.h>


int main()
{
    char FileName[50];
    int fd=0;

    printf("Enter the filename:");
    scanf("%s",FileName);

    fd=open(FileName,O_RDONLY);

    if(fd==-1)
    {
        printf("unable to open the file");
    }

    else
    {
        printf("File opened successfully\n");
        printf("file descriptor is:%d\n",fd);
    }

    close(fd);
}