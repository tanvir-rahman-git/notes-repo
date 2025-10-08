import java.util.*;



import DataClasses.*;

public class Menu{
    void displayMenu(){
        System.out.println("\n--------------------------------------------------------------------------------");
        System.out.println("            *** Hospital Management Project ***");
        System.out.println("--------------------------------------------------------------------------------");

        doctor[] d = new doctor[25];
        patient[] p = new patient[100];
        lab[] l = new lab[20];
        staff[] s = new staff[100];
        int i;
        for (i = 0; i < 25; i++)
            d[i] = new doctor();
        for (i = 0; i < 100; i++)
            p[i] = new patient();
        for (i = 0; i < 20; i++)
            l[i] = new lab();
        for (i = 0; i < 100; i++)
            s[i] = new staff();

        d[0].EntryID = "1";
        d[0].EntryName = "Dr.Muntezar";
        d[0].DoctorSpeciality = "ENT";
        d[0].DoctorAppointment = "5-11AM";
        d[0].EntryGender = "Male";
        d[0].DoctorRoom = 17;
        d[1].EntryID = "2";
        d[1].EntryName = "Dr.Muntezar";
        d[1].DoctorSpeciality = "Physician";
        d[1].DoctorAppointment = "10-3AM";
        d[1].EntryGender = "Male";
        d[1].DoctorRoom = 45;
        d[2].EntryID = "3";
        d[2].EntryName = "Dr.Muntezar";
        d[2].DoctorSpeciality = "Surgeon";
        d[2].DoctorAppointment = "8-2AM";
        d[2].EntryGender = "Male";
        d[2].DoctorRoom = 12;
        d[3].EntryID = "4";
        d[3].EntryName = "Dr.Muntezar";
        d[3].DoctorSpeciality = "Radiology";
        d[3].DoctorAppointment = "9-12AM";
        d[3].EntryGender = "Male";
        d[3].DoctorRoom = 8;


        p[0].EntryID = "5";
        p[0].EntryName = "Muntezar";
        p[0].PatientDisease = "Brain-Damage";
        p[0].EntryGender = "Male";
        p[0].PatientAdmission = "Admitted";
        p[0].PatientAge = 30;
        p[1].EntryID = "6";
        p[1].EntryName = "Muntezar";
        p[1].PatientDisease = "Java Poisoning";
        p[1].EntryGender = "Male";
        p[1].PatientAdmission = "Admitted";
        p[1].PatientAge = 23;
        p[2].EntryID = "7";
        p[2].EntryName = "Muntezar";
        p[2].PatientDisease = "Lethal exposure to education";
        p[2].EntryGender = "Male";
        p[2].PatientAdmission = "Discharged";
        p[2].PatientAge = 42;
        p[3].EntryID = "8";
        p[3].EntryName = "Muntezar";
        p[3].PatientDisease = "Malnutrition for classes during Ramadan";
        p[3].EntryGender = "Male";
        p[3].PatientAdmission = "Being operated on";
        p[3].PatientAge = 45;


        l[0].Diagnostic = "X-ray Scan ";
        l[0].DiagnosticCost = 800;
        l[1].Diagnostic = "CT Scan   ";
        l[1].DiagnosticCost = 1200;
        l[2].Diagnostic = "OR Scan   ";
        l[2].DiagnosticCost = 500;
        l[3].Diagnostic = "PET Scan   ";
        l[3].DiagnosticCost = 500;


        s[0].EntryID = "9";
        s[0].EntryName = "Muntezar";
        s[0].StaffDesignation = "Worker";
        s[0].EntryGender = "Male";
        s[0].StaffSalary = 3000;
        s[1].EntryID = "10";
        s[1].EntryName = "Muntezar";
        s[1].StaffDesignation = "Nurse";
        s[1].EntryGender = "Male";
        s[1].StaffSalary = 2000;
        s[2].EntryID = "11";
        s[2].EntryName = "Muntezar";
        s[2].StaffDesignation = "Worker";
        s[2].EntryGender = "Male";
        s[2].StaffSalary = 5000;
        s[3].EntryID = "12";
        s[3].EntryName = "Muntezar";
        s[3].StaffDesignation = "Security";
        s[3].EntryGender = "Male";
        s[3].StaffSalary = 4500;

        int count1 = 4, count2 = 4,  count3 = 4,  count4 = 4;
        Scanner input = new Scanner(System.in);
        int choice, j, c1, status = 1, s1 = 1, s2 = 1, s3 = 1, s4 = 1;
        while (status == 1)
        {
            System.out.println("\n                                    MAIN MENU");
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println(" 1. Doctors  2. Patients  3. Diagnostics  4. Staff  5. Exit ");
            System.out.println("-----------------------------------------------------------------------------------");
            choice = input.nextInt();
            switch (choice)
            {
                case 1:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                      **DOCTOR SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        s1 = 1;
                        while (s1 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Doctors List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        d[count1].get_info();count1++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("ID \t Name\t Speciality \t Appointment Time \t Gender \t Room No.");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count1; j++)
                                        {
                                            d[j].out_info();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nPress 1 to return and Press 0 to go to the MAIN MENU");
                            s1 = input.nextInt();
                        }
                        break;
                    }
                case 2:
                    {
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                     **PATIENT SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        s2 = 1;
                        while (s2 == 1)
                        {
                            System.out.println("1.Add New Entry\n2.Existing Patients List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        p[count2].get_info();count2++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("ID \t Name \t Disease \t Gender \t Admission Status \t Age");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count2; j++) {
                                            p[j].out_info();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nPress 1 to return and Press 0 to go to the MAIN MENU");
                            s2 = input.nextInt();
                        }
                        break;
                    }
                
                case 3:
                    {
                        s3 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                    **DIAGNOSTICS SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s3 == 1)
                        {
                            System.out.println("1.Add New Entry \n2.Existing Laboratories List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        l[count3].lab_info();count3++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("Diagnostics\t\t Cost");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count3; j++) {
                                            l[j].lab_output();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nPress 1 to return and Press 0 to go to the MAIN MENU");
                            s3 = input.nextInt();
                        }
                        break;
                    }
                
                case 4:
                    {
                        s4 = 1;
                        System.out.println("--------------------------------------------------------------------------------");
                        System.out.println("                       **STAFF SECTION**");
                        System.out.println("--------------------------------------------------------------------------------");
                        while (s4 == 1)
                        {
                            String a = "Nurse", b = "Worker", c = "Security";
                            System.out.println("1.Add New Entry \n2.Existing Nurses List\n3.Existing Workers List \n4.Existing Security List");
                            c1 = input.nextInt();
                            switch (c1)
                            {
                                case 1:
                                    {
                                        s[count4].get_info();count4++;
                                        break;
                                    }
                                case 2:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("ID \t Name \t Gender \t Salary");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count4; j++)
                                        {
                                            if (a.equals(s[j].StaffDesignation))
                                                s[j].out_info();
                                        }
                                        break;
                                    }
                                case 3:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("ID \t Name \t Gender \t Salary");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count4; j++)
                                        {
                                            if (b.equals(s[j].StaffDesignation))
                                                s[j].out_info();
                                        }
                                        break;
                                    }
                                case 4:
                                    {
                                        System.out.println("--------------------------------------------------------------------------------");
                                        System.out.println("ID \t Name \t Gender \t Salary");
                                        System.out.println("--------------------------------------------------------------------------------");
                                        for (j = 0; j < count4; j++)
                                        {
                                            if (c.equals(s[j].StaffDesignation))
                                                s[j].out_info();
                                        }
                                        break;
                                    }
                            }
                            System.out.println("\nPress 1 to return and Press 0 to go to the MAIN MENU");
                            s4 = input.nextInt();
                        }
                        break;
                    }
                case 5:{
                    break;
                }
                default:
                    {
                        System.out.println("ERROR WRONG BUTTON PRESSED");
                    }
            }
            System.out.println("\nPress 1 to return to the MAIN MENU or Press 0 to confirm EXIT");
            status = input.nextInt();
        }
    }
}
