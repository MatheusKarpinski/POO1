public class Main {
    public static void main(String[] args) {
        System.out.println("Progressão Aritmética:");
        ArithmeticProgression ap = new ArithmeticProgression(5, 2);
        for (int i = 0; i < 5; i++) {
            System.out.println(ap.next());
        }
        System.out.println("Reiniciando a progressão aritmética:");
        ap.reset();
        for (int i = 0; i < 5; i++) {
            System.out.println(ap.next());
        }

        System.out.println("\nProgressão Geométrica:");
        GeometricProgression gp = new GeometricProgression(3, 3);
        for (int i = 0; i < 5; i++) {
            System.out.println(gp.next());
        }
        System.out.println("Reiniciando a progressão geométrica:");
        gp.reset();
        for (int i = 0; i < 5; i++) {
            System.out.println(gp.next());
        }

        System.out.println("\nProgressão Fibonacci:");
        FibonacciProgression fp = new FibonacciProgression(0, 1);
        for (int i = 0; i < 10; i++) {
            System.out.println(fp.next());
        }
        System.out.println("Reiniciando a progressão fibonacci:");
        fp.reset();
        for (int i = 0; i < 10; i++) {
            System.out.println(fp.next());
        }
    }
}
