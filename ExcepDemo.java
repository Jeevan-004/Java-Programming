import java.util.Scanner;
class WrongAge extends Exception{
WrongAge(String error)
{	System.out.println(error);
}
}

class Father
{
int age;
Father(int age) throws WrongAge{
if(age<0)
throw new WrongAge("Father's age cannot be negative");
this.age=age;
}
}


class Son extends Father{
int age;
Son(int age,int s_age) throws WrongAge{
super(age);
if(s_age>=age)
throw new WrongAge("Son's age connot be greater than Father's age");
this.age=s_age;
}
}


class ExcepDemo{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
try{
System.out.println("Enter Father's age:");
int f_age=sc.nextInt();
System.out.println("Enter Son's age:");
int s_age=sc.nextInt();
Son a=new Son(f_age,s_age);

System.out.println("Father's age:"+f_age);
System.out.println("Son's age:"+s_age);
}
catch(WrongAge e)
{System.out.println("Wrong age entered");}
catch(Exception ee)
{System.out.println("Unexpected error"+ee);}
}}


