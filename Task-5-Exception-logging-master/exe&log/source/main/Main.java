import java.util.*;
import cost.ConstructionCost;
import interest.CompoundInterest;
import interest.SimpleInterest;
import org.apache.logging.log4j.LogManager;

class Main {
    public static void main(String args[]){
        final org.apache.logging.log4j.Logger logger = LogManager.getLogger(Main.class);
        Scanner sc=new Scanner(System.in);

        logger.info("Enter c for Construction Cost or i for Interest ");
        char ch=sc.next().charAt(0);

        switch(ch){

            case 'i':
                logger.info("Enter SI for simple interest or CI for compound interest");

                switch (sc.next()){
                    case "SI":
                        logger.info("Enter \"Principal Amount\" , \"Duration in Years\" and \"Rate of Interest\"...");
                        logger.info(SimpleInterest.calculateInterest(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
                        break;

                    case "CI":
                        logger.info("Enter \"Principal Amount\" , \"Duration in Years\" and \"Rate of Interest\"...");
                        logger.info(CompoundInterest.calculateInterest(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
                        break;

                    default:
                        System.err.println("Wrong Choice...");
                }
            break;

            case 'c':
                
                String[] materials = ConstructionCost.getMaterials();
                
                for (int index = 0; index < materials.length; index++)
                    logger.info("Enter " + (index + 1) + " to select " + materials[index]);

                byte selectMaterial = (byte) (sc.nextByte() - 1);
                
                logger.info("Enter the Area of the house...");
                double area = sc.nextDouble();
                
                boolean requireAutomation = false;
                if(materials[selectMaterial].equals("High Standard Material"))
                {
                    logger.info("Enter \"True\" if you need automation or else enter \"False\"...");
                    requireAutomation = sc.nextBoolean();
                }
                
                logger.info(ConstructionCost.calculateCost(materials[selectMaterial], area, requireAutomation));
            break;
            
            default:
                System.err.println("Wrong Choice...");



        }
    }
}
