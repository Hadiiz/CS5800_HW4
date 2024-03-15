package Question2;

//ABSTRACT FACTORY
public class MacronutrientAbstractFactory {
    private static MacronutrientAbstractFactory instance;
    private MacronutrientAbstractFactory() {}

    public static synchronized MacronutrientAbstractFactory getInstance() {
        if (instance == null) {
            instance = new MacronutrientAbstractFactory();
        }
        return instance;
    }
    public  Macronutrient createMacronutient(String name, String diet){
        Carbs carbs = CarbsFactory.getInstance().createCarbs(diet);
        Protein protein = ProteinFactory.getInstance().createProtein(diet);
        Fats fats = FatsFactory.getInstance().createFats(diet);

        return new Macronutrient(name, carbs, protein, fats);
    }
}
