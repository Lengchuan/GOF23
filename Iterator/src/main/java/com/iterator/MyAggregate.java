package com.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 *  聚合类
 * @authoor lengchuan
 * @date 16-6-3
 */
public class MyAggregate {

    private List<Object> objects = new ArrayList<Object>();

    public MyAggregate(List<Object> objects) {
        this.objects = objects;
    }

    public MyAggregate() {
    }

    public void  addObject(Object o){
        objects.add(o);
    }

    public void  removeObject(Object o){
        objects.remove(o);
    }

    /**
     * 获得迭代器
     * @return
     */
    public MyIterator getiterator(){

        return new AggregateIterator();

    }

    /**
     * 使用内部类定义迭代器
     */
    protected   class AggregateIterator implements MyIterator{

        private int cursor;//定义游标

        public void first() {
            cursor = 0;
        }

        public void next() {
            if (cursor<objects.size()){
                cursor++;
            }

        }

        public void last() {
            cursor = objects.size();
        }

        public boolean hasNext() {
            if (cursor<objects.size()){
                return true;
            }
            return false;
        }

        public boolean isFirst() {
            return cursor==0?true:false;
        }

        public boolean isLast() {
            return cursor==(objects.size()-1)?true:false;
        }

        /**
         * 获取当前游标所指向的对象
         *
         * @return
         */
        public Object getCurrentObj() {
            return objects.get(cursor);
        }
    }

    public List<Object> getObjects() {
        return objects;
    }

    public void setObjects(List<Object> objects) {
        this.objects = objects;
    }
}
