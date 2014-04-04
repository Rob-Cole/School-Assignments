/* Assignment 3 Question 2
~ Encryptor and Decryptor ~
By Robert Cole 100481609 */

#include <iostream>
#include <string>
#include <fstream>

using namespace std;

int main ()
{
	// Initializing variables
	int UI;
	string filename, Out;
	char c,E,check;
	ifstream file;
	ofstream outfile;
	bool valid(false);

	// Program begins by prompting the user
	cout << "Welcome to ENGR1200U Cryptographic Techniques Program\n" << endl;

	do //repeats the funciton for the user until terminated at the end
	{
	cout << "Please enter your selection:\n" << endl;
	cout << "	1. Encrypt\n";
	cout << "	2. Decrypt\n";
	cin >> UI;
	
	// Encryptor algorithm
	if (UI == 1)
	{
		cout << "Please enter the file that you would like to encrypt\n";
		cin >> filename; // user enters the file name.
		file.open(filename.c_str()); //open the file
		if (file.fail()) //if the file doesnt open properly, terminate the program
		{
		cerr << "There was an error opening the indicated file.\n";
		exit(1);
		}
		cout << "Please enter the file that you would like to output to:\n";
		cin >> Out;
		while (true) // continue to pull characters from the file untill file.eof()
		{
		c = file.get();
			if (file.eof()) break;
		
			// If the char ASCII value is within A - Z, it will encrypt, else E = c
			if ((int)c > 64)
			{
				if ((int)c < 91)
					E = (( ((int)c) - ((int)'A')+5)%26 + (int)'A');
			}
			else
				E = c;

			// Output the char to a new .txt, appened to the end of the current document
		ofstream outfile;
		outfile.open (Out.c_str(), ios::app);
			if (E == ')')
			{
			outfile << '\n' ;
			}
			else 
			outfile << E;
			outfile.close();
		}
		file.close();
	}

	// Decryption Algoritm
	if (UI == 2)
	{
	cout << "Please enter the file that you would like to decrypt\n";
	cin >> filename;
	cout << "Please enter the file that you would like to output to:\n";
	cin >> Out;
	file.open(filename.c_str()); 
		if (file.fail()) //if the file doesn't open properly
		{
		cerr << "There was an error opening the indicated file.\n";
		exit(1);
		}
		while (true)
		{
		c = file.get();
			if (file.eof()) break;
			// If the char ASCII value is within A - Z, it will encrypt, else E = c
			if ((int)c > 64)
			{
				if ((int)c < 91)
				{
					E = (( ((int)c) - ((int)'A')-5));
					if (E<0)
						E = (E+26)%26 + (int)'A';
					else
						E = E%26 + (int)'A';
				}
			}
			else
				E = c;
				
		outfile.open (Out.c_str(), ios::app);
			if (c == '\n')
			{
			outfile << '\n';
			}
			else 
			outfile << E;
		outfile.close();
		}
	file.close();
	}
	cout << "The file has been encrypted, please look into the directory to find it.\n" << endl;

	cout << "Do you wish to encrypt/decrypt another file?\n" << "Press C to continue or E to exit\n";
	cin >> check;
	// loop created to ensure the user enters a proper character into the prompt	
	do 
	{
		switch (check)
		{
			case 'c':
				check = 'C';
				valid = true;
				break;
			case 'e':
				check = 'E';
				valid = true;
				break;
			case 'C':
			case 'E':
				valid = true;
				break;
			default:
				cout << "You have entered an invalid character. Please input C or E.";
				cin >> check;
				valid = false;
		}
	}	
	while (valid == false);

	
	}
	while (check == 'C');

system ("pause");
return 0;
}