import java.util.*;

class Main {
    public static void main(String[] args) {
        int sum = 0;
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects : ");
        int noOfSubjects = sc.nextInt();
        int marks[] = new int[noOfSubjects]; // intializing array
        System.out.println("Enter the marks of " +noOfSubjects +" Subjects. Press enter to give marks for another subject : ");
        //entering makrs 
        for (int i = 0; i < noOfSubjects; i++){ 
            marks[i] = sc.nextInt();
        }// calculating sum
        for (int j = 0; j < noOfSubjects; j++){
            sum = sum + marks[j];
        }// generating result
        int percentage = sum / noOfSubjects;
        // can also be written as 
        // int percentage = (sum / noOfSubjects*100)*100
        System.out.println(percentage);
        if (percentage >= 95){
            result = "You score A*. Well done!";
        }else if (percentage > 90 && percentage <= 95){
            result = "You scored A. Well done!";
        }
        else if (percentage > 90 && percentage <= 85 ){
            result = "You scored B. Well done!";
        }
        else if (percentage > 85 && percentage <= 80){
            result = "You scored C. Well done!";
        }
        else {
            result = "You failed!";
        }
        System.out.println(result);
    }
}