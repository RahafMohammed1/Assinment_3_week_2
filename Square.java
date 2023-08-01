public class Square extends Rectangle {
    Square(){}
    Square(double side)
    {
        setWidth(side);
    }

    public Square(String color, boolean filled, double side) {
        super(color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
       setWidth(side);
    }

    @Override
    public String toString() {
        return "\nside=" + getWidth() +"\ncolor:"+getColor()+"\nIs filled? "+isFilled()
                ;
    }

    @Override
    public double getArea()
    {
        double w=getWidth();
        return w*w;
    }

    @Override
    public double getPerimeter() {
        double w=getWidth();
        return 4*w;
    }
}
