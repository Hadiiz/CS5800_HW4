package Question2;

interface Fats {
    void getFood();
}

// Implementing Fats interface in various classes
class Avocado implements Fats {
    @Override
    public void getFood(){
        System.out.println("Avocado");
    }
}

class SourCream implements Fats {
    @Override
    public void getFood(){
        System.out.println("Sour Cream");
    }
}

class Tuna implements Fats {
    @Override
    public void getFood(){
        System.out.println("Tuna");
    }
}

class Peanuts implements Fats {
    @Override
    public void getFood(){
        System.out.println("Peanuts");
    }
}

// FatsFactory implementing the Factory Design Pattern
public class FatsFactory {
    private static FatsFactory instance;

    private FatsFactory(){}

    public static FatsFactory getInstance(){
        if(instance == null){
            instance = new FatsFactory();
        }
        return instance;
    }

    // Factory method for creating Fats objects
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
        return null; // Default return in case of no match
    }

    // Method to display food, separating creation and action logic
    public void getFood(String diet) {
        Fats fats = createFats(diet);
        if (fats != null) {
            fats.getFood();
        } else {
            System.out.println("Diet not supported");
        }
    }
}
