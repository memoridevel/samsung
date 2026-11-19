public class Vector2D {
    private double vX, vY;
    static int count = 0;

    public Vector2D() {
        vX = vY = 1;
        count++;
    }

    public Vector2D(double vX, double vY) {
        this.vX = vX;
        this.vY = vY;
        count++;
    }

    public Vector2D(Vector2D v) {
        this(v.vX, v.vY);
    }

    public void print() {
        System.out.printf("(%.2f, %.2f)\n", vX, vY);
    }

    public double length() {
        return Math.sqrt(Math.pow(vX, 2) + Math.pow(vY, 2));
    }

    public void add(Vector2D v) {
        this.vX += v.vX;
        this.vY += v.vY;
    }

    public void sub(Vector2D v) {
        this.vX -= v.vX;
        this.vY -= v.vY;
    }

    public void scale(double scaleFactor) {
        this.vX *= scaleFactor;
        this.vY *= scaleFactor;
    }

    public void normalized() {
        final double len = length();
        this.vX /= len;
        this.vY /= len;
    }

    public double dotProduct(Vector2D v) {
        return this.vX * v.vX + this.vY * v.vY;
    }
}