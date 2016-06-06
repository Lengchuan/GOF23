package com.composite.example;

/**
 * 文本文件杀毒
 * 叶子组件
 * @authoor lengchuan
 * @date 16-6-3
 */
public class TxtFile implements AbstractFile {
    private  String name;

    public TxtFile(String name) {
        this.name = name;
    }

    public TxtFile() {
    }

    @Override
    public void killVirus() {

        System.out.println("---对Txt--"+name+"--进行杀毒");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
