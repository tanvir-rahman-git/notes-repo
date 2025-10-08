#include<iostream>

using namespace std;

int main()
{
	int N;
    float marks, total = 0, average;

    cout << "Please Enter the Total Number of subjects = ";
    cin >> N;

	cout << "Please Enter the Marks for each subjects = ";
	for(int i = 0; i < N; i++)
	{
		cin >> marks;
		total = total + marks;
	}
    average = total / N;


    cout << "Total Marks      = " << total<<endl;
    cout << "Average Marks    = " << average<<endl;

 	return 0;
}
