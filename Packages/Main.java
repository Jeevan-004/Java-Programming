import java.util.Scanner;
import CIE.*;
import SEE.*;

public class CalculateFinalMarks 
{
    public static void main(String[] args) 
	{
        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int n = s1.nextInt();

        Internals[] cieStudents = new Internals[n];
        for (int i = 0; i < n; i++) 
		{
            System.out.println("Enter details for CIE student " + (i + 1));
            System.out.print("USN: ");
            String usn = s1.next();
            System.out.print("Name: ");
            String name = s1.next();
            System.out.print("Semester: ");
            int sem = s1.nextInt();
            System.out.println("Enter internal marks for 5 courses:");
            int[] internalMarks = new int[5];
            for (int j = 0; j < 5; j++) 
			{
                System.out.print("Course " + (j + 1) + ": ");
                internalMarks[j] = s1.nextInt();
            }

            cieStudents[i] = new Internals(usn, name, sem, internalMarks);
        }

        External[] seeStudents = new External[n];
        for (int i = 0; i < n; i++) 
		{
            System.out.println("Enter details for SEE student " + (i + 1));
            System.out.print("USN: ");
            String usn = s1.next();
            System.out.print("Name: ");
            String name = s1.next();
            System.out.print("Semester: ");
            int sem = s1.nextInt();
            System.out.println("Enter SEE marks for 5 courses:");
            int[] seeMarks = new int[5];
            for (int j = 0; j < 5; j++) 
			{
                System.out.print("Course " + (j + 1) + ": ");
                seeMarks[j] = s1.nextInt();
            }

            seeStudents[i] = new External(usn, name, sem, seeMarks);
        }

        int[][] finalMarks = new int[n][5];
        for (int i = 0; i < n; i++) 
		{
            for (int j = 0; j < 5; j++) 
			{
                finalMarks[i][j] = cieStudents[i].internalMarks[j] + seeStudents[i].seeMarks[j];
            }
        }

        System.out.println("\nFinal Marks:");
        for (int i = 0; i < n; i++) 
		{
            System.out.print("USN: " + cieStudents[i].usn +", Name: " + cieStudents[i].name +", Semester: " + cieStudents[i].sem +", Final Marks: ");
            for (int j = 0; j < 5; j++) 
			{
                System.out.print(finalMarks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
