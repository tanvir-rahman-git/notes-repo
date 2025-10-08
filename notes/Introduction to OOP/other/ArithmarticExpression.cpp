#include<iostream>
#include<math.h>
using namespace std;

int main(){

    /*

        * , / , % have same precedence's
        +, - have same precedence's
        if operator has same priority then we have to check
            from left to right
    */
/*    int x;
    x =  3 * 4 / 2 + 3 - 1 ;
    cout << x <<endl;

    cout << 6 + 2 * 3 - 4 / 2<<endl;

    cout << 20 / 3 + 5 % 2<<endl;


    cout << 3 * (2 / 4.0) + (3-1)<<endl;
    cout << (6 + 2) * ((3 - 4) / 2)<<endl;
    cout << 20/(3+5) % 2 <<endl;



    //Quadratic Equation Solving using C++
    float a,b,c;

    cin>>a;
    cin>>b;
    cin>>c;

    float x1,x2;
    x1 = (-b+pow( pow(b,2) - 4*a*c ,1/2.0)) / (2*a);
    x2 = (-b-pow( pow(b,2) - 4*a*c ,1/2.0)) / (2*a);

    cout<<"X1 = "<< x1 <<endl;
    cout<<"X2 = "<< x2 <<endl;
*/

    int x=1, y =2, z = 3;
    cout << x++ * ++y % ++ z <<endl;

return 0;
}
