package com.company.homeWork.Task.Task1;

public class ClassRoom {
   // Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.

    public ClassRoom(Pupil pupil) {
        pupil.write();
        pupil.read();
        pupil.read();
        pupil.relax();
    }
}
