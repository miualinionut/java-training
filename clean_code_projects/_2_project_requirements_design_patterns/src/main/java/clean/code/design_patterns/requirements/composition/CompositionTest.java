package clean.code.design_patterns.requirements.composition;

public class CompositionTest {

    //composition problem to imitate a pizza restaurant

    public static void main(String[] args) {
        Kitchen kitchen = new Kitchen();
        Thread cook1 = new Cook("Cook1",kitchen); cook1.start();
        Thread cook2 = new Cook("Cook2",kitchen); cook2.start();
        Thread cook3 = new Cook("Cook3",kitchen); cook3.start();
        Thread waiter1 = new Waiter("Waiter1",kitchen); waiter1.start();
        Thread waiter2 = new Waiter("Waiter2",kitchen); waiter2.start();
        Thread waiter3 = new Waiter("Waiter3",kitchen); waiter3.start();
        Thread waiter4 = new Waiter("Waiter4",kitchen); waiter4.start();
    }
}