package thuchanh3;

public class cylinder1 {
    private int radius;
    private int height;

    public cylinder1(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double getBaseArea(){
        return Math.PI*radius+radius;
    }
    public double getPerimater(){
      return 2*Math.PI*radius;
    }
    public double getVolume(){
        return getPerimater()*height+2*getBaseArea();
    }
}
