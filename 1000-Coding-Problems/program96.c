 #include<stdio.h>
 int main()
 {
    int Arr[7];
    Arr[0]=10;
    Arr[1]=20;
    Arr[6]=30;
    printf("%d\n",sizeof(Arr));    //4*5
    printf("%d\n",Arr[0]);
    printf("%d\n",Arr[3]);
    printf("%d\n",Arr[6]);
    printf("%d\n",Arr[7]);


    
    return 0;
 }