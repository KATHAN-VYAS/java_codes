package pdeu.drawing;

    class triangle extends shape implements Resizeble{
        double side1;
        double side2;
        double side3;

        public triangle(String colour ,String pattern,double side1,double side2,double side3)
        {
            this.colour = colour;
            this.pattern= pattern;
            this.side1 = side1;
            this.side2= side2;
            this.side3= side3;
        }
        public double calculateArea()
        {
            double s = (side1 + side2 + side3) / 2;
            return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
        }
        public double calculatePerimeter()
        {
            return side1 + side2 + side3;
        }
        public void resize(int factor)
        {
            side1 = side1 * factor;
        }

    }
