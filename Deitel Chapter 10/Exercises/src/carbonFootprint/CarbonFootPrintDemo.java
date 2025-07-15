package carbonFootprint;

import java.util.ArrayList;
import java.util.List;

public class CarbonFootPrintDemo {
    public static void main(String[] args) {
        CarbonFootPrint bicycle = new Bicycle("steel");
        CarbonFootPrint building = new Building("small", "natural");
        CarbonFootPrint car = new Car("medium", "low");

        ArrayList<CarbonFootPrint> carbonFootPrints = new ArrayList<>(List.of(car, bicycle, building));

        for (CarbonFootPrint carbonFootPrint : carbonFootPrints) {
            System.out.println(carbonFootPrint.getClass().getSimpleName());
            System.out.println("Carbon Footprint: " + carbonFootPrint.getCarbonFootPrint() + " kg");
            System.out.println();
        }
    }
}
