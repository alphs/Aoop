package Oop_a3.Assignment_3re1.XML.Exporter;

import Oop_a3.Assignment_3re1.Saver_re1;
import Oop_a3.Assignment_3re1.Tree;

import javax.naming.directory.NoSuchAttributeException;
import java.lang.reflect.InvocationTargetException;

public class XML_Exporter {
    public static void main(String[] args) throws NoSuchAttributeException, NoSuchMethodException, IllegalAccessException, InvocationTargetException {

        //noinspection unchecked
        Tree<String> t = new Tree<String>(
                "top", new Tree[]{
                        new Tree<>("sub1"),
                        new Tree<>("sub2")
                }
        );

        Saver_re1 s = new Saver_re1();
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
