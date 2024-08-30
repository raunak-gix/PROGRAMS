#include<iostream>
using namespace std;
int main()
{
    int a,b,c;
    cout<<"Enter 1st no...";
    cin>>a;
    cout<<"Enter 2nd no...";
    cin>>b;
    if(a>b)
    {
        c=a-b;
    }
    else
    {
        c=b-a;
    }
    cout<<"Diff is "<<c<<".";
}