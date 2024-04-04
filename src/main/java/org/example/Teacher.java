package org.example;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    public Teacher (int id, String name, int salary){
        this.id= id;
        this.name= name;
        this.salary= salary;
        this.salaryEarned =0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void receiveSalary(int salary){
        salaryEarned = salaryEarned + salary;
//        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "name of the teacher " + name + " total salary earned so far " + salaryEarned;
    }
}
