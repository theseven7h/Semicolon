package carbonFootprint;

public class Car implements CarbonFootPrint{
    private final String carType;
    private final String annualDrivingDistance;

    public Car(String carType, String annualDrivingDistance) {
        this.carType = carType;
        this.annualDrivingDistance = annualDrivingDistance;
    }

    public enum CarType {
        SMALL(0.15),
        MEDIUM(0.20),
        LARGE(0.30),
        ELECTRIC(0.05);

        private final double emission;

        CarType(double emission) {
            this.emission = emission;
        }
    }

    public enum AnnualDrivingDistance {
        LOW(10000),
        AVERAGE(20000),
        HIGH(30000);

        private final int emission;

        AnnualDrivingDistance(int emission) {
            this.emission = emission;
        }
    }

    private static double getDistanceByCarType(String carType) {
        return switch (carType.toUpperCase()) {
            case "SMALL" -> CarType.SMALL.emission;
            case "MEDIUM" -> CarType.MEDIUM.emission;
            case "LARGE" -> CarType.LARGE.emission;
            case "ELECTRIC" ->  CarType.ELECTRIC.emission;
            default -> throw new IllegalArgumentException("Invalid car type");
        };
    }

    private static int getAnnualDistance(String distance) {
        return switch (distance.toUpperCase()) {
            case "LOW" -> AnnualDrivingDistance.LOW.emission;
            case "AVERAGE" -> AnnualDrivingDistance.AVERAGE.emission;
            case "HIGH" -> AnnualDrivingDistance.HIGH.emission;
            default -> throw new IllegalArgumentException("Invalid distance");
        };
    }

    @Override
    public double getCarbonFootPrint() {
        return getAnnualDistance(annualDrivingDistance) * getDistanceByCarType(carType);
    }
}