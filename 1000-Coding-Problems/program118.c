 //call by refference
 #include<stdio.h>

 int Summation(int Arr[],int iSize) 

 { 
    int iCnt=0;
    int iSum=0;
    int iRet=0;

    for(int iCnt=0;iCnt<iSize;iCnt++)
    {   
       iSum=iSum+Arr[iCnt];    }
    
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

