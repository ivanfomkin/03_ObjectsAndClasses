
public class Cat {

    public static final int EYES_COUNT = 2;
    private static final double MIN_WEIGHT = 1000.0;
    private static final double MAX_WEIGHT = 9000.0;
    private final String DEATH_MESSAGE = "Oh my God, your cat is dead!";

    private static int count; //Количество кошек
    private double originWeight;
    private double weight;
    private CatColours color;
    private double foodAmount; //Количество съеденой еды
    private String name; //Имя кошки
    private boolean isDead;

    public boolean isDead() {
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        count++;
    }

    public Cat(String name) {
        this();
        this.name = name;
    }

    public Cat(double weight) {
        this();
        this.weight = weight;
        if (weight > MAX_WEIGHT) {
            isDead = true;
            count--;
        }
    }

    public Cat(double weight, String name) {
        this(weight);
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void meow() {
        getStatus();
        if (isDead) System.out.println(DEATH_MESSAGE);
        else {
            weight = weight - 1;
            System.out.println("Meow");
        }
    }

    public void feed(Double amount) {
        getStatus();
        if (isDead) System.out.println(DEATH_MESSAGE);
        else {
            weight = weight + amount;
            foodAmount += amount;
        }
    }

    public void drink(Double amount) {
        getStatus();
        if (isDead) System.out.println(DEATH_MESSAGE);
        else {
            weight = weight + amount;
        }
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if (isDead) return DEATH_MESSAGE;
        else {
            if (weight < MIN_WEIGHT) {
                count--;
                isDead = true;
                return "Dead";
            } else if (weight > MAX_WEIGHT) {
                isDead = true;
                count--;
                return "Exploded";
            } else if (weight > originWeight) {
                return "Sleeping";
            } else {
                return "Playing";
            }
        }
    }

    public double getFoodAmount() {
        return foodAmount;
    }

    public void goToilet() {
        getStatus();
        if (isDead) System.out.println(DEATH_MESSAGE);
        else {
            weight -= 120;
            System.out.println("I pooped! Sorry...");
        }
    }

    public static int getCount() {
        return count;
    }

    public void setColor(CatColours color) {
        this.color = color;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setFoodAmount(double foodAmount) {
        this.foodAmount = foodAmount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CatColours getColor() {
        return color;
    }

    public Cat copyCat() {
        if (isDead) {
            System.out.println("You try copy dedad cat, it's bad idea! ");
        }
            Cat cat = new Cat(this.weight);
            cat.isDead = this.isDead;
            cat.setColor(this.color);
            cat.setName(this.name);
            cat.originWeight = this.weight;
            cat.setFoodAmount(this.getFoodAmount());
            return cat;
    }
}