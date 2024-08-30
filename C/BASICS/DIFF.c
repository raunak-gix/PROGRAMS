#include<stdio.h>
int main()
{
    int a,b,c;
    printf("Enter 1st no...");
    scanf("%d",&a);
    printf("Enter 1st no...");
    scanf("%d",&b);
    if(a>b)
    {
        c=a-b;
    }
    else
    {
        c=b-a;
    }
    printf("Diff is %d.",c);
}