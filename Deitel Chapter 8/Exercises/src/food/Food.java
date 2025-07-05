package food;

public enum Food {
    APPLE("Fuji", "100"),
    BANANA("Cavendish", "105"),
    CARROT("Denvers", "30");

    private final String[] food;

    Food(String... food) {
        this.food = food;
    }

    public String[] getFood() {
        return food;
    }
}

class FoodRun {
    public static void main(String[] args) {
        for (Food food : Food.values()) {
            System.out.println("Food: " + food.name() + ", Type: " + food.getFood()[0] + ", Calories: " + food.getFood()[1]);
            System.out.println();
        }
    }
}
