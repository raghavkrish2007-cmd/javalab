import java.util.Random;

class NumberGenerator extends Thread {
    static int number;
    static boolean available = false;

    public void run() {
        Random r = new Random();

        for (int i = 1; i <= 5; i++) {
            synchronized (NumberGenerator.class) {
                number = r.nextInt(10) + 1;
                System.out.println("Generated Number: " + number);

                available = true;
                NumberGenerator.class.notifyAll();

                try {
                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class Square extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            synchronized (NumberGenerator.class) {
                try {
                    NumberGenerator.class.wait();
                } catch (Exception e) {
                    System.out.println(e);
                }

                if (NumberGenerator.number % 2 == 0) {
                    System.out.println("Square: " +
                        (NumberGenerator.number * NumberGenerator.number));
                }
            }
        }
    }
}

class Cube extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            synchronized (NumberGenerator.class) {
                try {
                    NumberGenerator.class.wait();
                } catch (Exception e) {
                    System.out.println(e);
                }

                if (NumberGenerator.number % 2 != 0) {
                    System.out.println("Cube: " +
                        (NumberGenerator.number * NumberGenerator.number *
                         NumberGenerator.number));
                }
            }
        }
    }
}

public class MultiThreadNumber {
    public static void main(String[] args) {
        NumberGenerator n = new NumberGenerator();
        Square s = new Square();
        Cube c = new Cube();

        n.start();
        s.start();
        c.start();
    }
}
