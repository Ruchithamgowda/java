class Cement {
    String brand;
    double strength;
    String type;
    double settingTime;
    boolean waterproof;
    String grade;
    double density;
    double weight;
    String usage;
    String countryOfOrigin;

    public Cement(String brand) {
        this.brand = brand;
    }

    public Cement(String brand, double strength) {
        this(brand);
        this.strength = strength;
    }

    public Cement(String brand, double strength, String type) {
        this(brand, strength);
        this.type = type;
    }

    public Cement(String brand, double strength, String type, double settingTime) {
        this(brand, strength, type);
        this.settingTime = settingTime;
    }

    public Cement(String brand, double strength, String type, double settingTime, boolean waterproof) {
        this(brand, strength, type, settingTime);
        this.waterproof = waterproof;
    }

    public Cement(String brand, double strength, String type, double settingTime, boolean waterproof, String grade) {
        this(brand, strength, type, settingTime, waterproof);
        this.grade = grade;
    }

    public Cement(String brand, double strength, String type, double settingTime, boolean waterproof, String grade, double density) {
        this(brand, strength, type, settingTime, waterproof, grade);
        this.density = density;
    }

    public Cement(String brand, double strength, String type, double settingTime, boolean waterproof, String grade, double density, double weight) {
        this(brand, strength, type, settingTime, waterproof, grade, density);
        this.weight = weight;
    }

    public Cement(String brand, double strength, String type, double settingTime, boolean waterproof, String grade, double density, double weight, String usage) {
        this(brand, strength, type, settingTime, waterproof, grade, density, weight);
        this.usage = usage;
    }

    public Cement(String brand, double strength, String type, double settingTime, boolean waterproof, String grade, double density, double weight, String usage, String countryOfOrigin) {
        this(brand, strength, type, settingTime, waterproof, grade, density, weight, usage);
        this.countryOfOrigin = countryOfOrigin;
    }

    public void info() {
        System.out.println("Brand: " + brand);
        System.out.println("Strength: " + strength);
        System.out.println("Type: " + type);
        System.out.println("Setting Time: " + settingTime);
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Grade: " + grade);
        System.out.println("Density: " + density);
        System.out.println("Weight: " + weight);
        System.out.println("Usage: " + usage);
        System.out.println("Country of Origin: " + countryOfOrigin);
    }
}

