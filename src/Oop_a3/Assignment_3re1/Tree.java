package Oop_a3.Assignment_3re1;

import Oop_a3.Assignment_3re1.XML.Annotation.Element;
import Oop_a3.Assignment_3re1.XML.Annotation.ElementField;
import Oop_a3.Assignment_3re1.XML.Annotation.SubElements;

@Element(name="node")
public class Tree<T> {

    private Tree<T>[] children = null;
    private T value;

    public Tree(T v, Tree<T>[] trees) {
        children = trees;
        value = v;
    }

    public Tree(T v) {
        value = v;
    }

    @SubElements(name="subnodes")
    public Tree<T>[] getChildren() {
        return children;
    }

    @ElementField(name="value")
    public T getValue() {
        return value;
    }
}

/**
 Structure:

 <'@Element annoted name' '@ElementField annoted name'=" 'value of node' ">
    <'@Subnode annoted name'>
        <'@Element annoted name' '@ElementField annoted name'=" 'value of node' "/>
        <'@Element annoted name' '@ElementField annoted name'=" 'value of node' "/>
    </'@Subnode annoted name'>
 </'@Elemen annoted name't>

 */