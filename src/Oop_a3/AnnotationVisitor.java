package Oop_a3;

import Oop_a3.XML.Annotation.Element;
import Oop_a3.XML.Annotation.ElementField;
<<<<<<< HEAD
import Oop_a3.XML.Annotation.SubElements;
=======
import Oop_a3.XML.Annotation.SubElement;
>>>>>>> alex

public class AnnotationVisitor {

    public String visit(Element e, String initalResult){
<<<<<<< HEAD
=======

>>>>>>> alex
        return null;
    }

    public String visit(ElementField eF, String initalResult){
        return null;
    }

<<<<<<< HEAD
    public String vivit(SubElements sE, String initalResult){
        return null;
    }

    public <R> R visit(AnnotationEx annotationEx, R initialResult) {
=======
    public String vivit(SubElement sE, String initalResult){
        return null;
    }

    public <R> R visit(AnnotationImpl annotation, R initialResult) {
>>>>>>> alex
        return initialResult;
    }
}
