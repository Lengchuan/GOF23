package com.memento;

/**
 * 原发器类
 * @authoor lengchuan
 * @date 16-6-6
 */
public class Emp {

    private String name;
    private int age;
    private double salary;

    public Emp() {
    }

    public Emp(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    /**
     * 进行备忘录操作
     * @return
     */
    public EmpMemento memento(){
        System.out.println("进行备忘录操作");
        return new EmpMemento(this);
    }

    /**
     * 进行数据恢复
     * @param empMemento
     */
    public void  recovery(EmpMemento empMemento){
        System.out.println("进行数据恢复");
        this.name = empMemento.getName();
        this.age = empMemento.getAge();
        this.salary = empMemento.getSalary();
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
