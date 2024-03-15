package Question2;


public  class Macronutrient {
    private String name;
    private Carbs carbs;
    private Protein protein;
    private Fats fats;

    public Macronutrient(String name, Carbs carbs, Protein protein, Fats fats){
        this.name = name;
        this.carbs = carbs;
        this.protein = protein;
        this.fats = fats;
    }

    public void getFoods(){
        System.out.println("Today's meal for "+name+" will consist of: ");
        System.out.println("- "+ carbs.getFood());
        System.out.println("- "+protein.getFood());
        System.out.println("- "+ fats.getFood());
    }
}


