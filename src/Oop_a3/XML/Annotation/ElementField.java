package Oop_a3.XML.Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ElementField {
    String name() default  "<node value = \"\" ";
}
