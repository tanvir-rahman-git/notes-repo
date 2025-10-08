#include<iostream>
using namespace std;

int main()
{

       int i,N;

       cout << "Enter Number of elements :";
       cin>>N;
       int n=N;
       float a[N];
       float L1=0,L2=0;
       L1=a[0];
       for (  i = 0; i<n; i++){

              cout << " Enter Element :"<<endl;
              cin >> a[i];
       }


       for ( i = 1; i<n; i++){

              if (a[i]<L1)
              {
            L2=L1;
            L1=a[i];
              }

       else if(a[i]<L2 and a[i]>L1)

       L2=a[i];
       }

       cout<< " smallest Number is :" << L1<<endl;
       cout<< "Second smallest Number is :"<< L2<<endl;


       return 0;
}
