package com.company.MoveCinema.Move;

public class Director {
    private String FirstNameOfDirector;
    private String LastNameOfDirector;
    private int yearOfDirector;

    @Override
    public String toString() {
        return "Director{" +
                "FirstNameOfDirector='" + FirstNameOfDirector + '\'' +
                ", LastNameOfDirector='" + LastNameOfDirector + '\'' +
                ", yearOfDirector=" + yearOfDirector +
                '}';
    }

    public Director(String firstNameOfDirector, String lastNameOfDirector, int yearOfDirector) {
        FirstNameOfDirector = firstNameOfDirector;
        LastNameOfDirector = lastNameOfDirector;
        this.yearOfDirector = yearOfDirector;
    }

    public String getFirstNameOfDirector() {
        return FirstNameOfDirector;
    }

    public void setFirstNameOfDirector(String firstNameOfDirector) {
        if (firstNameOfDirector == null){
            throw new NullPointerException("First name of cant be null");
        }
        FirstNameOfDirector = firstNameOfDirector;
    }

    public String getLastNameOfDirector() {
        return LastNameOfDirector;
    }

    public void setLastNameOfDirector(String lastNameOfDirector) {
        if (lastNameOfDirector == null){
            throw new NullPointerException("Last name of cant be null");
        }
        LastNameOfDirector = lastNameOfDirector;
    }

    public int getYearOfDirector() {
        return yearOfDirector;
    }

    public void setYearOfDirector(int yearOfDirector) {
        if (yearOfDirector < 0){
            throw new NumberFormatException("Year cant be negative");
        }
        this.yearOfDirector = yearOfDirector;
    }
}
