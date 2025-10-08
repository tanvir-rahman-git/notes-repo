#include <iostream>
using namespace std;
int main()
{
    int arr[10],even[10],odd[10],evncount=0,oddcount=0,N;
    cout<<"Input numbers in the array";
    for(N=0;N<10;N++)
        cin>>arr[N];
    for(N=0;N<10;N++)
    {
            if(arr[N]%2==0)
                even[evncount++]=arr[N];
            else
                odd[oddcount++]=arr[N];
    }
    cout<<"The even numbers are: "<<endl;
    for(N=0;N<evncount;N++)
        cout<<even[N]<<" ";
    cout<<"The odd numbers are: "<<endl;
    for(N=0;N<oddcount;N++)
        cout<<odd[N]<<" ";

    return 0;
}
