#include<iostream>
using namespace std;

int main()
{
       // float a[3];
       int  i,N,pos1, pos2;
       cout << "Number of Students :"<<endl;
       cin>>N;
       int n=N;
       float a[N];
       float L1=0,L2=0;
       for (i = 0; i<N; ++i)
       {
              cout << " Enter " << (i + 1) <<" Students Miid Teram Marks :"<<endl;
              cin >> a[i];
       }

       for (int i=0;i<n;i++){
           if(a[i]>L2 and i!=pos1){
                  L2=a[i];
                  pos2=i;
           }
       }
       for (int i=0;i<n;i++){
           if(a[i]>L1){
                  L1=a[i];
                  pos1=i;
           }
       }

       cout << " Lowest Mark :" << L1 << " at position " << (pos1 + 1)<<endl;
              cout << "Second Lowest Mark :"<< L2 << " at position " << (pos2 + 1)<<endl;


       return 0;
}
