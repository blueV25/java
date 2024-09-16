package abstraction;

abstract class Appliance {

    public abstract void turnOn();

       public void turnOff(){
          System.out.println("The appliance is now off.");

    }
}

class mainApp{
    public static void main(String[] args) {
        WashingMachine washing = new WashingMachine();
        Refrigerator ref = new Refrigerator();

        washing.turnOn();
        washing.turnOff();

System.out.println("*******************************************************");

        ref.turnOn();
        ref.turnOff();

System.out.println("*******************************************************");        
        
    }
}



