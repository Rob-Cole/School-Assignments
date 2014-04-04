#include <iostream>
#include <fstream>
#include <string>

using namespace std;

string filename;
string word;
string dictarr[198];
/**************************************************************
* This function takes a word from input file stream (i.e. *
* bonk.txt) and removes punctuation marks. Then, the function*
* updates the word in the caller argument (if necessary) *
* @param word a string that contains a word to be filtered *
**************************************************************/
void wordFilter(string& word)
{
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
}
/**************************************************************
* This function returns true if a word in input file stream *
* (i.e. bonk.txt) is in the dictionary, false otherwise. *
* @param word a string that contains a word to be checked *
* @return the Boolean status of the word (i.e. true or false)*
**************************************************************/
bool inDictionary(string word, string dictionary[])
{
	bool spelling = false;
	for (int i = 0; i < 198; i++)
	{
		if (stricmp(word.c_str(),(dictarr[i]).c_str())==0) //compares weather or not each value in the dictionary array is the same as the string from the txt file
			spelling = true;
	}
	if (spelling == true)
		return true;
	else
		return false;
}
/**************************************************************
* This function takes in a filename and spells check it *
* @param file an input file stream (i.e. bonk.txt) *
***************************************************************/
void spell(string filename)
{
ifstream file, dictionary;

dictionary.open("dictionary.txt");
	for (int i=0; i < 198; i++)
	{
		dictionary >> dictarr[i];
	}
file.open(filename.c_str());

while (!file.eof()) // pulls word from the txt file until it is finished
{
string word;
file >> word;

wordFilter(word);

bool spelling;
spelling = inDictionary(word,dictarr);
if (word.find_first_not_of("0123456789") > 0)
{
	spelling = true;
}

if (spelling == false)
	cout << word <<endl;
}
}

/**************************************************************
* This is the main function of the program. *
* @return a value to terminate the program successfully *
**************************************************************/
int main()
{
cout << "Please enter the file to be spell checked:";
cin >> filename;
spell(filename);
system("pause");
return 0;
}