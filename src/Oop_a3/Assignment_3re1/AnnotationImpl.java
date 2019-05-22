package Oop_a3.Assignment_3re1;

import Oop_a3.Assignment_3re1.XML.Annotation.Element;
import Oop_a3.Assignment_3re1.XML.Annotation.ElementField;
import Oop_a3.Assignment_3re1.XML.Annotation.SubElements;


interface AnnotationImpl extends Element, ElementField, SubElements {
    <R> R accept(AnnotationVisitor aV, R initialResult);
}

