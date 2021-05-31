package code._4_student_effort.DrinkingTime;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;


public class PersonInvocationHandler implements java.lang.reflect.InvocationHandler {
    private IPerson person;

    public PersonInvocationHandler(IPerson person) {
        this.person = person;
    }

    private boolean isAnnotated(Method method) {
        Annotation[] annotations = method.getAnnotations();
        for (Annotation annotation :
                annotations) {
            if (annotation instanceof LogExecutionTime)
                return true;
        }
        return false;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long start = System.nanoTime();
        Object result = method.invoke(person, args);
        long elapsed = System.nanoTime() - start;

        if (isAnnotated(method)) {
            System.out.println(person.getName()
                    + " has been "
                    + method.getName()
                    + "ing for "
                    + elapsed/1000000
                    + "."
                    + elapsed%1000000
                    + " seconds");
        }
        return result;
    }
}
