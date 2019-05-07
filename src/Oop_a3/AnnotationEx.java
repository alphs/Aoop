package Oop_a3;

import java.lang.annotation.Annotation;

public class AnnotationEx implements AnnotationImpl {
    @Override
    public <R> R accept(AnnotationVisitor aV, R initialResult) {
        return aV.visit(this, initialResult);
    }

    @Override
    public String name() {
        return null;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return null;
    }
}
