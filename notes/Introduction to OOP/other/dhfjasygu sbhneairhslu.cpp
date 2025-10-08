#include<iostream>
using namespace std;
int main()
{
    int Decimal_number;

    int binary;

    cout<<"Enter A Decimal number: ";

    cin>>Decimal_number;

    cout<<"Convert to binary:";

    while(Decimal_number>0)
        {

        binary=Decimal_number%2;

        cout<<binary;

        Decimal_number=Decimal_number/2;
    }
    for(binary=binary-1;binary>=0;binary--)
    {
        cout<<"Binary the given number="<<binary;
    }
    return 0;
}
