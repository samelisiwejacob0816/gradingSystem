import java.util.Scanner;

public class gradingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));
    

 System.out.println("please enter number of students");
  int students = scanner.nextInt();

  //for loop
  for(int i =1; i <= students; i++){
    System.out.println("Enter marks for student" + i + " " + "0 -100");
    int score = scanner.nextInt();

    if(score < 0 || score > 100){
       System.out.println("Invalid score, must be between 0 and 100");
         continue;
    }

    //grade using if else
    String grade;
    if (score >= 90){
       grade ="A";
    }else if (score >= 80){
        grade ="B";
    }else if (score >= 70){
        grade ="C";
    }else if (score >= 60) {
        grade ="D";
    }else{
        grade= "E";
    }

    //switch case for grade

    switch (grade) {
        case "A":
        case "B":  
        System.out.println("Grade :" + grade + " " + "Excellent work");
            break;
            case "C":  
            System.out.println("Grade :" + grade + " " + "Good job, room for improvement");
                break;
            case "D":  
        System.out.println("Grade :" + grade + " " + "Passed, please put in more effort");
            break;
            case "E":  
        System.out.println("Grade :" + grade + " " +"Please work harder");
            break;
        default:
        System.out.println("incorrect grade");
          }
          System.out.println();
    }
 scanner.close();
}
}