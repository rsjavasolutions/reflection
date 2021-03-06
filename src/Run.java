import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.math.BigDecimal;

public class Run {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException {

        Class carClass = Class.forName("model.Car");

        Constructor carConstructor = carClass.getDeclaredConstructors()[0];
        carConstructor.setAccessible(true);

        Object car = carConstructor.newInstance("Ford", "Mustang", new BigDecimal("89000.01"));

        Method method = carClass.getDeclaredMethod("showDetails");
        method.setAccessible(true);

        Object carDetails = (String) method.invoke(car);
        System.out.println(carDetails);

    }
}
