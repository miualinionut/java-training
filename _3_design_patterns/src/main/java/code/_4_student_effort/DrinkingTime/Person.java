package code._4_student_effort.DrinkingTime;

public class Person implements IPerson {
    private String name;

    private Person(Builder builder) {
        this.name = builder.name;
    }

    @Override
    public void walk() {
        System.out.println(name + "is walking!");
    }

    @Override
    public void drink() {
        System.out.println(name + "is drinking!");
    }

    @Override
    public String getName() {
        return name;
    }

    public static class Builder {
        private String name;

        public Builder setName(String name) {
            this.name = name;

            return this;
        }

        public IPerson build() {
            Person person = new Person(this);
            IPerson personProxy = (IPerson) java.lang.reflect.Proxy.newProxyInstance(
                    PersonInvocationHandler.class.getClassLoader(),
                    new Class[]{IPerson.class},
                    new PersonInvocationHandler(person));

            return personProxy;
        }
    }
}
