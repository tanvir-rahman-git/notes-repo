#include<iostream>
using namespace std;
class Mobile
{
private:
    string mobileOwnerName;
    string mobileNumber;
    float mobileBalance;
    string mobileOSName;
    bool lockStatus;
public:
    void setMobileownername(string a)
    {
        mobileOwnerName=a;
    }
    void setMobilenumber(string b)
    {
        mobileNumber=b;
    }
    void setMobilebalance(float c)
    {
        mobileBalance=c;
    }
    void setMobileosname(string d)
    {
        mobileOSName=d;
    }
    void setLockstatus(bool e)
    {
        lockStatus=e;
    }

    string getMobileownername()
    {
        return mobileOwnerName;
    }
    string getMobilenumber()
    {
        return mobileNumber;
    }
    float getMobilebalance()
    {
        return mobileBalance;
    }
    string getMobileosname()
    {
        return mobileOSName;
    }
    bool getLockstatus()
    {
        return lockStatus;
    }

    Mobile ()
    {
        cout<<"MOBILE EMPTY CONSTRUCTOR"<<endl;
    }
    Mobile(string a,string b,float c,string d,bool e)
    {
        cout<<"Mobile Parameterized Constructor"<<endl;
        mobileOwnerName=a;
        mobileNumber=b;
        mobileBalance=c;
        mobileOSName=d;
        lockStatus=e;
    }
    ~Mobile()
    {
         cout<<"Destructor is called for "<< mobileOwnerName <<endl;
    }
    void ShowInfo()
    {
        cout<<"Mobile Owner Name"<<mobileOwnerName<<endl;
        cout<<"Mobile Number // SIM number"<<mobileNumber<<endl;
        cout<<"Mobile Balance "<<mobileBalance<<endl;
        cout<<"Mobile OS Name "<<mobileOSName<<endl;
        cout<<"Lock Status // true means phone is locked  "<<lockStatus<<endl<<"            // false means unlocked"<<endl;//lock status false(0)means unlocked.
    }

    void Recharge(int amount)
    {
    float newBalance;
    newBalance= amount+mobileBalance;
    cout<<"RECHARGE:"<<amount<<endl;
    cout<<"NEW BALANCE:"<<newBalance<<endl;
    }
    void CallSomeOne(int timeDuration)
    {
        if(lockStatus==false)
        {
             float Tcost,cost=0.5;
           Tcost= cost*timeDuration;
           cout<<"CALL SOME ONE FOR "<<timeDuration<<" MINITUES"<<endl;
           cout<<"COST FOR PER MINITUE "<<cost<<" TAKA"<<endl;
           cout<<"TOTAL COST FOR CALL: "<<Tcost<<" TAKA"<<endl;
        }
        else
        {
            cout<<"At Frist Unlock Your Mobile"<<endl;
        }
    }
};
int main()
{
    Mobile m1;

    Mobile m2(" "," ",0," ",0);
    m2.ShowInfo();
    int amount;
    cout<<"Recharge an amount :";
    cin>>amount;
    m2.Recharge(amount);
    m2.CallSomeOne(5);

    return 0;
}
