package com.iterator;

/**
 * 迭代器接口
 * @authoor lengchuan
 * @date 16-6-3
 */
public interface MyIterator {

    void  first();//将游标指向第一个
    void  next();
    void  last();
    boolean hasNext();
    boolean isFirst();
    boolean isLast();

    /**
     * 获取当前游标所指向的对象
     * @return
     */
    Object getCurrentObj();
}
