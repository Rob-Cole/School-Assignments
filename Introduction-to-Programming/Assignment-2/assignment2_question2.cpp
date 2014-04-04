/* Assignment 2, Question 2
By Robert Cole
100481609 */

/* IMPORTANT!!! *** Glitch in the program when user enters a non numerical input. More advanced functions are required to fix this.
the program needs to be terminated in this event. */

#include <iostream>
#include <string>

using namespace std;
int main()
{
//Initializing variables
int card_number ,one, two, three, four, five, six, seven, eight, even, odd, total, check;
char Response = 'C';
char validity = 'N';

//do while loop enables user to continue use of the program until terminated by entering 'e' or 'E' at the end of the program
do {
cout << "Please enter the last 8 digits of a credit card number:";
cin >> card_number; // ** Glitch occurs when the user enters a string instead of a number. Program needs to be terminated in this event. **



// Breaking appart the credit card number into individual numbers that can be calculated
eight = card_number % 10;
seven = card_number / 10 % 10;
six = card_number / 100 % 10;
five = card_number / 1000 % 10;
four = card_number / 10000 %10;
three = card_number / 100000 % 10;
two = card_number / 1000000 % 10;
one = card_number / 10000000 % 10;

//Calculations to find the total number
even = two + four + six + eight;
odd = (2*one) %10 + (2*one)/10%10 + (2*three)%10 + (2*three)/10%10 + (2*five)%10 + (2*five)/10%10 + (2*seven)%10 + (2*seven)/10%10;// breaking the doubled numbers into individual ones
total = even+odd;

// Checks if the total does end in zero as according to the algorithim
if ((total % 10) > 0) {
	cout << "This is not a valiud credit card number!\n";
	if (eight > total%10) {
		check = eight - total%10;}
	else {
		check = total%10 - eight;}
	cout << "The last digit should be " << check << " to make this credit card number valid." << endl;}
else {
	cout << "The credit card is valid!\n" << endl;}

// User is propted to enter another credit card number or terminate the program
cout << "Enter C if you would like to enter another credit card number\n";
cout << "Enter E to exit the program\n Please enter C or E : ";
cin >> Response;

// This is to make sure the users enter a valid input to either terminate or continue the program
do {
switch(Response){
	case 'c': 
		Response = 'C';
		validity = 'Y';break;
	case 'e': 
		Response = 'E';
		validity = 'Y'; break;
	case 'C': 
	case 'E': validity = 'Y'; break;
	default: cout << "Response not valid. Please enter either C or E: ";
		cin >> Response;
		validity = 'N';}}
while (validity == 'N');
}

while (Response == 'C');
system("pause");
return 0;
}