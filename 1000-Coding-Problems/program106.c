 //call by refference
 #include<stdio.h>

 void Display(int *iPtr)    //iPtr=100,*iPtr=10;iptr++ = 104 ;*
 {      
    printf("%d\n",*iPtr);  
    iPtr++;                 //forward by 4
    printf("%d\n",*iPtr);
    iPtr++;
    printf("%d\n",*iPtr);
 }
 
 int main()
 {
    int Arr[5]={10,20,30,40,50};
    
    Display(Arr);

    return 0;
 
 }

