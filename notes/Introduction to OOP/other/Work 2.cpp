#include<iostream>
using namespace std;

int main()

{

int a,factorial=1;

cout<<"enter the number:";

cin>>a;

for(int i=1;i<=a;i++)
    {factorial=factorial*i;}

cout<<"factorial number is:"<<factorial<<endl;


return 0;

}
