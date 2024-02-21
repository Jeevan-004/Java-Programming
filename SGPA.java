import java.util.Scanner;
class student
{
    int usn;
    String name;
    int [] credits = new int[8];
    int [] marks = new int[8];
    
    void accept()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your USN: ");
        usn = s.nextInt();
        System.out.println("Enter your name: ");
        name = s.next();
        for(int i=0;i<8;i++)
        {
            System.out.println("Enter credits of the subject" + (i+1) + ":");
            credits[i] = s.nextInt();
            System.out.println("Enter marks of the subject" + (i+1) + ":");
             marks[i] = s.nextInt();
        }
    }
    int GP(int marks)
        {
            if (marks>=90)
            {
                return 10;
            }
            else if (marks>=80 && marks<90) return 9;
            else if (marks>=70 && marks<80) return 8;
            else if (marks>=60 && marks<70) return 7;
            else if (marks>=50 && marks<60) return 6;
            else return 0;
        }
    double SGPA()
    {
        double sum=0;
        int TC=0 ;
        
        for(int i = 0;i<8;i++)                                      
        {
            
            TC = TC + credits[i];
            sum = sum + GP(marks[i]) * credits[i];
            
        }
        return (sum/TC);
    }
    
    
}

class Grades 
{
    public static void main(String args[])
    {
        double gpa;
        student s1 = new student();
        s1.accept();
        gpa = s1.SGPA();
        System.out.println("SPGA Of the Student is: "+gpa);
        
        
    }
}
