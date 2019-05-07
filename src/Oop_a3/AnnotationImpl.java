package Oop_a3;

import Oop_a3.XML.Annotation.Element;
import Oop_a3.XML.Annotation.ElementField;
<<<<<<< HEAD
import Oop_a3.XML.Annotation.SubElements;


interface AnnotationImpl extends Element, ElementField, SubElements{
=======
import Oop_a3.XML.Annotation.SubElement;


interface AnnotationImpl extends ElementField, Element, SubElement {
>>>>>>> alex
     <R> R accept(AnnotationVisitor aV, R initialResult);
}

