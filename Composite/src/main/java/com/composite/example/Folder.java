package com.composite.example;

import java.util.ArrayList;
import java.util.List;

/**
 * 文件夹
 * 容器组件
 * @authoor lengchuan
 * @date 16-6-3
 */
public class Folder implements AbstractFile{

    private String name;

    //用来存放容器构件下的子节点
    private List<AbstractFile> files = new ArrayList<AbstractFile>();

    public Folder() {
    }

    public Folder(String name) {
        this.name = name;
    }


    public void  add(AbstractFile file){
        files.add(file);
    }

    public void remove(AbstractFile file){
        files.remove(file);
    }

    public AbstractFile getChild(int index){
        return files.get(index);
    }

    @Override
    public void killVirus() {

        System.out.println("对文件夹---"+name+"进行查杀");
        //遍历子容器
        for (AbstractFile file : files){
            file.killVirus();//递归遍历
        }
    }
}
