import java.util.*;

public class InheritanceConcept {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        String[] inputs = input.split(" ");
        int totalScores=sc.nextInt();
        sc.nextLine();
        int[] scores=new int[totalScores];
        for(int i=0;i<totalScores;i++){
            scores[i]=sc.nextInt();

        }
        Student p = new Student(inputs[0], inputs[1], Integer.parseInt(inputs[2]), scores);
        char grade = p.calculate();

        System.out.println("Name: "+inputs[1]+", "+inputs[0]);
        System.out.println("ID: "+inputs[2]);
        System.out.println("Grade: "+grade);
    }
}


class Student extends Person {

    int id;
    int[] scores;

    public Student(String fName,String lName,int id,int[] scores){
        super(fName,lName);
        this.id=id;
        this.scores=scores;
    }

    public char calculate() {

        char grade;
        double average = Arrays.stream(scores).average().orElse(0.0);
        if(average<40.0){
            grade='T';
        } else if(average>=40.0 && average<55.0){
            grade='D';
        } else if(average>=55.0 && average<70.0){
            grade='P';
        }else if(average>=70.0 && average<80.0){
            grade='A';
        }else if(average>=80.0 && average<90.0){
            grade='E';
        } else {
            grade ='O';
        }
        return grade;
    }
}