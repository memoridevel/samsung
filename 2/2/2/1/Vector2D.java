public class Vector2D {
    private final double vX, vY;

    public Vector2D() {
        vX = vY = 1;
    }

    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
    }

    public Vector2D(Vector2D v) {
        this(v.vX, v.vY);
    }

    public void print() {
        System.out.printf("(%.2f, %.2f)\n", vX, vY);
    }
}