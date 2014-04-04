/*Assignment 2, Question 1
By Robert Cole
100481609*/

#include <iostream>

using namespace std;
int main()
{
/* red car will be represented by 1, blue car will be 2. Capitals represent the total after the collision.
for the conveinience of coding, the velocity and mass has been converted before hand*/
double V(13.41), M, m1(907.2), m2, v2;

cout << "Please enter a mass for the blue car in pounds:";
cin >> m2;

// Mathematical operations
m2 = m2*0.4536;
v2 = ((m1+m2)*V)/m2;
//conversion back into mph
v2 = v2/0.447;

//checking if the blue car was under the speed limit
if (v2 > 65)
	cout << "The blue car was speeding!\n";
else
	cout << "The blue car was under the speed limit\n";
system ("pause");
return 0;
}