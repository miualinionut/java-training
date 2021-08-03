package code._4_student_effort.hard;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;

public class PersonInvocationHandler implements InvocationHandler {
    private IPerson target;
    public PersonInvocationHandler(IPerson target) {
        this.target = target;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Instant start = Instant.now();
        Object result = method.invoke(target, args);
        Instant stop = Instant.now();
        if (isLoggable(method)) {
            Duration duration = Duration.between(start, stop);
            System.out.println(target.getName() + " has been " + method.getName() + "ing for " + duration);
        }
        return result;
    }
    private boolean isLoggable(Method method) {
        Annotation[] annotations = method.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof LogExecutionTime) {
                return true;
            }
        }
        return false;
    }
}
