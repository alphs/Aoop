package Oop_a3;

import Oop_a3.XML.Annotation.Element;
import Oop_a3.XML.Annotation.ElementField;
import Oop_a3.XML.Annotation.SubElement;

public class AnnotationVisitor {

    public String visit(Element e, String initalResult){

        return null;
    }

    public String visit(ElementField eF, String initalResult){
        return null;
    }

    public String vivit(SubElement sE, String initalResult){
        return null;
    }

    public <R> R visit(AnnotationImpl annotation, R initialResult) {
        return initialResult;
    }
}
