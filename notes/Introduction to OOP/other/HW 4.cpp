#include <iostream>
using namespace std;
int main()
{
    int first_num, second_num, GCD;

    cout << " Input the first number: ";
    cin >> first_num;
    cout << " Input the second number: ";
    cin >> second_num;

    for (int i = 1; i <= first_num && i <= second_num; i++)
    {
        if (first_num % i == 0 && second_num % i == 0)
        {
            GCD = i;
        }
    }
    cout << " The Greatest Common Divisor is: " << GCD << endl;
    return 0;
}
