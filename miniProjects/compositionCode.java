public class compositionCode  {
    class Engine {
        public void start(){
            System.out.println("my engine has been Started...");
        }
    }

    class car {
        private Engine engine;
        
        car(Engine engine){
            this.engine = engine;
        }
        
        void startCar(){
            engine.start();
            System.out.println("my car is running now...");
        }
    }

    public static void main(String[] args) {
        compositionCode code = new compositionCode();

        Engine nEngine = code.new Engine();

        car CAR = code.new car(nEngine);

        CAR.startCar();
    }
}