#include<iostream>
using namespace std;

int main(){

int a,b,i,sum=0;
cout<<"enter first number:"<<endl;
cin>>a;
cout<<"enter second number:"<<endl;
cin>>b;

for (i=a;i<b;i=i+1){if (i%2==0){
cout<<i<<endl;
sum=sum+i;
cout<<"Total="<<sum;}
}
return 0;
}
