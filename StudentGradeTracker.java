import java.util.Scanner;
import java.util.ArrayList;

public class StudentGradeTracker {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<integer> grades=new ArrayList<>();
        System.out.print("Enter the number of Students:");
        int numberOfStudent=scanner.nextInt();

        for (int i=0; i<numberOfStudent; i++){
            System.out.println("Enter the grade for student "+(i+1)+":");
            int grade=scanner.nextInt();
            grades.add(grade);

        }
int sum=0;
int highestGrade = Integer.MIN_VALUE;
int lowestGrade = Integer.MAX_VALUE;

for (int grade :grades){
    sum +=grade;
    highestGrade = Math.max(highestGrade,grade);
    lowestGrade = Math.min(lowestGrade,grade);

}
double average=(double) sum/numberOfStudent;

System.out.println("Average Grade: " + average);
System.out.println("Highest Grade: " + highestGrade);
System.out.println("Lowest Grade: " + lowestGrade);

    }
}