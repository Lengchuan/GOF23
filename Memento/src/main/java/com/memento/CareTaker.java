package com.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 负责人类
 * 负责管理备忘录对象
 * @authoor lengchuan
 * @date 16-6-6
 */
public class CareTaker {

    private EmpMemento empMemento;

    //private List<EmpMemento> empMementoList = new ArrayList<EmpMemento>();

    public EmpMemento getEmpMemento() {
        return empMemento;
    }

    public void setEmpMemento(EmpMemento empMemento) {
        this.empMemento = empMemento;
    }
}
