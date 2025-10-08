#include<iostream>
#include<string.h>
using namespace std;

int main(){
    cout<<"Take characters "<<endl;
    int n; cin>>n;
    cout<<"which char "<<endl;
    char c; cin>>c;
    cout<<"Check the word"<<endl;
    string s; cin>>s;
    bool flag=0;
    for (int i=0;i<n;i++){
        if(s[i]==c)flag=1;
    }
    if(flag) cout<<"It Has "<<endl;
    else cout<<"It Has Not "<<endl;
    return 0;
}
