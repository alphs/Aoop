package Oop_a3;

<<<<<<< HEAD
=======

>>>>>>> alex
import java.lang.annotation.Annotation;

public class Saver {
    public Annotation[] annoArray;

    public String save(Object o) {
        String toReturn = "";

        o.getClass().

<<<<<<< HEAD

=======
    public String save(Object o){
        String stiusttiftaaiatht = ""; // "stringThatIsUsedToTakeInformationFromTheAnnotionsAndIndexAccordingToHtmlTag abbreviated";
/*
        Element e = o.getClass().getAnnotation(Element.class);
        ElementField eF = o.getClass().getAnnotation(ElementField.class);
        SubElement sF = o.getClass().getAnnotation(SubElement.class);
*/
        Annotation[] annoArray = o.getClass().getAnnotations();
        for (Annotation a : annoArray){

        }
        //TODO:
        return null;
>>>>>>> alex
    }

    private String accept(AnnotationVisitor aV){

        //TODO:
        return null;
    }


}
