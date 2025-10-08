#include<iostream>
using namespace std;
int main()
{
    int a[10],Decimal_number,binary;

    cout<<"Enter A Decimal number: ";

    cin>>Decimal_number;

    for(binary=0;Decimal_number>0;binary++)
        {

        a[binary]=Decimal_number%2;

        Decimal_number=Decimal_number/2;
        }
        cout<<"Binary of the given number=";

        for(binary=binary-1 ;binary>=0 ;binary--)

        {
          cout<<a[binary];
        }

    return 0;
}
