#include<stdio.h>
//call by value
void swap(int no1,int no2)
{
    int no1=11;
    int no2=21;
    int temp=0;
    temp=no1;
    no1=no2;
    no2=temp;

}
int main()
{   
     int no1=11;
    int no2=21;
    swap(11,21)
     printf("%d\n",i);
    printf("%d\n",j);
   
    return 0;
}