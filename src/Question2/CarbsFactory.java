package Question2;

interface Carbs {
    void getFood();
}

// Implementing Carbs interface in various classes
class Cheese implements Carbs {
    @Override
    public void getFood(){
        System.out.println("Cheese");
    }
}

class Bread implements Carbs {
    @Override
    public void getFood(){
        System.out.println("Bread");
    }
}

class Lentils implements Carbs {
    @Override
    public void getFood(){
        System.out.println("Lentils");
    }
}

class Pistachio implements Carbs {
    @Override
    public void getFood(){
        System.out.println("Pistachio");
    }
}

// CarbsFactory implementing the Factory Design Pattern
public class CarbsFactory{
    private static CarbsFactory instance;

    private CarbsFactory(){}

    public static CarbsFactory getInstance(){
        if(instance == null){
            instance = new CarbsFactory();
        }
        return instance;
    }

    // Factory method for creating Carbs objects
    public Carbs createCarbs(String diet){
        if(diet.equals("no restriction")) {
            int random = (int) (Math.random() * 4);
            switch (random){
                case 0: return new Cheese();
                case 1: return new Bread();
                case 2: return new Lentils();
                case 3: return new Pistachio();
            }
        } else if(diet.equals("paleo")){
            return new Pistachio();
        } else if(diet.equals("vegan")){
            int random = (int) (Math.random() * 3);
            switch (random){
                case 0: return new Bread();
                case 1: return new Lentils();
                case 2: return new Pistachio();
            }
        } else if(diet.equals("nut allergy")){
            int random = (int) (Math.random() * 3);
            switch (random){
                case 0: return new Bread();
                case 1: return new Lentils();
                case 2: return new Cheese();
            }
        }
        return null; // Default return in case of no match
    }

    // Method to display food, separating creation and action logic
    public void getFood(String diet) {
        Carbs carbs = createCarbs(diet);
        if (carbs != null) {
            carbs.getFood();
        } else {
            System.out.println("Diet not supported");
        }
    }
}
