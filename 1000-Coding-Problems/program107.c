 //call by refference
 #include<stdio.h>

 void Display(int *iPtr)    //iPtr=100,*iPtr=10;iptr++ = 104 ;*
 {      
    printf("%d\n",*iPtr);   //10 
    iPtr++;                 //forward by 4
    printf("%d\n",*iPtr);   //20
    iPtr++;
    printf("%d\n",*iPtr);      //30
 }
 
 int main()
 {
    int Arr[5]={10,20,30,40,50};
    
    Display(Arr);

    return 0;
 
 }

