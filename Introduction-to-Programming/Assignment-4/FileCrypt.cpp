#include <iostream>
#include <fstream>
#include <string>

using namespace std;
ifstream file;
string infile, outfile, compare;
ofstream ofile;
char c,E;


char ceaserCipher(char c, int key);
char ceaserDecipher(char c, int key);


/**************************************************************
* This function encrypts the content of infile and saves the *
* encrypted text into outfile *
* @param infile string (file that has raw text) *
* @param outfile string (file that will have encrypted text) *
**************************************************************/

void encrypt(string infile, string outfile)
{ 
	file.open(infile); //open the file
	if (file.fail()) //if the file doesnt open properly, terminate the program
		{
		cerr << "there has been an error opening the file";
		exit(1);
		}
	while (true) // continually will encrypt strings pulled from the .txt
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
int main(int argc, char* argv[])
{
	// setting the argv values into global varriables
	compare = argv[1];
	infile = argv[2];
	outfile = argv[3];
	// running either encrypt or decrypt based on user input
if (compare == "-encrypt")
	encrypt(infile,outfile);
	
if (compare == "-decrypt")
	decrypt(infile,outfile);

return 0;
}