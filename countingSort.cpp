#include<iostream>
#include<string.h>

using namespace std;

//method prototypes
char * countSort(char *,int);


//main method to test the program
main() {
	cout<<"Enter string to sort"<<endl;
	char str[100];	
	char * s;
	cin>>str;
	//s=str;
	//find lenght of str
	int l=strlen(str);
	s=countSort(str,l);
	cout<<s<<endl;
}
//end of main

//method definitions

char * countSort(char *str,int l) {
	//create count array
	int count[256];

	//fill count array with zeros
	for(int i=0;i<256;i++) {
		count[i]=0;
	}
	
	//fill counts of values
	for(int i=0;str[i];i++) {
		count[str[i]]++;
		cout<<str[i]<<"	"<<count[str[i]]<<endl;
	}

	//create count sum array
	for(int i=1;i<256;i++) {
	//	count[str[i]]=count[str[i]]+count[str[i-1]];
		count[i]=count[i]+count[i-1];
		
	}


	//create an output array of characters
	char output[l];
	for(int i=0;i<l;i++) {
		output[count[str[i]]-1]=str[i];
		count[str[i]]--;
	}
	return output;
}
