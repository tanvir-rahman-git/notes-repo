#include <iostream>
using namespace std;

int main()


{


	int XY;
	cout << "Enter size of array: "<<endl;
	cin >> XY;

	char str[XY];
	int count;

	cout << "Enter a string to test :"<<endl;


	for (int i = 0; i < XY; i++)


	{


		cin >> str[i];


	}



    cout<<"Vowels in string: "<<endl;
	for (int i = 0; str[i] != '\0'; i++)



	{
		if (str[i] == 'a' || str[i] == 'A')


		{

			cout << str[i] << " "<<endl;

		}

		else if (str[i] == 'e' || str[i] == 'E')

		{

			cout << str[i] << " "<<endl;
		}

		else if (str[i] == 'i' || str[i] == 'I')

		{

			cout << str[i] << " "<<endl;
		}

		else if (str[i] == 'o' || str[i] == 'O')

		{

			cout << str[i] << " "<<endl;
		}

		else if (str[i] == 'u' || str[i] == 'U')

		{

			cout << str[i] << " "<<endl;

		}
	}

	return 0;
}
