package Oop_a3.Assignment_3re2.XML.Exporter;

import Oop_a3.Assignment_3re2.Saver;
import Oop_a3.Assignment_3re2.Tree;

public class XML_Exporter {
    public static void main(String[] args){

        //noinspection unchecked
        Tree t =
                new Tree<>("top", new Tree[]{
                        new Tree<>("sub1"),
                        new Tree<>("top2",new Tree[]{
                                new Tree<>("sub3"),
                                new Tree<>("sub4")
                        }),
                        new Tree<>("sub2")
                }
        );

        Saver s = new Saver();
        String r = null;
            r = s.save(t);
        System.out.println(r + "\n");

        /*
        Method[] methodArr = t.getClass().getDeclaredMethods();

        System.out.println(Arrays.toString(methodArr[0].getDeclaredAnnotations()));
        System.out.println(methodArr[0]);
        System.out.println();
        System.out.println(Arrays.toString(methodArr[1].getDeclaredAnnotations()));
        System.out.println(methodArr[1]);


        System.out.println(System.lineSeparator() + Arrays.toString(t.getClass().getDeclaredMethods()));
        */

    }

}
