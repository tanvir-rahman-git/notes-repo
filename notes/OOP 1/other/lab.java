package DataClasses;

import java.util.Scanner;

public class lab 
{
    public String Diagnostic;
    public int DiagnosticCost;
    public void lab_info()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Diagnostic Device: ");
        Diagnostic = input.nextLine();
        System.out.print("Cost of Usage: ");
        DiagnosticCost = input.nextInt();
    }
    public void lab_output()
    {
        System.out.println(Diagnostic + "\t\t" + DiagnosticCost);
    }
}