package Question2;

// PROTEIN INTERFACE
interface Protein {
    String getFood();
}

// IMPLEMENTING PROTEIN INTERFACE
class Fish implements Protein {
    @Override
    public String getFood(){
        return "Fish";
    }
}

class Chicken implements Protein {
    @Override
    public String getFood(){
        return "Chicken";
    }
}

class Beef implements Protein {
    @Override
    public String getFood(){
        return "Beef";
    }
}

class Tofu implements Protein {
    @Override
    public String getFood(){
        return "Tofu";
    }
}

public class ProteinFactory {
    private static ProteinFactory instance;

    private ProteinFactory() {}

    public static ProteinFactory getInstance() {
        if (instance == null) {
            instance = new ProteinFactory();
        }
        return instance;
    }

    // FACTORY METHOD FOR CREATING PROTEIN OBJECTS
    public Protein createProtein(String diet) {
        if (diet.equals("no restriction") || diet.equals("nut allergy")) {
            int random = (int) (Math.random() * 4);
            switch (random) {
                case 0: return new Fish();
                case 1: return new Chicken();
                case 2: return new Beef();
                case 3: return new Tofu();
            }
        } else if (diet.equals("paleo")) {
            int random = (int) (Math.random() * 3);
            switch (random) {
                case 0: return new Fish();
                case 1: return new Chicken();
                case 2: return new Beef();
            }
        } else if (diet.equals("vegan")) {
            return new Tofu();
        }
        return null;
    }

    // DISPLAY FOOD
    public String getFood(String diet) {
        Protein protein = createProtein(diet);
        if (protein != null) {
            return protein.getFood();
        } else {
            return "Diet not supported";
        }
    }
}
