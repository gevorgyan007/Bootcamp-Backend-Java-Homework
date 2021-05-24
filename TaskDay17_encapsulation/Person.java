package com.company.TaskDay17_encapsulation;

public class Person {
    //has private fields firstName, lastName, passportId, age, sex(String), nationality.
    //add all argument constructor, and no argument constructor.
    //add public  getters and setters.
    protected String firstName;
    private String lastName;
    private String passportId;
    private int age;
    private String sex;
    private String nationality;

    public Person() {
    }

    public Person(String firstName, String lastName, String passportId, int age, String sex, String nationality) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passportId = passportId;
        this.age = age;
        this.sex = sex;
        this.nationality = nationality;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() > 3 && firstName.length() < 15) {
            this.firstName = firstName;
        } else {
            System.out.println("Invalid input ,enter 3-15 range!");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName.length() > 6 && lastName.length() < 20) {
            this.lastName = lastName;
        } else {
            System.out.println("Invalid input ,enter 6-20 range!");
        }

    }

    public String getPassportId() {
        return passportId;
    }

    private boolean checkPass(String str) {
        for (int i = 2; i < str.length(); i++) {
            if (!Character.isDigit(i))
                return false;
            break;
        }
        return true;
    }

    public void setPassportId(String passportId) {
        if (passportId.length() == 8 && passportId.startsWith("AN") && checkPass(passportId)) {
            this.passportId = passportId;
        } else {
            System.out.println("invalid passpordID");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 18 && age < 99) {
            this.age = age;
        } else {
            System.out.println("Invalid input ,enter 6-20 range!");
        }

    }

    public String getSex() {
        return sex;
    }

    //sex must be male or female(compareToIgnoreCase())
    public void setSex(String sex) {
        if (sex.compareTo("male") == 0 || sex.compareTo("female") == 0) {
            this.sex = sex;
        } else {
            System.out.println("invalid input");
        }
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }


    public String display() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passportId=" + passportId +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
