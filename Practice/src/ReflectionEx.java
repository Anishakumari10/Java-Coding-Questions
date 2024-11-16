import java.lang.reflect.Constructor;

public class ReflectionEx {

	public static void main(String[] args) {

		try {
		    Class<?> clazz = Class.forName("packageA.car");
		    Constructor<?> constructor = clazz.getConstructor();
		    System.out.println(constructor.toString());
		    Object instance = constructor.newInstance();
		    System.out.println(instance.toString());
		    // Now 'instance' is an instance of MyClass
		} catch (Exception e) {
		    e.printStackTrace();
		}


}
}
