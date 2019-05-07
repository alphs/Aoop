package Oop_a3.lecture10;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Date;

public class FieldTester {

	public static void main(String[] args) throws IllegalAccessException {
		System.out.println(spyFields(new Date()));
	}
	
	public static String spyFields(Object o) throws IllegalAccessException {
		String result = "";
		for(Field f : o.getClass().getDeclaredFields()) {
			if(!Modifier.isStatic(f.getModifiers())) {
				f.setAccessible(true);
				result += f.getType()+" "+f.getName()+" = "+f.get(o)+"\n";
			}
		}
		return result;
		
	}

}
