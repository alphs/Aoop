/**
 * Im not a goblin
 * im not a gnelf
 * Im a gnome, and you've been gnooooomeeeeed
 */
package Oop_a3.XML.Annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface SubElements {
    String nameEnd = "   </subnodes>";

    String name() default "   <subnodes>";
}
