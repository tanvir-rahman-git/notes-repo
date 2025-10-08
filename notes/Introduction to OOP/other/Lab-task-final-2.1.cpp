#include<iostream>
using namespace std;
class Account
{
private:
    string AccountName;
    string AccountNo;
    float Balance;
    string AccountType;

public:
    void setaccountName(string a)
    {
        AccountName=a;
    }
    void setaccountNo(string b)
    {
        AccountNo=b;
    }
    void setbalance(float c)
    {
        Balance=c;
    }
    void setaccountType(string d)
    {
        AccountType=d;
    }

    string getaccountName()
    {
        return AccountName;
    }
    string getaccountNo()
    {
        return AccountNo;
    }
    float getbalance()
    {
        return Balance;
    }
    string getaccountType()
    {
        return AccountType;
    }

    Account ()
    {
        cout<<"ACCOUNT EMPTY CONSTRUCTOR"<<endl;
    }
    Account (string a,string b,float c,string d)
    {
        cout<<"Account Parameterized Constructor"<<endl;
        AccountName=a;
        AccountNo=b;
        Balance=c;
        AccountType=d;
    }
    ~Account()
    {
        cout<<"Destructor is called for "<< AccountName <<endl;
    }
    void Deposit(int amount)
    {
        Balance=Balance+amount;

        cout<<"AFTER DEPOSIT NEW BALANCE IS "<<Balance<<" TAKA"<<endl;
    }

    void Transfer(int amount,Account Reciver)
    {
        Reciver.Balance=Reciver.Balance+amount;
        cout<<"AFTER TRANSFER "<<amount<<" TAKA  NEW BALANCE IS: "<<Reciver.Balance<<" TAKA"<<endl;
    }
     void Withdraw(int amount)
    {
        Balance=Balance-amount;
        cout<<"WITHDRAWAL AMOUNT: "<<amount<<endl;
        cout<<"AFTER WITHDRAW NEW BALANCE IS "<<Balance<<" TAKA"<<endl;
    }
    void ShowAccountDetails()
    {
        cout<<"ACCOUNT NAME: "<<AccountName<<endl;
        cout<<"ACCOUNT NO: "<<AccountNo<<endl;
        cout<<"BALANCE: "<<Balance<<endl;
        cout<<"ACCOUNT TYPE: "<<AccountType<<endl;
    }
};
int main()
{
    Account a1;

    Account a2(" "," ",0," ");


    string a,b,d;
    int c;
    cout<<"Transfer amount from account name,account No,Amount and account type :";
    cin>>a>>b>>c>>d;
    Account a3(a,b,c,d);
    a3.ShowAccountDetails();
    int e;
    cout<<"Adds amount to balance :";
    cin>>e;
    a3.Deposit(e);
    a2.Transfer(c,a3);

    a2.ShowAccountDetails();
    int amount;
    cout<<"Amount you want withdraw :";
    cin>>amount;
    a2.Withdraw(amount);
    return 0;


}
