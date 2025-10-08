#include<iostream>

using namespace std;
int main()
{

    int arr[5];
    int N;
    cout<<"Enter 5 Array Elements: ";

    for(N=0; N<5; N++)
        cin>>arr[N];
    cout<<"The Original Array is: "<<endl;
    for(N=0; N<5; N++)
        cout<<arr[N]<<" ";
    cout<<"The Reverse of Given Array is: "<<endl;
    for(N=(5-1); N>=0; --N)
        cout<<
        arr[N] <<" ";
    cout<<endl;
    return 0;
}
