package com.memento;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-6
 */
public class MementoTest1 {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();

        Emp emp = new Emp("lengchuan",12,22.00);
        System.out.println("第一次创建对象--->name:"+emp.getName()+"--->age："+emp.getAge()+"--->salary:"+emp.getSalary());
        careTaker.setEmpMemento(emp.memento());//进行一次备份

        emp.setAge(22);
        System.out.println("第二次修改对象--->name:"+emp.getName()+"--->age："+emp.getAge()+"--->salary:"+emp.getSalary());

        emp.recovery(careTaker.getEmpMemento());//恢复
        System.out.println("第一次恢复对象--->name:"+emp.getName()+"--->age："+emp.getAge()+"--->salary:"+emp.getSalary());
    }
}
