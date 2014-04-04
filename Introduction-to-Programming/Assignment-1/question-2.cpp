/* Assignment 1 Question 2
By Robert Cole
100481609
*/

#include <iostream>
#include <cmath>

using namespace std;

int main()
{
	double R1,R2,R3,R4;
	double Rtotal = 0;
	cout << "Enter the value of R1: ";
	cin >> R1;
	cout << "Enter the value of R2: ";
	cin >> R2;
	cout << "Enter the value of R3: ";
	cin >> R3;
	cout << "Enter the value of R4: ";
	cin >> R4;
	Rtotal = R1 + ((1/R2) + (1/R3) + (1/R4));
	cout << " The total resistance is : " << Rtotal << " Ohms";

	system("pause");
	return 0;
}
