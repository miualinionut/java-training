package code._4_student_effort.HardCodeChallange2;

public class Person implements IPerson{
    private String name;

    private Person(Person.Builder builder) {
        this.name = builder.name;
    }

    @Override
    public void walk() {
        System.out.println(this.name + " is walking!");
    }

    @Override
    public void drink() {
        try {
            Thread.sleep(100);
        } catch (Exception e) {
        }
        System.out.println(this.name + " is drinking!");
    }

    @Override
    public String getName() {
        return this.name;
    }

    static class Builder {
        private String name;

        public Person.Builder setName(String name) {
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
