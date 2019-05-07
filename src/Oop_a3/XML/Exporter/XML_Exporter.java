package Oop_a3.XML.Exporter;

import Oop_a3.Saver;
import Oop_a3.Tree;

public class XML_Exporter {
    public static void main(String[] args) {

        //noinspection unchecked
        Tree<String> t = new Tree<String>("top",
                new Tree[]{
                        new Tree<>("sub1"),
                        new Tree<>("sub2")
                }
        );

        Saver s = new Saver();
        String r = s.save(t);
        System.out.println(r);
    }
}
