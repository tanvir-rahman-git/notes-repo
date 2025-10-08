package DataClasses;

import java.util.Scanner;

public class staff extends entree
{
    public String StaffDesignation;
    public int StaffSalary;
    public void get_info()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Staff's ID: ");
        EntryID = input.nextLine();
        System.out.print("Staff's Name: ");
        EntryName = input.nextLine();
        System.out.print("Desigination: ");
        StaffDesignation = input.nextLine();
        System.out.print("Staff's Gender: ");
        EntryGender = input.nextLine();
        System.out.print("Staff's Salary: ");
        StaffSalary = input.nextInt();
    }
    public void out_info()
    {
        System.out.println(EntryName + "\t" + EntryName + "\t" + EntryGender + "\t" + StaffSalary);
    }
}