#include<iostream>
using namespace std;
int main()
  {
      int arr[6],even[6],evencount=0,N;/*take 1,2,3,4,5,6*/

      cout<<"Input numbers in the array";

       for(N=0;N<6;N++)
        cin>>arr[N];

        for(N=0;N<6;N++)
    {
            if(arr[N]%2==0)
                even[evencount++]=arr[N];

    }
    cout<<"The even numbers are: "<<endl;
    for(N=0;N<evencount;N++)
        cout<<even[N]<<" ";
cout<<"reverse number of even"<<endl;
         for(N=N-1 ;N>=0 ;N--)
        {
          cout<<even[N]<<" ";
        }
        return 0;
  }
