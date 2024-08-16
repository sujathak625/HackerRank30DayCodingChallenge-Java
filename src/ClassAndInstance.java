import java.util.Scanner;

public class ClassAndInstance {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int noOfInput = sc.nextInt();
        int[] inputs = new int[noOfInput];
        for(int i=0;i<noOfInput;i++){
            inputs[i]=sc.nextInt();
            Person p = new Person(inputs[i]);
           // p.yearPasses();
            p.amIOld();
            for(int j=0;j<3;j++){
                p.yearPasses();
            }
            p.amIOld();
        }


    }
}

class Person {
    int age;

    String fName;
    String lName;

    public Person(String fName, String lName) {
        this.fName = fName;
        this.lName = lName;

    }

    public Person(int initialAge){
        if(initialAge>0){
            this.age=initialAge;
        }
    }

    public void yearPasses(){
        System.out.println(age+1);
    }

    public void amIOld(){
        if(age<13){
            System.out.println("You are young.");
        } else if(age<18){
            System.out.println("You are a teenager.");
        } else {
            System.out.println("You are old.");
        }
    }
}

