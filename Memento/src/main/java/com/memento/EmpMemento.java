package com.memento;

/**
 * 备忘录类
 * @authoor lengchuan
 * @date 16-6-6
 */
public class EmpMemento {

    private String name;
    private int age;
    private double salary;

    public EmpMemento() {
    }
    public EmpMemento(Emp emp) {
        this.age = emp.getAge();
        this.name = emp.getName();
        this.salary = emp.getSalary();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
