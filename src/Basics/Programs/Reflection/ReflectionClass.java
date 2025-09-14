package Basics.Programs.Reflection;

import java.lang.reflect.Constructor;

/*
 * - Reflection of Class
 * - Reflection of Methods
 * - Invoking the methods using Reflection
 * - Reflection of Fields
 * - Set the value of fields:
 *  - Public fields
 *  - Private fields - setAccessible(true). Important step. It breaks encapsulation
 * - Reflection of a constructor - It breaks singlton
 */

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectionClass {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalArgumentException {

        // ----------------------------------------------------------------- Reflection of Class

        Class<Eagle> eagleClass = Eagle.class;

        System.out.println(eagleClass.getName());
        System.out.println(Modifier.toString(eagleClass.getModifiers()));

        for (Field f : eagleClass.getFields()) {
            System.out.println(f);
        }  

        System.out.println("----------------------------------------");

        // ----------------------------------------------------------------- Reflection of Methods
        Method[] methods = eagleClass.getMethods(); // Returns all public methods

        for(Method method : methods) {
            System.out.println(method.getName() + " " + method.getReturnType() + " " + method.getDeclaringClass());
        }
        System.out.println();

        methods = eagleClass.getDeclaredMethods(); // All the methods (Private also) of this class only. No parent class methods. 
        for(Method method : methods) {
            System.out.println(method.getName() + " " + method.getReturnType() + " " + method.getDeclaringClass());
        }
        System.out.println("----------------------------------------");


        // ----------------------------------------------------------------- Invoking the methods using Reflection
        try {
            Class<Eagle> eagleClass2 = Eagle.class;
            Eagle eagleObject = new Eagle();
            Method flyMethod = eagleClass2.getMethod("run", int.class, boolean.class, String.class);
            flyMethod.invoke(eagleObject, 1, true, "hello");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("----------------------------------------");

        // ----------------------------------------------------------------- Reflection of Fields
        Field[] fields = eagleClass.getFields(); // No private fields
        // getDeclaredFields(); // Private fields as well

        for(Field field : fields) {
            System.out.println(field.getName() + " " + field.getType() + " "  + Modifier.toString(field.getModifiers()));
        }
        System.out.println("----------------------------------------");

        // ----------------------------------------------------------------- Set the value of fields

        System.out.println("xxxxxx Public Fields xxxxxx");

        Eagle eagleObj1 = new Eagle();
        Field field = eagleClass.getDeclaredField("breed");
        field.set(eagleObj1, "Golden Eagle");
        System.out.println(eagleObj1.breed);

        System.out.println("xxxxxx Private Fields xxxxxx");

        field = eagleClass.getDeclaredField("canSwim");
        // field.set(eagleObj1, true); // Error. Cannot set value of a private field
        field.setAccessible(true); // IMPORTANT Step
        field.set(eagleObj1, true);
        System.out.println("Value of canSwim: " + field.getBoolean(eagleObj1));
        System.out.println(eagleObj1.getCanSwim());

        System.out.println("----------------------------------------");

        // ----------------------------------------------------------------- Reflection of Constructor
        
        Class<Crow> crowClass = Crow.class;
        // To access private constructor.

        // get all declared constructors (including private)
        Constructor<?>[] constructors = crowClass.getDeclaredConstructors();

        for (Constructor<?> crowConstructor : constructors) {
            System.out.println("Modifier: " + Modifier.toString(crowConstructor.getModifiers()));

            crowConstructor.setAccessible(true);
            Crow crowObj;
            if (crowConstructor.getParameterCount() == 0) {
                crowObj = (Crow) crowConstructor.newInstance();
            } else {
                crowObj = (Crow) crowConstructor.newInstance(20); // example speed
            }
            crowObj.fly();
            crowObj.run();
        }
        
        // Get only one constructor based on the parameter type
        Constructor<Crow> dummy = crowClass.getDeclaredConstructor(int.class); // no-arg constructor
        dummy.setAccessible(true);
        Crow crow = (Crow) dummy.newInstance(30);
        crow.fly();
        crow.run();

    }
}
