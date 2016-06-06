package com.composite.example;

/**
 * @description
 * @authoor lengchuan
 * @date 16-6-3
 */
public class ExampleTest1 {

    public static void main(String[] args) {
        AbstractFile f3,f4;
        Folder f1 = new Folder("一级文件夹");
        Folder f2 = new Folder("二级文件夹");
        f1.add(f2);

        f3 = new ImgeFile("图片");
        f4 = new TxtFile("Txt");
        f2.add(f3);
        f2.add(f4);

        f1.killVirus();

    }
}
