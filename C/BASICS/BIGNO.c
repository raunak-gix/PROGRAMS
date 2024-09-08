#include<stdio.h>
int main()
{
    int a,b,c;
    printf("Enter all the nos...");
    scanf("%d %d %d",&a,&b,&c);
    if(a>b)
    {
        if(a>c)
        {
            printf("%d is max.",a);
        }
        else if(a<c)
        {
            printf("%d is max.",c);
        }
    }
    else
    {
        if(b>c)
        {
            printf("%d is max.",b);
        }
        else if(b<c)
        {
            printf("%d is max.",c);
        }
    }
    return 0;
}