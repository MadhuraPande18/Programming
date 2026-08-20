#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>
#include<string.h>

int main()
{
    char FileName[50];
    char Data[100];
    int fd = 0;

    // Accept file name
    printf("Enter the file name : ");
    scanf("%s", FileName);

    getchar();      // Remove newline left by scanf()

    // Accept string
    printf("Enter the string : ");
    scanf("%[^\n]", Data);

    // Open the file in Write + Append mode
    fd = open(FileName, O_WRONLY | O_APPEND);

    if(fd == -1)
    {
        printf("Unable to open the file.\n");
        return -1;
    }

    // Write string at the end of the file
    write(fd, Data, strlen(Data));

    printf("String written successfully.\n");

    close(fd);

    return 0;
}