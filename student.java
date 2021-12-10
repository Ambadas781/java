import java.util.*;
class Student
{
 private student usn;
private string name;
private int n;
private double SGPA=0;
private int totalcredits=0;
private int credits[];
Scannert in=new scanner(system.in);

void accept()
{
system.out.println("enter full name of the student");
name=in.nextline();
system.out.println("enter usn of the student");
usn=in.nextline();
system.out.println("enter no of subjects");
n=in.nextInt();
credits=new int[n];
marks=new double[n];
system.out.println("enter the details of subject:");
for(int i=0;i<n;i++)
{
System.out.println("enter credits for subject"+(i+1));
credits[i]=in.nextInt();
System.out.println("enter marks for subject"+(i+1));
marks[i]=in.nextInt();
calculate(credits[i][,marks[i],i);
}
}
void calculate(int credit,double marks,int j)
{
totalcredits=totalcredits+credit;
if(marks>90&&mark<=100)
SGPA=SGPA+(10*credit);
else if(marks>80 && mark<=89)
SGPA=SGPA+(9*credit);
else if(marks>70 && mark<=79)
SGPA=SGPA+(8*credit);
else if(marks>60 && mark<=69)
SGPA=SGPA+(7*credit);
else if(marks>50 && mark<=59)
SGPA=SGPA+(6*credit);
else if(marks>40 && mark<=49)
SGPA=SGPA+(5*credit);
else
System.out.println("failed in subject"+(j+1));
}
void display()
System.out.println("details of student");
System.out.println("USN:"+USN);
System.out.println("name:"+name);
System.out.println("SGPA of student"+(SGPA/totalCredits));
}
}
class main
{
public static void main(String args[])
{
Student s1=new Student();
s1.accept();
s1.display();
}
}











