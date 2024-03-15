package Question2;

//FATS INTERFACE
interface Carbs {
    String getFood();
}

// IMPLEMENTING CARBS INTERFACE
class Cheese implements Carbs {
    @Override
    public String getFood(){
        return "Cheese";
    }
}

class Bread implements Carbs {
    @Override
    public String getFood(){
        return "Bread";
    }
}

class Lentils implements Carbs {
    @Override
    public String getFood(){
        return "Lentils";
    }
}

class Pistachio implements Carbs {
    @Override
    public String getFood(){
        return "Pistachio";
    }
}

// CARBSFACTORY IMPLEMENTING THE FACTORY DESIGN PATTERN
public class CarbsFactory{
    private static CarbsFactory instance;

    private CarbsFactory(){}

    public static CarbsFactory getInstance(){
        if(instance == null){
            instance = new CarbsFactory();
        }
        return instance;
    }

    // FACTORY METHOD FOR CREATING CARBS OBJECT
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
        return null;
    }

    // DISPLAY FOOD
    public String getFood(String diet) {
        Carbs carbs = createCarbs(diet);
        if (carbs != null) {
            return carbs.getFood();
        } else {
            return "Diet not supported for carbs!";
        }
    }
}
