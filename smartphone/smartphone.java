package smartphone;

class Smartphone {

    
    class Camera {

        
        public void capturePhoto() {
            System.out.println("Capturing photo with 108MP camera");
            System.out.println("PANGITA NAWONG NIMO OII");
     }
    }
    public static void main(String[] args) {
        
        Smartphone sp = new Smartphone();

        
        Smartphone.Camera camera = sp.new Camera();

     camera.capturePhoto();
     
    }
}
