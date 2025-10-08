package DataClasses;

import java.util.Scanner;

public class doctor extends entree
{
    public String DoctorSpeciality;
    public String DoctorAppointment;
    public int DoctorRoom;
    public void get_info()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Doctor's ID: ");
        EntryID = input.nextLine();
        System.out.print("Doctor's Name: ");
        EntryName = input.nextLine();
        System.out.print("Doctor's Speciality: ");
        DoctorSpeciality = input.nextLine();
        System.out.print("Doctor's Appointment Time: ");
        DoctorAppointment = input.nextLine();
        System.out.print("Doctor's Gender: ");
        EntryGender = input.nextLine();
        System.out.print("Doctor's Room No.: ");
        DoctorRoom = input.nextInt();
    }
    public void out_info()
    {
        System.out.println(EntryID + "\t" + EntryName + "  \t" + DoctorSpeciality + "     \t" + DoctorAppointment + "    \t" + EntryGender + "       \t" + DoctorRoom);
    }
}