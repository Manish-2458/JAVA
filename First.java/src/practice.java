class cylinder {
    private int radius, height;

    public void setR(int radius) {
        this.radius = radius;
    }

    public int getR() {
        return radius;
    }

    public void setH(int height) {
        this.height = height;
    }

    public int getH() {
        return height;
    }
}

public class practice {
    public static void main(String[] args) {
        cylinder c = new cylinder();
        c.setR(1);
        c.setH(1);
        System.out.println();
    }
}
