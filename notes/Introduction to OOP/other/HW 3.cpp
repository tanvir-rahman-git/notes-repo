#include<iostream>
#include<math.h>

using namespace std;

int main()
{
int digits,a_number,sum=0;
cout<<"Enter any Digits:";
cin>>a_number;

while (a_number!=0)
{

digits=a_number%10;
sum = sum +digits;
a_number=a_number/10;

}
cout<<"Sum of digits:"<<sum<<endl;
return 0;
}
