package com.composite;

/**
 * 容器组件
 * @authoor lengchuan
 * @date 16-6-3
 */
public interface Composite extends Component{
    void add(Component component);

    void remove(Component component);

    Component getChild(int index);
}
