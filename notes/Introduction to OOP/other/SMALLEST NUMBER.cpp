#include<iostream>
using namespace std;

int main()
{

       int i,N;

       cout << "Enter Students Miid Teram Marks :";
       cin>>N;
       int n=N;

       float arr[N];
       for (int  i = 0; i<N; i++){

              cout << " Enter Element :"<<endl;
              cin >> arr[i];
       }
        float L1,L2;
        L1=arr[0];

       for (int i = 1; i<n; i++){

              if (arr[i]<L1)
              {
            L2=L1;
            L1=arr[i];
              }

       else if(arr[i]<L2 and arr[i]>L1)

       L2=arr[i];
       }

       cout<< " Lowest Number is :" << L1<<endl;
       cout<< "Second Lowest Number is :"<< L2<<endl;


       return 0;
}
