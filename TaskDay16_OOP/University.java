package com.company.TaskDay16_OOP;

public class University {
    //define fields ` name, countOfStudents, maxCountOfStudents
    //maxAgeOfStudent, minAgeOfStudent
    String name;
    int countOfStudents;
    int maxCountOfStudents = 1000;
    int maxAgeOfStudent = 50;
    int minAgeOfStudent = 16;

    public University(int countOfStudents) {
        this.countOfStudents = countOfStudents;
    }

    // write a function to print all info about university` printInfo()
    public void printInfo() {
        System.out.println("countOfStudents:: " + countOfStudents + "\n" +
                "maxCountOfStudents::" + maxCountOfStudents + "\n" +
                "maxAgeOfStudent::" + maxAgeOfStudent + "\n" +
                "minAgeOfStudent::" + minAgeOfStudent);
    }

    public University() {

    }

    //write a function checkAge(int age) to check if the students age is valid.
    public boolean checkAge(int age) {
        if (age > maxAgeOfStudent || age < minAgeOfStudent) {
            System.out.println("You enter wrong age");
            return false;
        } else {
            return true;
        }
    }

    public void admission() {
        System.out.println("Please enter faculty");
        System.out.println("Applied Mathematics -- 1" + "\n"+
                "Computer science -- 2" + "\n"+
                "lenguage -- 3" + "\n"+
                "Fizika-- 4");
    }
   public void register(){
       countOfStudents +=1;
   }
}
