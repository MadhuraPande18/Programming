 //call by refference
 #include<stdio.h>

 void Display(int *iPtr)    //iPtr=100,*iPtr=10;iptr++ = 104 ;*
 {      
    printf("Value of iPtr:%d\n",iPtr)  ;
 }
 
 int main()
 {
    int Arr[5]={10,20,30,40,50};
    printf("Base address of Arr:%d\n",Arr); //Arr=100
    Display(Arr);

    return 0;
 
 }

