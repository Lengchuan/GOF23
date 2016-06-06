package com.composite.example;

/**
 * 图片杀毒
 * 叶子组件
 * @authoor lengchuan
 * @date 16-6-3
 */
public class ImgeFile implements AbstractFile {
    private  String name;

    public ImgeFile(String name) {
        this.name = name;
    }

    public ImgeFile() {
    }

    @Override
    public void killVirus() {

        System.out.println("---对图片--"+name+"--进行杀毒");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
