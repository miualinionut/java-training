package code._2_challenge.hard._2_dringking_time;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.time.Duration;
import java.time.Instant;

public class PersonInvocationHandler implements java.lang.reflect.InvocationHandler {
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