package com.company.homeWork.Task.Task1;

public class BadPupil extends  Pupil{
    public BadPupil() {

    }

    @Override
    public  void study(){
        System.out.println("BadPupil study bad");
    }
    @Override
    public  void write(){
        System.out.println("BadPupil write bad");
    }
    public  void read(){
        System.out.println("BadPupil read bad");
    }
    public  void relax(){
        System.out.println("BadPupil relax");
    }
}
