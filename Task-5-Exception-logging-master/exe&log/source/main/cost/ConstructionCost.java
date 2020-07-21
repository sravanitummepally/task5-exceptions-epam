package cost;

public class ConstructionCost {

    private static final int standardMaterialCost = 1200;
    private static final int mediumStandardMaterialCost = 1500;
    private static final int highStandardMaterialCost = 1800;
    private static final int highMaterialCostWithAutomation = 2500;

    private static String[] materials = new String[]{"Standard Material", "Above Standard Material", "High Standard Material"};

    public static double calculateCost(String selectedMaterial, double area, boolean requireAutomation )
    {
        if (area == 0)
            throw new RuntimeException();
        
        else if(selectedMaterial.equalsIgnoreCase(materials[0]))
            return area*standardMaterialCost;

        else if(selectedMaterial.equalsIgnoreCase(materials[1]))
            return area*mediumStandardMaterialCost;

        else if (selectedMaterial.equalsIgnoreCase(materials[2]))
        {
            if (requireAutomation)
                return area*highMaterialCostWithAutomation;
            return area*highStandardMaterialCost;
        }
        else
            throw new RuntimeException();

    }

    public static String[] getMaterials() {
        return materials;
    }

}

