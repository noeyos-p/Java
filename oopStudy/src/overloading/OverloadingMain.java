package overloading;

public class OverloadingMain {
    public static void main(String[] args) {
        Running running = new Running();
        running.run();
        running.run(3);
        // running.run 하면
        // running.run, running.run (int k) 두가지가 뜸
        running.run(2.1);
        running.run(1,5);
    }
}
