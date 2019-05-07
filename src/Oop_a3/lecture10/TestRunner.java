package Oop_a3.lecture10;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRunner {

	public static void main(String[] args) {
		try {
			if(args.length < 1) System.exit(0);
			String className = args[0];
			Class<?> c = Class.forName(className);
			Object o = c.newInstance();
			for(Method m : c.getDeclaredMethods()) {
				Test t = m.getAnnotation(Test.class);
				if(t != null) {
					try {
						m.invoke(o);
					}catch(InvocationTargetException e) {
						Throwable cause = e.getCause();
						System.out.println("Test failed, test method "+m.getName()+" finished with exception\n\t"+cause.getClass().getName()+": "+cause.getMessage());
					}
				}
			}
		}catch(Exception e) {
			System.out.println("Test execution failed:");
			e.printStackTrace();
		}
	}

}
