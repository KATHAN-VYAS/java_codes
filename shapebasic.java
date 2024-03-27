package pdeu.drawing;

abstract class shape{
    String colour;
    String pattern;
    static int count = 0;
    abstract double calculateArea();
 
    abstract double calculatePerimeter();
    {
        count++;
    }
    public int countshapes(){
        return count;
    }
    public void Shape(String colour, String pattern) {
        this.colour = colour;
        this.pattern = pattern;
    }
    public String toStrig (){
        return "Shape [colour=" + colour + ", pattern=" + pattern + "]";
    }
    
}

interface Resizeble{
    void resize(int factor);
}






public class shapebasic {
    public static void main(String args [])

    {

    }
}