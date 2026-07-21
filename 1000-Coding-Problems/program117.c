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
    int ilength=4;
    int Brr[ilength];
      scanf("Enter the numbers\n");
    for(int iCnt=0;iCnt<ilength;iCnt++)
    {
      
           Display(Brr,ilength);

    }
   
    
 
    return 0;
 
 }

