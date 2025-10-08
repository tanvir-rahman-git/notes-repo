#include<iostream>
using namespace std;

int main ()
{


    char option;
    cout<<"Enter an option : ";
    cin>>option;

    //switch(option){body}

    switch(option){
    case 'A':
        break;
    case 66:
        cout<<"You are 66"<<endl;
    case 'C':
        cout<<"You are C";//<<endl;
    case 'D':
        cout<<"You are D";//<<endl;
        break;
    default:
        cout<<"You are in default"<<endl;
    }


return 0;
}

