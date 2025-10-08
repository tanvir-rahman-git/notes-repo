#include<iostream>
using namespace std;

        //creat a person class
    class Person
        {
      protected:
        string status,phone,nation;
      public:
        string name;
        int age ;
        Person(string n, int a)
        {
        name=n;
        age=a;
        }
        Person(string c, string d,string e)
        {
        status=c;
        phone=d;
        nation=e;
        }
      void display1()
        {
        cout<<"Person: "<<endl;
        cout<<"Name                       : "<<name<<endl;
        cout<<"Age                        : "<<age  <<endl;
        }
      void display2()
        {
        cout<<"Marrital status            : "<<status<<endl;
        cout<<"Nationality                : "<<nation<<endl;
        cout<<"Phone                      : "<<phone <<endl;
        }
        };


        // create a class named Employee
        //use virtual for diamond problem

    class Employee : virtual public Person
        {
     protected:
        int salery;
        string post,work_time,national_id;
     public:
        Employee(string n,int a,string po,string wt,string ni,int sa):Person(n,a) // inheritance from public
        {
           post=po;
           work_time=wt;
           national_id=ni;
           salery=sa;
        }

      void display()
        {
        cout<<"Employee                   : "<<endl;
        cout<<"Name                       : "<<name<<endl;
        cout<<"Age                        : "<<age  <<endl;
        cout<<"Post                       : "<<post<<endl;
        cout<<"work time                  : "<<work_time<<endl;
        cout<<"national id                : "<<national_id  <<endl;
        cout<<"Salery                     : "<<salery<<endl;
        }

        };
        // create a class named Student
        //use virtual for diamond problem
    class Student : virtual public Person
        {
     public:
        string institute,CGPA,ID,department,Semester;
        Student(string n,int a,string in,string cg,string id,string de,string se):Person(n,a)
        {
        institute=in;
        CGPA=cg;
        ID=id;
        department=de;
        Semester=se;

       }
      void display()
       {
        cout<<"Student                    : "<<endl;
        cout<<"Name                       : "<<name<<endl;
        cout<<"Age                        : "<<age  <<endl;
        cout<<"Name of institute          : "<<institute<<endl;
        cout<<"CGPA                       : "<<CGPA<<endl;
        cout<<"ID                         : "<<ID<<endl;
        cout<<"Department                 : "<<department  <<endl;
        cout<<"Semester                   : "<<Semester<<endl;
       }

       };
       // create a class named Officer
    class Officer :  public Employee
       {
      public:
       string institute;
       Officer(string n,int a,string in,string po,string wt,string ni,int sa):Employee( n, a, po, wt, ni,sa),Person(n,a)
       {
         institute=in;
       }
      void display()
       {
        cout<<"Officer                    : "<<endl;
        cout<<"Name                       : "<<name<<endl;
        cout<<"Age                        : "<<age  <<endl;
        cout<<"Name of institute          : "<<institute<<endl;
        cout<<"Post                       : "<<post<<endl;
        cout<<"work time                  : "<<work_time<<endl;
        cout<<"national id                : "<<national_id  <<endl;
        cout<<"Salery                     : "<<salery<<endl;
       }

       };
       // create a class named Faculty
       //multiple inheritance
    class Faculty : public Employee
       {
      public:
       string institute;
       Faculty(string n,int a,string in,string po,string wt,string ni,int sa):Employee(n, a, po, wt, ni,sa),Person(n,a)
       {
            institute=in;
       }
      void display()
       {
        cout<<"Faculty                    : "<<endl;
        cout<<"Name                       : "<<name<<endl;
        cout<<"Age                        : "<<age  <<endl;
        cout<<"Name of institute          : "<<institute<<endl;
        cout<<"Post                       : "<<post<<endl;
        cout<<"work time                  : "<<work_time<<endl;
        cout<<"national id                : "<<national_id  <<endl;
        cout<<"Salery                     : "<<salery<<endl;
       }

        };
        // create a class named Scholarship_Student
        //multiple inheritance
    class Scholarship_Student : public Student
        {
      public:
        string allow;
        Scholarship_Student(string n,int a,string in,string cg,string id ,string de,string se,string h):Student(n,a,in,cg,id,de,se),Person(n,a)
        {
        allow=h;
        }
      void display()
        {
        cout<<"Scholaship_Student         : "<<endl;
        cout<<"Name                       : "<<name<<endl;
        cout<<"Age                        : "<<age  <<endl;
        cout<<"Name of institute          : "<<institute<<endl;
        cout<<"CGPA                       : "<<CGPA<<endl;
        cout<<"ID                         : "<<ID<<endl;
        cout<<"Department                 : "<<department  <<endl;
        cout<<"Semester                   : "<<Semester<<endl;
        cout<<"Fail or Drop               : "<<allow<<endl;
        cout<<"____________________________________________"<<endl;
       }

    };
int main()
    {
    Person a ("Mahi",22);
    Person b("unmarried","01823035590","Bangladesh");
    a.display1();
    b.display2();
    cout<<""<<endl;
    Employee we();
    Employee c("MONIR",49,"M.D","4 to 5 HOUR","01980999708",50000);
    c.display();
    cout<<""<<endl;
    Student f("Mahi",18,"AIUB","3.75","21-45127-2","CSE","1st");
    f.display();
    cout<<""<<endl;
    Officer e("KARIM",52,"National Bank","Manager","10 to 4 HOUR","723456789",65000);
    e.display();
    cout<<""<<endl;
    Faculty d("RAHIM",36,"AIUB","Assistant teacher","5 to 4 HOUR","098637389",20000);
    d.display();
    cout<<""<<endl;
    Scholarship_Student g("Fahim",23,"AIUB","3.85","20-45127-2","CSE","3rd","No");
    g.display();

    }
