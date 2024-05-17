public abstract class RectangleDrawer {
    protected int width;
    protected int height;
    protected String text;

    public RectangleDrawer(int width, int height, String text) {
        this.width = width;
        this.height = height;
        this.text = text;
    }

    public abstract void draw();
}
