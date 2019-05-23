package Oop_a3.Assignment_3re2.XML.Exporter;

import Oop_a3.Assignment_3re2.Saver;
import Oop_a3.Assignment_3re2.Tree;

public class XML_Exporter {
    public static void main(String[] args){

        //noinspection unchecked
        Tree t =
                new Tree<>("top", new Tree[]{
                        new Tree<>("sub1"),
                        new Tree<>("top2", new Tree[]{
                                new Tree<>("sub3"),
                                new Tree<>("sub4"),
                                new Tree<>("top2", new Tree[]{
                                        new Tree<>("sub3", new Tree[]{
                                                new Tree<>("sub3"),
                                                new Tree<>("sub4"),
                                                new Tree<>("top2", new Tree[]{
                                                        new Tree<>("sub3"),
                                                        new Tree<>("sub4")
                                                }),
                                        }),
                                        new Tree<>("sub4")
                                }),
                        }),
                        new Tree<>("top3", new Tree[]{
                                new Tree<String>("sub5"),
                                new Tree<String>("sub6"),
                                new Tree<>("sub7")
                        })
                }
        );

        Tree tt = new Tree<>("one");
        @SuppressWarnings("unchecked")
        Tree ttt = new Tree<>("one", new Tree[]{new Tree<>("1"), new Tree<>("2"), new Tree<>("3")});

        Saver s = new Saver();
        String r = null;
            r = s.save(t);
        System.out.println(r);
        System.out.println("\n" + s.save(tt));
        System.out.println("\n" + s.save(ttt));

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
