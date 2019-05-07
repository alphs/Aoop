package Oop_a3.XML.Annotation;

import Oop_a3.AnnotationEx;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Element {
    String name() default "<node value= \"\"";
}
