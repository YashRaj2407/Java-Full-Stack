import java.util.*;

 class GradeCalculater {
    public static void main(String args[])
    {
         System.out.println("Enter your marks=");
    Scanner sc=new Scanner(System.in);
    int marks;
    marks = sc.nextInt();
    if (marks>=80 && marks<=100)
    {
        System.out.println("You Got 'A' Grade");
    }
    else if (marks>=70 && marks<=80)
    {
        System.out.println("You Got 'B' Grade");
    } 
    else if (marks>=60 && marks<=70)
    {
        System.out.println("You Got 'C' Grade");
    }
    else if (marks>=50 && marks<=60)
    {
        System.out.println("You Got 'D' Grade");
    }
    else
    {
     System.out.println("You Got 'Fail'");

    }
}
 }