#include<iostream>
#include<string.h>
using namespace std;

int main(){

    char word[] = {'H','E','L','L','O','!','\0'};// '\0' is called null character
    char str[] = "HELLO\0world";
    char str1[] = {'H','E','L','L','O','!','\0'};

    char msg1[20] = "HELLO";
    char msg2[20] = "WORLD";

    int count=0;
    for(int i=0;word[i]!='\0';i++){
        cout<<word[i];
        count++;
    }
    cout<<endl;

    cout<<word<<endl;

    for(int i=0;str[i]!='\0';i++){
        cout<<str[i];
    }
    cout<<endl;

    cout<<str<<endl;

    cout<<"Length of \t\tWor\bd : "<< strlen(word)<<endl;
    cout<<"Length of Word : "<< count<<endl;
    cout<<"Length of str : "<< strlen(str)<<endl;
    cout<<"Length of str1 : "<< strlen(str1)<<endl;

    //use of strcat
    cout<<msg1<<" length: "<<strlen(msg1)<<endl;
    strcat(msg1,msg2);
    strncat(msg1,msg2,10);
    cout<<msg1<<" length: "<<strlen(msg1)<<endl;

    //use of strcmp
    cout<< strcmp("RA","OB")<<endl;
    cout<< strcmp("HE","HE")<<endl;
    cout<< strcmp("SHE","HE")<<endl;
    char msg3[20];
    char msg4[20];
   // cin>>msg3;
   // cin>>msg4;
   // if(strcmp(msg3,msg4) == 0){
   //     cout<<"EQUAL MSG"<<endl;
   // }

   // char msg5[20];
  //  cin>>msg5;
   // cout<<msg5;

/*

    char word [] = {'H','E'};
    char s1[] = "STR1";
    char s2[] = "STR2";

    for(int i=0;i<12;i++){
        cout<<word[i];
    }
    cout<<endl;

    cout<<word<<endl;
    cout<<&word[0]<<endl;
    cout<<"Length of string :"<<strlen(word)<<endl;

    strcat(s1,s2);
    cout<<s1<<endl;
    cout<<strcmp("HE","SHE")<<endl;

*/

return 0;
}
