package DataClasses;

import java.util.Scanner;

public class patient extends entree
{
    public String PatientDisease;
    public String PatientAdmission;
    public int PatientAge;
    public void get_info()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Patient's ID: ");
        EntryID = input.nextLine();
        System.out.print("Patient's Name: ");
        EntryName = input.nextLine();
        System.out.print("Patient's Disease: ");
        PatientDisease = input.nextLine();
        System.out.print("Patients Gender: ");
        EntryGender = input.nextLine();
        System.out.print("Patient's Admission: ");
        PatientAdmission = input.nextLine();
        System.out.print("Patient's Age: ");
        PatientAge = input.nextInt();
    }
    public void out_info()
    {
        System.out.println(EntryID + "\t" + EntryName + " \t" + PatientDisease + "     \t" + EntryName + "      \t" + PatientAdmission + "\t" + PatientAge);
    }
}