#include<iostream>
using namespace std;

int main()
{

       int N;

       cout << "Enter Number of elements :";
       cin>>N;

       int arr[N];
       for (int  i = 0; i<N; i++){

              cout << " Enter Element :"<<endl;
              cin >> arr[i];
       }
        int smallest,second_smallest;
        smallest=arr[0];

       for (int i = 1; i<N; i++){

              if (arr[i]<smallest)
              {
            second_smallest=smallest;
            smallest=arr[i];
              }

       else if(arr[i]<second_smallest and arr[i]>smallest)

       second_smallest=arr[i];
       }

       cout<< " smallest Number is :" << smallest<<endl;
       cout<< "Second smallest Number is :"<< second_smallest<<endl;


       return 0;
}
