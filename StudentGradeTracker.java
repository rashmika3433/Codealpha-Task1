import java.util.Scanner;
import java.util.ArrayList;

public class StudentGradeTracker {

    public static void main(String[] args) {
        //creates a Scanner object to read user input and an ArrayList to store grades
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> grades=new ArrayList<>();
        //prompts the user to enter the number of students and stores the input in the numberOfStudent variable
        System.out.print("Enter the number of Students:");
        int numberOfStudent=scanner.nextInt();

        //loop for adding multiple students
        for (int i=0; i<numberOfStudent; i++){
            //prompt the user to enter the current student grade
            System.out.println("Enter the grade for student "+(i+1)+":");
            //read the user input and add to the array
            int grade=scanner.nextInt();
            grades.add(grade);

        }
int sum=0;
//Initialize a variable to store the highest grade (initialized to the lowest possible value)
int highestGrade = Integer.MIN_VALUE;
//Initialize a variable to store the lowest grade (initialized to the highest possible value)
int lowestGrade = Integer.MAX_VALUE;

// Iterate over each grade in the grades ArrayList
for (int grade :grades){
    //Add current grade to the sum
    sum +=grade;
    //Update the highestGrade if the current grade is higher
    highestGrade = Math.max(highestGrade,grade);
    // Update the lowestGrade if the current grade is lower
    lowestGrade = Math.min(lowestGrade,grade);

}
//calculate the average
double average=(double) sum/numberOfStudent;

//print the outputs
System.out.println("Average Grade: " + average);
System.out.println("Highest Grade: " + highestGrade);
System.out.println("Lowest Grade: " + lowestGrade);

    }
}