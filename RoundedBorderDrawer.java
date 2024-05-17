public class RoundedBorderDrawer extends RectangleDrawer {
    public RoundedBorderDrawer(int width, int height, String text) {
        super(width, height, text);
    }

    @Override
    public void draw() {
        // Desenha o retângulo com bordas arredondadas
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i == 0 && j == 0) || (i == 0 && j == width - 1) || (i == height - 1 && j == 0)
                        || (i == height - 1 && j == width - 1)) {
                    System.out.print("+");
                } else if (i == 0 || i == height - 1) {
                    System.out.print("-");
                } else if (j == 0 || j == width - 1) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // Desenha o texto centralizado
        int textStart = (width - text.length()) / 2;
        for (int i = 0; i < (height - 2) / 2; i++) {
            System.out.println();
        }
        System.out.print(" ");
        for (int i = 0; i < textStart; i++) {
            System.out.print(" ");
        }
        System.out.print(text);
        System.out.println();
    }
}
