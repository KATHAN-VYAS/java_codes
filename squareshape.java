package pdeu.drawing;

    class square extends shape implements Resizeble{
        double side;
        
        public square(String colour,String pattern,double side){
            this.colour= colour;
            this.pattern = pattern;
            this.side = side;
        }
         
        public double calculateArea() {
            return side * side;
        }

        public double calculatePerimeter() {
            return 4 * side;
        }
        public void resize(int factor) {
            side = side*factor;
        }
        
    }

