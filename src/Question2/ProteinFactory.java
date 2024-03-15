package Question2;

interface Protein {
    void getFood();
}

class Fish implements Protein {
    @Override
    public void getFood(){
        System.out.println("Fish");
    }
}

class Chicken implements Protein {
    @Override
    public void getFood(){
        System.out.println("Chicken");
    }
}

class Beef implements Protein {
    @Override
    public void getFood(){
        System.out.println("Beef");
    }
}

class Tofu implements Protein {
    @Override
    public void getFood(){
        System.out.println("Tofu");
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

    // Factory method for creating Protein objects
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
        return null; // Default return in case of no match
    }

    // Method to display food, separating creation and action logic
    public void getFood(String diet) {
        Protein protein = createProtein(diet);
        if (protein != null) {
            protein.getFood();
        } else {
            System.out.println("Diet not supported");
        }
    }
}
