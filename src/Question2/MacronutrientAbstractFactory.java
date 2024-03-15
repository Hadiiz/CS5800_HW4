package Question2;

//ABSTRACT FACTORY
public class MacronutrientAbstractFactory {
    public static Macronutrient createMacronutient(String name, String diet){
        Carbs carbs = CarbsFactory.getInstance().createCarbs(diet);
        Protein protein = ProteinFactory.getInstance().createProtein(diet);
        Fats fats = FatsFactory.getInstance().createFats(diet);

        return new Macronutrient(name, carbs, protein, fats);
    }
}
