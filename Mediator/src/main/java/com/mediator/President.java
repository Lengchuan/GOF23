package com.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * 总经理
 * @authoor lengchuan
 * @date 16-6-6
 */
public class President implements  Mediator{

    private Map<String,Department> departmentMap = new HashMap<String, Department>();
    public void register(String dname, Department department) {
        departmentMap.put(dname,department);
    }

    public void command(String dname) {
        departmentMap.get(dname).selfAction();

    }
}
