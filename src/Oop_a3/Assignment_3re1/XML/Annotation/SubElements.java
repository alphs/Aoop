/**
 * Im not a goblin
 * im not a gnelf
 * Im a gnome, and you've been gnooooomeeeeed
 */
package Oop_a3.Assignment_3re1.XML.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface SubElements {
    String name() default "<@SubElements(\"\")>";
}
