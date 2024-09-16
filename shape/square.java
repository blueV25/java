package shape;

class square extends shape{

    private double side ;
    

        public square(double side){
         this.side = side;
    }

     @Override
        public double calculateArea(){
         return side * side ;
        
    }
}
