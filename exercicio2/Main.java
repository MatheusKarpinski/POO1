public class Main {
    public static void main(String[] args) {
        RectangleDrawer simpleRect = new SimpleBorderDrawer(20, 8, "Hello");
        simpleRect.draw();
        System.out.println("\n\n");

        RectangleDrawer roundedRect = new RoundedBorderDrawer(20, 8, "World");
        roundedRect.draw();
    }
}
