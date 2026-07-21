 //call by refference
 #include<stdio.h>

 void Display(int Arr[],int iSize) 

 {      
    for(int iCnt=0;iCnt<iSize;iCnt++)
    {   
         printf("%d\n",Arr[iCnt]); 

    }
    
 }
 
 int main()
 {
    int Brr[]={10,20,30,40};
    
    Display(Brr,4);

    return 0;
 
 }

