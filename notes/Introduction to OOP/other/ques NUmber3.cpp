#include <iostream>
using namespace std;

void parameter(float s1,float s2,float s3,float s4)

                {
                    float Total=s1+s2+s3+s4;
                    float percentage=(Total/400)*100;
                    cout<<"Count The All Subjects Percentage= "<<endl;
                    cout<<percentage;
                }
        int main()

                {
                    float s1m,s2m,s3m,s4m;
                    cout<<"Take Marks Of Four Subjects= "<<endl;
                    cin>>s1m>>s2m>>s3m>>s4m;
                    parameter(s1m,s2m,s3m,s4m);

        return 0;
                }
