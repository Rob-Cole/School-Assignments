/*Assignemnt 3, Question 1
~ Spell Checker ~
By Robert Cole 100481609 */

#include <iostream>
#include <fstream>
#include <string>

using namespace std;
int main()
{

// initializing variables
string input, word, dict;
ifstream bonk, dictionary;


// Promts user for input
 cout << "please enter text file name: ";
 cin >> input;

// open the text file that the user specifies and checks for errors in opening the file
bonk.open(input.c_str());
if (bonk.fail()) {
	cerr << "There has been an error opening the file";
	exit(1); }

// loop that pulls the strings out of the text file and compares to the strings in the Dictionary
while (!bonk.eof())
{
	bonk >> word;
	bool spell=false;

	// Removes all punctuation from the string
	int found = word.find(".");
		while (found >= 0)
		{
		word.replace(found,1,"");
		found = word.find(".");
		}
		found = word.find("(");
		while (found >= 0)
		{
		word.replace(found,1,"");
		found = word.find("(");
		}
		found = word.find(")");
		while (found >= 0)
		{
		word.replace(found,1,"");
		found = word.find(")");
		}
		found = word.find(",");
		while (found >= 0)
		{
		word.replace(found,1,"");
		found = word.find(",");
		}
		found = word.find(":");
		while (found >= 0)
		{
		word.replace(found,1,"");
		found = word.find(":");
		}
		found = word.find("\"");
		while (found >= 0)
		{
		word.replace(found,1,"");
		found = word.find("\"");
		}
		found = word.find("?");
		while (found >= 0)
		{
		word.replace(found,1,"");
		found = word.find("?");
		}
		found = word.find(";");
		while (found >= 0)
		{
		word.replace(found,1,"");
		found = word.find(";");
		}
		found = word.find("-");
		while (found >= 0)
		{
		word.replace(found,1,"\n");
		found = word.find("-");
		}
		//opens the dictionary for the next loop that pulls the words from it
		dictionary.open("dictionary.txt");

		while (!dictionary.eof())
		{
		dictionary >> dict;
			// compares the two strings and checks for discrepencies
			if (stricmp(word.c_str(),dict.c_str())==0)
			{
			spell = true;
			}
		}

		dictionary.close(); //closed at the end so that the next word from bonk is compared to all the words in dictionary
		
		// if the word contains numbers, then the spelling is assumed true
		if (word.find_first_not_of("0123456789") > 0)
		{
			spell = true;
		}

		if (spell == false )
		cout << word << endl;
		
		
}

bonk.close();


system("pause");
return 0;
}