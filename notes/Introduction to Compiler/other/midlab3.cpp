#include <bits/stdc++.h>
using namespace std;

int main() 
{


     int single_comments = 0;
     int multiple_comments = 0;
     fstream my_file;
     my_file.open("my_file.txt", ios::out);

     string code = "   #include <iostream> \n"
                   "    using namespace std;\n"
                   "   // main function \n"
                   "   int main()  \n"
                   "       {     \n"
                   "      // variable declaration \n"
                   "          int sum, b, c;\n"
                   "          cin>>b>>c; //input taking \n"
                   "      /* This is my \n"
                   "          code   \n"
                   "           for \n"
                   "          testing */  \n"
                   "         sum = b + c;   \n"
                   "          //output \n"
                   "  cout<<sum<<endl;\n"
                   "         return 0; \n"
                   "      }; \n";

     string new_code = " ";
     for (int i = 0; i < code.length(); i++) {
         if (code[i] == '/' && code[i + 1] == '/')       //single_comments
         {
             single_comments = 1;
             i++;
         } else if (code[i] == '/' && code[i + 1] == '*')  /*multiple_comments*/
         {
             multiple_comments = 1;
             i++;
         } else if (single_comments == 1 && code[i] == '\n') {
             single_comments = 0;
         } else if (multiple_comments == 1 && code[i] == '*' && code[i + 1] == '/') {
             multiple_comments = 0;
             i++;
         } else if (multiple_comments == 1 || single_comments == 1) {
             continue;
         } else {
             new_code += code[i];
         }


     }
     cout << new_code << endl;

     my_file<<new_code;



}
