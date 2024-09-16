
package shape;

abstract class shape {

   public abstract double calculateArea();

    
 public static void main(String[] args) {

     

        shape shape[] = new shape[3];

        shape[0] = new circle(8);
        shape[1] = new rectangle(7, 14);
        shape[2] = new square(4) ;

System.out.println("Area of circle is :" + shape[0].calculateArea());
System.out.println("Area of rectangle is :" + shape[1].calculateArea());
System.out.println("Area of square is :" + shape[2].calculateArea());



   
    }
}