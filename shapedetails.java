
package pdeu.drawing;

public class shapedetails {
    public static void main (String args[])
    {
        shape []shapes = new shape[6];

        shapes[0] = new circle("red", "normal", 10);
        shapes[1] = new circle("green", "normal",20);

        shapes[2] = new square("white","rhombus" ,5 );
        shapes[3] = new square ("black","normal",7);

        shapes[4] = new triangle("red", "normal", 10, 10, 10);
        shapes[5] = new triangle("pink","normal",5 ,5,5);

        
    }
    public static void highestarea(shape[] sp)
    {
        double maxarea =0;
        shape shapewithmaxarea = null;
        for(shape shape :sp)
        {
            
            if(shape.calculateArea()>maxarea)
            {
                maxarea= shape.calculateArea();
                shapewithmaxarea = shape;
            }
            if (shapewithmaxarea != null) {
                System.out.println("Shape with highest area: " + shapewithmaxarea);
            }
        }
       
    
    }
     public static void resizeshape(shape[]sp)
        {
            for(shape shape :sp)
            {
                    if (shape instanceof Resizeble)

                    {
                        System.out.println(shape);
                    }
            }
        }
    
}