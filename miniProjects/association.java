import java.util.ArrayList;
import java.util.List;

public class association {
    static class car{
        private String carName;

        public void setCarName(String carName){this.carName = carName;}
        public String getCarName(){return carName;}
    }

    static class name{
        private String name;
        List<car> Model;

        public void setName(String name){this.name = name;}
        public String getName(){return name;}

        public void setModel(List<car> Model){ this.Model = Model;}
        public List<car> getModels(){return Model;}
    }

    static class carColor{
        private List<String> color;
        List<car> model;

        public void setColor(List<String> color){this.color = color;}
        public List<String> getColor(){return color;}

        public void setModel(List<car> model){this.model = model;}
        public List<car> getModel(){return model;}

    }

    public static void main(String[] args) {
        car car1 = new car();
        car car2 = new car();
        name n = new name();
        
        n.setName("Riddhi");

        car1.setCarName("Audi");
        car2.setCarName("Rolls Royce");

        List<car> carsNames = new ArrayList<car>();
        carsNames.add(0,car1);
        carsNames.add(1,car2);
        n.setModel(carsNames);

        System.out.println(n.getModels()+" is cars of "+ n.getName());
        for (car car : carsNames) {
            System.out.println(car.toString());
        }


        carColor cColor = new carColor();
        List<String> colour = new ArrayList<String>();
        colour.add("Royal Brown");
        colour.add("Black");

        cColor.setColor(colour);
        cColor.setModel(carsNames);
        List<carColor> colors = new ArrayList<carColor>();
    
        System.out.println(cColor.getModel()+" are available in these colors " + cColor.getColor());

    }
}
