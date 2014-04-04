/* Assignment 1, Question 1
By Robert Cole
due tuesday, February 12th 2013 */

#include <iostream>
#include <cmath>
#include <iomanip>

using namespace std;

//defining pi as it is a constant
double PI = acos(-1.0);

int main ()
{
	//initialize variables
double a,b,Area;

// user defines the perameters of the ellipse
cout << "please define A:" << endl;
cin >> a;
cout << "please define B:" << endl;
cin >> b;

//calculations
Area = a*b*PI;

//display results
cout << "The area of the ellipse is: " << setprecision (5) << Area << endl;

// end
system ("pause");
return 0;
}