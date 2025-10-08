#include<iostream>
using namespace std;

int main ()
{
    int N,i,mremainder;

    cout<<"Enter integer number: ";

    cin>>N;

   // cout<<"enter integer number: ";

   // cin<<i;

    for(i=0;i<=N;i++)

    if(i>0){

        if(i%2 == 0){
            cout<<"Inside if's body"<<endl;
            cout<<"It is an Even Number"<<endl;
        }
        else{
            cout<<"Inside if's body"<<endl;
            cout<<"It is an Odd Number"<<endl;
        }
    }
    else {
        cout<<"You have entered a Negative number"<<endl;
    }


return 0;
}

