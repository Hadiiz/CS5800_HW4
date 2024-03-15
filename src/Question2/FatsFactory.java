package Question2;
// FATS INTERFACE
interface Fats {
    String getFood();
}

// IMPLEMENTING FATS INTERFACE
class Avocado implements Fats {
    @Override
    public String getFood(){
        return "Avocado";
    }
}

class SourCream implements Fats {
    @Override
    public String getFood(){
        return "Sour Cream";
    }
}

class Tuna implements Fats {
    @Override
    public String getFood(){
        return "Tuna";
    }
}

class Peanuts implements Fats {
    @Override
    public String getFood(){
        return "Peanuts";
    }
}

// FATSFACTORY IMPLEMENTING THE FACTORY DESIGN PATTERN
public class FatsFactory {
    private static FatsFactory instance;

    private FatsFactory(){}

    public static FatsFactory getInstance(){
        if(instance == null){
            instance = new FatsFactory();
        }
        return instance;
    }

    // FACTORY METHOD FOR CREATING FATS OBJECTS
    public Fats createFats(String diet){
        if("no restriction".equals(diet)) {
            int random = (int) (Math.random() * 4);
            switch (random) {
                case 0: return new Avocado();
                case 1: return new SourCream();
                case 2: return new Tuna();
                case 3: return new Peanuts();
            }
        } else if("paleo".equals(diet)) {
            int random = (int) (Math.random() * 3);
            switch (random) {
                case 0: return new Avocado();
                case 1: return new Tuna();
                case 2: return new Peanuts();
            }
        } else if("vegan".equals(diet)) {
            int random = (int) (Math.random() * 2);
            switch (random) {
                case 0: return new Avocado();
                case 1: return new Peanuts();
            }
        } else if("nut allergy".equals(diet)) {
            int random = (int) (Math.random() * 3);
            switch (random) {
                case 0: return new Avocado();
                case 1: return new SourCream();
                case 2: return new Tuna();
            }
        }
        return null;
    }

    // DISPLAY FOOD
    public String getFood(String diet) {
        Fats fats = createFats(diet);
        if (fats != null) {
            return fats.getFood();
        } else {
            return "Diet not supported";
        }
    }
}
