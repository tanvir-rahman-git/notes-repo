 
#include <bits/stdc++.h>
using namespace std;
int main() {

    
     string s;
     getline(cin, s);  // float x = a +1b
     vector<string> v;
     string ss="";
     for(int i=0;i<s.length();i++)
     {
        if(s[i]==' ')
        {
            v.push_back(ss);
            ss="";
        }
        else
        {
            ss+=s[i];
        }

     }
     v.pb(ss);

     for(int i=0;i<v.size();i++)
     {


   if(i==0) {


       if (v[i] == "int" || v[i] == "double" || v[i] == "float" || v[i] == "long" || v[i] == "short" || v[i] == "char" || v[i] == "bool ")
       {
           cout <<"Valid keyword : " << v[i] << endl;
       }
       else
       {
           cout <<"InValid keyword : " << v[i] << endl;
       }
   }

 if(i%2==1)
 {

     if (v[i] >= "a" && v[i] <= "z" || v[i] >= "A" && v[i] <= "Z") {
         cout << "Valid Identifier : " << v[i] << endl;
     } else
     {
         cout <<"InValid Identifier : "  << v[i] << endl;
     }

 }

if(i%2==0 && i!=0) {


    if (v[i] == "+" || v[i] == "-" || v[i] == "*" || v[i] == "/" || v[i] == ">" || v[i] == "<" || v[i] == "=") {
        cout << "Valid operator : " << v[i] << endl;
    } else
    {
        cout << "InValid operator : " << v[i] << endl;
    }


}
     }

 }

