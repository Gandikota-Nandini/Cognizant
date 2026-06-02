import java.lang.reflect.Method;

class Sample {

    public void display() {
        System.out.println("Reflection Called");
    }
}

public class ReflectionDemo {

    public static void main(String[] args)
            throws Exception {

        Class<?> cls =
                Class.forName("Sample");

        Object obj =
                cls.getDeclaredConstructor()
                        .newInstance();

        Method[] methods =
                cls.getDeclaredMethods();

        for (Method m : methods) {
            System.out.println(m.getName());
        }

        Method method =
                cls.getMethod("display");

        method.invoke(obj);
    }
}