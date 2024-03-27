package pdeu.drawing;
    class circle extends shape implements Resizeble{
        double radius ;

        public circle(String colour ,String pattern,double radius)
        {
            this.colour = colour;
            this.pattern = pattern;
            this.radius= radius;        
        }
        public double calculateArea() {
            return 3.14*radius*radius;
        }
        public double calculatePerimeter() {
            return 2*3.14*radius;
        }
        public void resize(int factor) {
            radius= radius *factor;
        }
    }
