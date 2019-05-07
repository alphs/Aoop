package Oop_a3.lecture10;

import java.lang.annotation.Documented;

@Documented
public @interface ClassPreamble {
	String author();
	String date();
	int currentRevision() default 1;
	String lastModified() default "N/A";
	String lastModifiedBy() default "N/A";
	String[] reviewers();
}
