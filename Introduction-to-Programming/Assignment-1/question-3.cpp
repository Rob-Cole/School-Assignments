/* Assignment 1 Question 3
By Robert Cole
100481609 */
#include <iostream>
#include <cmath>
#include <iomanip>

using namespace std;
int main ()
{
	//Initialize variables
	double Vt(120),P(260),pf,R(10);
	double Vs = 0, RP = 0;
	
	//User defines the input
	cout << "Enter the power factor, pf: ";
	cin >> pf;
	
	//Matematic opperations
	RP = 2*R*P;// enables the mathematical opperations to be coded easily
	Vs = sqrt(((Vt+(RP/Vt))*(Vt+(RP/Vt))) + ((RP/(Vt*pf))*(RP/(Vt*pf))) * (1-pf*pf));
	
	//Displays all variables and the relations between pf and Vs
	cout << "P = " << P << " W, R = " << R << " Ohms, and Vt = " << Vt << " Vrms/n";
	cout << "Vs = " << setprecision (5) << Vs << " Vrms" << endl;

	//end
	system ("pause");
	return 0;
}