package carbonFootprint;

public class Bicycle implements CarbonFootPrint{
    private static final double lifeTimeDistance = 10000;
    private final String bikeMaterial;

    public Bicycle(String bikeMaterial) {
        this.bikeMaterial = bikeMaterial;
    }

    public enum BikeMaterials {
        STEEL(50),
        ALUMINIUM(100),
        CARBON_FIBER(200);

        private final int emission;

        BikeMaterials(int emission) {
            this.emission = emission;
        }
    }

    private static int getMaterialEmission(String bikeMaterial) {
        return switch (bikeMaterial.toUpperCase()) {
            case "STEEL" -> BikeMaterials.STEEL.emission;
            case "ALUMINIUM" -> BikeMaterials.ALUMINIUM.emission;
            case "CARBON" -> BikeMaterials.CARBON_FIBER.emission;
            default -> throw new IllegalArgumentException("Invalid bike material");
        };
    }

    @Override
    public double getCarbonFootPrint() {
        return getMaterialEmission(bikeMaterial) / lifeTimeDistance;
    }
}
