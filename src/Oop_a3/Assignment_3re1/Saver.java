package Oop_a3.Assignment_3re1;

import Oop_a3.Assignment_3re1.XML.Annotation.Element;
import Oop_a3.Assignment_3re1.XML.Annotation.ElementField;
import Oop_a3.Assignment_3re1.XML.Annotation.SubElements;

import javax.naming.directory.NoSuchAttributeException;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Saver_re1 {

    private Element e;
    private SubElements se;
    private ElementField ef;
    private Method elementFieldMethod;
    private Method subElementsMethod;

    public String save(Object o) throws NoSuchAttributeException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        String toReturn = "";

        Class<?> c = o.getClass();
        e = c.getAnnotation(Element.class);
        if (e == null) { throw new NoSuchAttributeException("The Class: " + c.toString() + " do not have the @Element annotation." ); }

        for (Method m : c.getDeclaredMethods()){
            if (m.isAnnotationPresent(ElementField.class)) {
                ef = m.getAnnotation(ElementField.class);
                elementFieldMethod = m;
            }
            if (m.isAnnotationPresent(SubElements.class)) {
                se = m.getAnnotation(SubElements.class);
                subElementsMethod= m;
            }
        }
        Object[] objectsArray = new Object[]{o, subElementsMethod, elementFieldMethod};
        for (Object obj : objectsArray){
            System.out.println(obj.getClass().isAnnotationPresent(Element.class));

            toReturn += getTagForTreeNode(o, c, "", e);
        }

        return toReturn;
    }

    /** bad */
    private <T> String getTagForTreeNode(Object o, Class<T> c, String resultString, Annotation a) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        System.out.println(o.getClass().isAnnotationPresent(a.getClass()));
        if(o.getClass().isAnnotationPresent(a.getClass())){
            System.out.println("hej");
            resultString += "<" + e.name() + " " + ef.name() + "=" + elementFieldMethod.invoke(o) + ">";
            getTagForTreeNode(subElementsMethod.invoke(o), c, resultString, se);
            resultString += "</" + se.name() + ">";
        }
        else{
            /*
            Array.newInstance(c, );
            subElementsMethod.invoke(o);

            for (int i = 0; i < ; i++) {
                resultString += elementFieldMethod.invoke(objArr[i]) + System.lineSeparator();
            }

             */
        }
            resultString += "</" + e.name() + ">";
        return resultString;
    }

    private String indentStructure(Object o, String string){


        return string;
    }
}

/**
Desired output:

    <node value="top">
        <subnodes>
            <node value="sub1"/>
            <node value="sub2"/>
        </subnodes>
    </node>


Structure:

 <'@Element annotated name' '@ElementField annotated name'=" 'value of node'">
    <'@Subnode annotated name'>
        <'@Element annotated name' '@ElementField annotated name'=" 'value of node'"/>
        <'@Element annotated name' '@ElementField annotated name'=" 'value of node'"/>
    </'@Subnode annotated name'>
 </'@Element annotated name't>

 */