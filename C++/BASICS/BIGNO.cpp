#include<iostream>
using namespace std;
int main()
{
    int a,b,c;
    cout<<"Enter the nos...";
    cin>>a>>b>>c;
    if(a>b)
    {
        if(a>c)
        {
            cout<<a<<" is max.";
        }
        else if(a<c)
        {
            cout<<c<<" is max.";
        }
    }
    else
    {
        if(b>c)
        {
            cout<<b<<" is max";
        }
        if(b<c)
        {
            cout<<c<<" is max.";
        }
    }
    return 0;
}