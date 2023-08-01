public class Circle extends Shape {
    private double radius=1.0;
    public  Circle(){}
    public  Circle(double radius)
    {
        this.radius=radius;
    }
    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea()
    {
      final double pi=3.14;
      return pi*radius*radius;
    }
    public double getPerimeter(){
      final double pi=3.14;
      return 2*pi*radius;
    }

    @Override
    public String toString() {
        return
                " :\nradius =" + radius +"\ncolor ="+getColor()+"\nIs filled? "+isFilled()+" }";

    }
}
