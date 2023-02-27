package ClassAndObjects.School;

import ClassAndObjects.School.Course;

public class Student {

    String name,classes;
    int stuNo;
    Course mat;
    Course kimya;
    Course fizik;
    double avarage;
    boolean isPass;

    Student(String name, int stuNo, String classes, Course mat, Course kimya, Course fizik) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.kimya = kimya;
        this.fizik = fizik;
    }

    void addBulkExamNote(int mat, int fizik, int kimya){
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
    }

    void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Enter your grades properly..");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Average : " + this.avarage);
            if (this.isPass) {
                System.out.println("You passed class");
            } else {
                System.out.println("You didnt pass class");
            }
        }
    }

    void calcAvarage() {
        this.avarage = (this.fizik.note + this.kimya.note + this.mat.note) / 3;
    }

    boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    void printNote() {
        System.out.println("=======================");
        System.out.println("Student         : " + this.name);
        System.out.println("Math Grade      : " + this.mat.note);
        System.out.println("Physic Grade    : " + this.fizik.note);
        System.out.println("Chemistry Grade : " + this.kimya.note);
    }

}