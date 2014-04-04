/*Assignment 2, Question3
by Robert Cole
100481609*/

#include <iostream>
#include <iomanip>

using namespace std;
int main()
{
	//Initializing varriables
	double k(0.5), Ro(50), Rs(75), Vs(20), Vm, T(0), R;
	
	/* For loop runs the calculations required to determine the value of voltage based on the Temerature
	the use of n as a counter for the amount of times this loop is preformed will allow the user to see
	the values of volts for 0 - 100 degrees at invervals of 10 */
	cout << "   Temperature		     Voltage \n";
	for (int n = 11; n>0; n--)
	{
		R = Ro + k*T;
		Vm = (R/(Rs+R))*Vs;
		cout << "	" << T << "	======>		" << setprecision (4) << Vm << " V" << endl;
		T = T + 10;
	}
system ("pause");
return 0;
}
