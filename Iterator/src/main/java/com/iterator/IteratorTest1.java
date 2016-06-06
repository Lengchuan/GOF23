package com.iterator;


/**
 * @description
 * @authoor lengchuan
 * @date 16-6-3
 */
public class IteratorTest1 {

    public static void main(String[] args) {


        MyAggregate myAggregate = new MyAggregate();
        myAggregate.addObject("aaaaaaaa");
        myAggregate.addObject("bbbbbbbb");
        myAggregate.addObject("cccccccc");
        myAggregate.addObject("dddddddd");

        MyIterator iterator = myAggregate.getiterator();
        while (iterator.hasNext()){
            System.out.println(iterator.getCurrentObj().toString());
            iterator.next();
        }

    }
}
