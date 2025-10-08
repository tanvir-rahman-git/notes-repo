#include <iostream>

using namespace std;

int main()
{
      string s;
      cout<<"Enter your String ";
     cin>>s;

     int count_operator =0;
     int k=0;  // k is another count




  if(s[0]=='+' || s[0]=='*'|| s[0]=='-' || s[0]=='/')
  {
      cout<<s<<" "<<"This Math Exp is Invalide"<<endl;

  }
  else if(s[s.length()-1]=='+' || s[s.length()-1]=='*'|| s[s.length()-1]=='-' || s[s.length()-1]=='/')
  {
       cout<<s<<" "<<"This Math Exp is \'Invalide\'"<<endl;
  }
  else {


      for (int i = 1; i < s.size(); i++)
      {


          if (s[i] == '+' || s[i] == '*' || s[i] == '-' || s[i] == '/')
          {
              count_operator ++;

              if (count_operator == 2  ) {
                  k = 0;
                  cout<<s<<" "<<"This Math Exp is  \'Invalide\'"<<endl;
                  break;
              }
              else {
             k=1;
              }

          }

          else {


              count_operator=0;

          }
      }
      if(k==1)
      {
          cout<<s<<" "<<"This Math Exp is \'Valide\'"<<endl;
      }

    return 0;
}
}
