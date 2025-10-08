#include<iostream>
using namespace std;

int main(void)
{
       float a[3],i,N;
       float  highest = 0, second_highest = 0, pos1, pos2;
       cout << "Number of Students :"<<endl;
       cin>>N;
       for (i = 0; i<N; ++i)
       {
              cout << " Enter " << (i + 1) <<" Students Miid Teram Marks :"<<endl;
              cin >> a[i];
       }
       for (i = 0; i<3; ++i)
       {
              if (a[i]>highest)
              {
                     highest = a[i];
                     pos1 = i;
              }
       }

       for (i = 0; i<3; ++i)
       {
              if (a[i]>second_highest)
              {
                     if (a[i] == highest)
                           continue;
                     second_highest = i;
                     pos2 = i;
              }
       }
       cout << " Largest Number :" << highest << " at position " << (pos1 + 1)<<endl;
              cout << "Second Largest Number :"<< second_highest << " at position " << (pos2 + 1)<<endl;


       return 0;
}
