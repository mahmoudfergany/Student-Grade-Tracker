import java.util.Scanner;
public class GradeTracker {
    public static void main(String[] args){
Scanner input=new Scanner(System.in);
System.out.println("******************************");
System.out.println("----STUDENT GRADE TRACKER ----");
System.out.println("******************************");
System.out.println("What's your name ?");
String name = input.nextLine();
System.out.println("What's your age ?");
int age = input.nextInt();
System.out.println("Which subject are you passionate about ?");
 input.nextLine();
String subject = input.nextLine();
System.out.println("What is the three subject you want to calc. their AVG ? ");
System.out.print("FIRST SUBJECT : ");
String s1 = input.nextLine();
System.out.print("SECOND SUBJECT : ");
String s2 = input.nextLine();
System.out.print("THIRD SUBJECT : ");
String s3 = input.nextLine();
System.out.println("What is the grade of each one ? ");
System.out.print(s1+" : ");
float g1 = input.nextFloat();
System.out.print(s2+" : ");
float g2 = input.nextFloat();
System.out.print(s3+" : ");
float g3 = input.nextFloat();
float average =AVG(g1,g2,g3);
String State = stat(average);
card(name,age,subject,s1,s2,s3,g1,g2,g3,average,State);

    }
    public static float AVG(float a , float b , float c){
        return (a+b+c)/3;
    }
    public static String stat(float avg){
        if (avg<=100 && avg>=90) {
            return "A";
        }
       else if (avg<90 && avg>=80) {
            return "B";
        }
       else if (avg<80 && avg>=70) {
            return "C";
        }
        else if (avg<70 && avg>=50) {
            return "D";
        }
       else if ( avg<50) {
            return "F";
        }
        else
            return "The AVG not accepted !";
    }
    public static void card(String name , int age , String favS, String s1,
                            String s2 ,String s3,float g1,float g2,float g3,float avg,String state)

    {System.out.println("\n\n");
    System.out.println("------------------------------------");
    System.out.println("|                                  |");
    System.out.println("|      OFFICIAL STUDENT REPORT     |");
    System.out.println("|                                  |");
    System.out.println("------------------------------------");
    System.out.println("|NAME : "+ name+"                  " );
    System.out.println("|AGE : "+ age+"                    " );
    System.out.println("|FAVOURITE SUBJCT : "+ favS+"      " );
    System.out.println("|----------------------------------|");
    System.out.println("| SUBJECT        ||    GRADES      |");
    System.out.println("|"+s1 +":"+ g1+"                   ");
    System.out.println("|"+s2 +":"+ g2+"                   ");
    System.out.println("|"+s3 +":"+ g3+"                   ");
    System.out.println("|----------------------------------|");
    System.out.println("| OVERALL AVERAGE : "+avg+"        ");
    System.out.println("| STATE : "+state+"                ");
    System.out.println("------------------------------------");
    System.out.println("------------------------------------");
        }

}