import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num=0;
        String color;
        Scanner s=new Scanner(System.in);
        do {
            System.out.println("please select shape from following or 0 for exite\n1-Circle\n2-Rectangle\n3-Square ");
            try {
                num=s.nextInt();
            }catch (InputMismatchException e)
            {
                System.out.println("Error , please enter a Numerical value");
            }
            switch (num)
            {
                case 0:
                    break;
                case 1:
                    Scanner s1=new Scanner(System.in);
                    System.out.println("1-Circle");
                    System.out.println("please enter the radius of your circle");
                    double radius= s1.nextDouble();
                    Circle c1=new Circle(radius);
                    System.out.println("is The Circle filled?(Y/N)");
                    String f= s1.next();
                    if (f.equalsIgnoreCase("y"))
                        c1.setFilled(true);
                    else if (f.equalsIgnoreCase("n"))
                        c1.setFilled(false);
                    System.out.println("please enter your Circle color");
                    color=s1.next();
                    c1.setColor(color);
                    System.out.println("The Area of your circle = "+c1.getArea());
                    System.out.println("The perimeter of your circle = "+c1.getPerimeter());
                    System.out.println("your Circle information"+c1.toString());
                    break;
                case 2:
                    Scanner s2=new Scanner(System.in);
                    System.out.println("2-Rectangle");
                    System.out.println("please enter the width of your Rectangle");
                    double w=s2.nextDouble();
                    System.out.println("please enter the length of your Rectangle");
                    double l=s2.nextDouble();
                    Rectangle R1=new Rectangle(w,l);
                    System.out.println("is The  Rectangle filled?(Y/N");
                    String f1=s2.next();
                    if (f1.equalsIgnoreCase("y"))
                        R1.setFilled(true);
                    else if (f1.equalsIgnoreCase("n"))
                        R1.setFilled(false);
                    System.out.println("please enter your Rectangle color");
                    color=s2.next();
                    R1.setColor(color);
                    System.out.println("The Area of your Rectangle = "+R1.getArea());
                    System.out.println("The perimeter of your Rectangle = "+R1.getPerimeter());
                    System.out.println("your Rectangle information"+R1.toString());
                    break;
                case 3:
                    Scanner s3=new Scanner(System.in);
                    System.out.println("3-Square");
                    System.out.println("please enter the width of your Square");
                    double width=s3.nextDouble();
                    Square S1=new Square(width);
                    System.out.println("is The  Square filled?(Y/N");
                    String f2=s3.next();
                    if (f2.equalsIgnoreCase("y"))
                        S1.setFilled(true);
                    else if (f2.equalsIgnoreCase("n"))
                        S1.setFilled(false);
                    System.out.println("please enter your Square color");
                    color=s3.next();
                    S1.setColor(color);
                    System.out.println("The Area of your Square = "+S1.getArea());
                    System.out.println("The perimeter of your Square = "+S1.getPerimeter());
                    System.out.println("your Square information"+S1.toString());
                    break;
            }
        }while (num!=0);
    }
}