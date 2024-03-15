package Question2;

public class Main {
    public static void main(String[] args) {
        Macronutrient customer1 = MacronutrientAbstractFactory.getInstance().createMacronutient("Ali", "no restriction");
        Macronutrient customer2 = MacronutrientAbstractFactory.getInstance().createMacronutient("Hussein", "paleo");
        Macronutrient customer3 = MacronutrientAbstractFactory.getInstance().createMacronutient("Hassan", "vegan");
        Macronutrient customer4 = MacronutrientAbstractFactory.getInstance().createMacronutient("Abbas", "nut allergy");
        Macronutrient customer5 = MacronutrientAbstractFactory.getInstance().createMacronutient("Farouk", "vegan");
        Macronutrient customer6 = MacronutrientAbstractFactory.getInstance().createMacronutient("Saladin", "nut allergy");

        customer1.getFoods();
        customer2.getFoods();
        customer3.getFoods();
        customer4.getFoods();
        customer5.getFoods();
        customer6.getFoods();


    }
}
