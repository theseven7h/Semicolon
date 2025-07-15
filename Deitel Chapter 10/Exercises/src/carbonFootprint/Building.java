package carbonFootprint;

public class Building implements CarbonFootPrint{
    private final String buildingSize;
    private final String energySource;

    public Building(String buildingSize, String energySource) {
        this.buildingSize = buildingSize;
        this.energySource = energySource;
    }

    public enum BuildingSize {
        SMALL(5000),
        MEDIUM(20000),
        LARGE(100000);

        private final int emission;

        BuildingSize(int emission) {
            this.emission = emission;
        }
    }

    public enum EnergySource {
        GRID(4000),
        NATURAL(3000),
        SOLAR(500);

        private final int emission;

        EnergySource(int emission) {
            this.emission = emission;
        }
    }

    private static int getEmissionByBuildingSize(String buildingSize) {
        return switch (buildingSize.toUpperCase()) {
            case "SMALL" -> BuildingSize.SMALL.emission;
            case "MEDIUM" -> BuildingSize.MEDIUM.emission;
            case "LARGE" -> BuildingSize.LARGE.emission;
            default -> throw new IllegalArgumentException("Invalid building size " + buildingSize);
        };
    }

    private static int getEmissionByEnergySource(String energySource) {
        return switch (energySource.toUpperCase()) {
            case "GRID" -> EnergySource.GRID.emission;
            case "NATURAL" -> EnergySource.NATURAL.emission;
            case "SOLAR" -> EnergySource.SOLAR.emission;
            default -> throw new IllegalArgumentException("Invalid energy source " + energySource);
        };
    }

    @Override
    public double getCarbonFootPrint() {
        return getEmissionByBuildingSize(buildingSize) + getEmissionByEnergySource(energySource);
    }
}
