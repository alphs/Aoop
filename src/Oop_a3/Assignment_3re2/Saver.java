package Oop_a3.Assignment_3re2;

import Oop_a3.Assignment_3re2.XML.Annotation.Element;
import Oop_a3.Assignment_3re2.XML.Annotation.ElementField;
import Oop_a3.Assignment_3re2.XML.Annotation.SubElements;

import javax.naming.directory.NoSuchAttributeException;
import java.awt.*;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;

public class Saver {

    private Element e;
    private SubElements se;
    private ElementField ef;
    private Method elementFieldMethod;
    private Method subElementsMethod;

    public String save(Object o) {

        Class<?> c = o.getClass();
        e = c.getAnnotation(Element.class);
        if (e == null) {
            try {
                throw new NoSuchAttributeException("The Class: " + c.toString() + " do not have the @Element annotation.");
            }
            catch (NoSuchAttributeException ex) {
                ex.printStackTrace();
            }
        }
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

        try {
             return getTagForTreeNode(o);
        }
        catch (InvocationTargetException | IllegalAccessException ex) {
            ex.printStackTrace();
        }

        return null;
    }

    private <T> String getTagForTreeNode(Object o) throws InvocationTargetException, IllegalAccessException {
        StringBuilder string = new StringBuilder("<"+e.name()+" "+ef.name()+"=\""+elementFieldMethod.invoke(o)+"\">");

        @SuppressWarnings("unchecked")
        T[] array = (T[]) subElementsMethod.invoke(o);
        if (array != null) {
            string = indent(string, new StringBuilder("    "), array);

            return string.append(System.lineSeparator()).append("</").append(e.name()).append(">").toString();
        }
        else {
            int strLength = string.length();
            return string.replace(strLength - ">".length(), strLength, "/>").toString();
        }
    }

    private <T> StringBuilder indent(StringBuilder result, StringBuilder indentation, T[] t){

        result.append(System.lineSeparator())
                .append(indentation)
                .append("<").append(se.name()).append(">");

        indentation.append("    ");
        for (T tt : t){
            try {
                // "    <node value="sub1"/>"
                result.append(System.lineSeparator()).append(indentation).append("<").append(e.name()).append(" ")
                        .append(ef.name()).append("=\"")
                        .append(elementFieldMethod.invoke(tt))
                        .append("\"/>");

                @SuppressWarnings("unchecked")
                T[] arr2expand = (T[]) subElementsMethod.invoke(tt);
                if (arr2expand != null){
                    result.append(indent(new StringBuilder(), indentation.append("    "), arr2expand));
                    indentation.delete(0, "    ".length());
                }
            }
            catch (IllegalAccessException | InvocationTargetException ex) {
                ex.printStackTrace();
            }
        }

        return result.append(System.lineSeparator()).append(indentation.delete(0, "    ".length()))
                .append("</").append(se.name()).append(">");
    }


}



/*
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