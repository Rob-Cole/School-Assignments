#include <iostream>
#include <fstream>
#include <string>

using namespace std;
int UI;
string infile, outfile;
char c,E, check('Y');
ifstream file;
ofstream ofile;

char ceaserCipher(char c, int key);
char ceaserDecipher(char c, int key);

/**************************************************************
* This function displays the menu options as in the handout *
**************************************************************/
void displayMenu()
{ cout << "Welcome to ENGR1200U Cryptographic Techniques Program\n" << endl;
cout << "Please enter your selection:\n" << endl;
cout << "	1. Encrypt\n";
cout << "	2. Decrypt\n";}

/**************************************************************
* This function encrypts the content of infile and saves the *
* encrypted text into outfile *
* @param infile string (file that has raw text) *
* @param outfile string (file that will have encrypted text) *
**************************************************************/

void encrypt(string infile, string outfile)
{ 
	file.open(infile.c_str()); //open the file
	if (file.fail()) //if the file doesnt open properly, terminate the program
		{
		cerr << "There was an error opening the indicated file.\n";
		exit(1);
		}
	while (true)  // continually will encrypt the strings pulled from the .txt
	{
	c = file.get();
		if (file.eof()) break;
	if ((int)c > 64)
		{if ((int)c < 91)
		ceaserCipher(c,5);}
	else
		E=c;
	
	ofstream ofile;
	ofile.open (outfile.c_str(), ios::app);
			if (E == ')')
			{
			ofile << '\n' ;
			}
			else 
			ofile << E;
			ofile.close();
		}
		file.close();
	}
	/**************************************************************
* This function decrypts the content of infile and saves the *
* decrypted text into outfile *
* @param infile string (file that has encrypted text) *
* @param outfile string (file that will have decrypted text) *
**************************************************************/
void decrypt(string infile, string outfile)
{ file.open(infile.c_str()); //open the file
	if (file.fail()) //if the file doesnt open properly, terminate the program
		{
		cerr << "There was an error opening the indicated file.\n";
		exit(1);
		}
	while (true) // continually will decrypt the strings pulled from the .txt
	{
	c = file.get();
		if (file.eof()) break;
	if ((int)c > 64)
		{if ((int)c < 91)
		ceaserDecipher(c,5);}
	else
		E=c;
	
	ofstream ofile;
	ofile.open (outfile.c_str(), ios::app);
			if (E == ')')
			{
			ofile << '\n' ;
			}
			else 
			ofile << E;
			ofile.close();
		}
		file.close(); }
/**************************************************************
* This function takes an character and a cipher key to return*
* an encrypted character. *
* @param c is a char (the character to be encrypted) *
* @param key is an integer (cipher key given in the handout) *
**************************************************************/
char ceaserCipher(char c, int key)
{return E = (( ((int)c) - ((int)'A')+5)%26 + (int)'A');}
/**************************************************************
* This function takes an encrypted character and a cipher key*
* to return a decrypted character. *
* @param c is a char (the character to be decrypted) *
* @param key is an integer (cipher key given in the handout) *
**************************************************************/
char ceaserDecipher(char c, int key)
{E = (( ((int)c) - ((int)'A')-5));
	if (E<0)
		E = (E+26)%26 + (int)'A';
	else
		E = E%26 + (int)'A';
return E;}

/**************************************************************
* This is the main function of the program. *
* @return a value to terminate the program successfully *
**************************************************************/
int main()
{
while (check == 'Y')
{
displayMenu();
cin >> UI;
cout << endl << "Please enter the input file:";
cin >> infile;
cout << endl << "Please enter the output file name:";
cin >> outfile;

if (UI==1)
	encrypt(infile,outfile);
if (UI==2)
	decrypt(infile,outfile);

cout << "would you like to encrypt/ decrypt annother file? Y/N"; // user inputs weather or not tey would like to contiune the opperation of the program
cin >> check;
}
return 0;
}