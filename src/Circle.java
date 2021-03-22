
    public class Circle {
        private double radius = 1.0;
        private final double PI = 3.14;


        public Circle() {
        }

        public Circle(double radius) {
            this.radius = radius;
        }

        public double getRadius() {
            return radius;
        }

        public double getArea() {
            return PI * radius * radius;
        }

        public double getCircumference() {
            return 2 * PI * radius;
        }
            public void setRadius ( double newRadius){
                radius = newRadius;
            }
        }






