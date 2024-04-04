package org.example;

public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    public Student(int id, String name, int grade){
        this.id= id;
        this.name= name;
        this.grade= grade;
        this.feesPaid= 0; // because it is not an argument, it will however be updated over time
        this.feesTotal= 20000; // total amount the student is paying and hence doesn't need to be updated
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public void setGrade(int grade) {
        this.grade = grade; // meaning we are setting the grade of the student to grade
    }

    public void payFees(int fees) {
        fees = feesPaid + fees;
//        feesPaid+=fees; // created a new method to keep updating the fees each student pay.
        School.updateTotalMoneyEarned(feesPaid);
    }
    public int getRemainingFees (int fees){
        return feesTotal- feesPaid;
    }

    @Override
    public String toString() {
        return "student's name " + name + " total fees paid so far " + feesPaid;
    }
}
