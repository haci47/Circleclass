public class Main {

    public static void main(String[] args) {
        Circle x = new Circle(6.0);

        System.out.println(x.getArea());
        System.out.println(x.getCircumference() );

        x.setRadius(3.0);

        System.out.println(x.getRadius());
    }
}
