package shape;

class circle extends shape {
    private double r ;

   public circle(double r){
        this.r = r ;
    }

    @Override
       public double calculateArea(){
        return  Math.PI * r * r;
    }
    
}
