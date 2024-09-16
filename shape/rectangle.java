package shape;
class rectangle extends shape{
    
        private double width ;
        private double length ;
        
    
        public rectangle(double width , double length){
            this.width = width;
            this.length = length;
        }
    
    
        @Override
        public double calculateArea(){
            return width * length ;
        }
    
    
    
}
