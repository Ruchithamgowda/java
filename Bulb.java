class Bulb {
    String brand;
    String type;
    int wattage;
    String color;
    boolean isSmart;
    double lifespan;
    String baseType;
    int brightness;
    boolean isDimmable;
    double price;

    public Bulb(String brand) {
        this.brand = brand;
    }

    public Bulb(String brand, String type) {
        this(brand);
        this.type = type;
    }

    public Bulb(String brand, String type, int wattage) {
        this(brand, type);
        this.wattage = wattage;
    }

    public Bulb(String brand, String type, int wattage, String color) {
        this(brand, type, wattage);
        this.color = color;
    }

    public Bulb(String brand, String type, int wattage, String color, boolean isSmart) {
        this(brand, type, wattage, color);
        this.isSmart = isSmart;
    }

    public Bulb(String brand, String type, int wattage, String color, boolean isSmart, double lifespan) {
        this(brand, type, wattage, color, isSmart);
        this.lifespan = lifespan;
    }

    public Bulb(String brand, String type, int wattage, String color, boolean isSmart, double lifespan, String baseType) {
        this(brand, type, wattage, color, isSmart, lifespan);
        this.baseType = baseType;
    }

    public Bulb(String brand, String type, int wattage, String color, boolean isSmart, double lifespan, String baseType, int brightness) {
        this(brand, type, wattage, color, isSmart, lifespan, baseType);
        this.brightness = brightness;
    }

    public Bulb(String brand, String type, int wattage, String color, boolean isSmart, double lifespan, String baseType, int brightness, boolean isDimmable) {
        this(brand, type, wattage, color, isSmart, lifespan, baseType, brightness);
        this.isDimmable = isDimmable;
    }

    public Bulb(String brand, String type, int wattage, String color, boolean isSmart, double lifespan, String baseType, int brightness, boolean isDimmable, double price) {
        this(brand, type, wattage, color, isSmart, lifespan, baseType, brightness, isDimmable);
        this.price = price;
    }

    public void info() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Wattage: " + wattage);
        System.out.println("Color: " + color);
        System.out.println("Smart: " + isSmart);
        System.out.println("Lifespan: " + lifespan);
        System.out.println("Base Type: " + baseType);
        System.out.println("Brightness: " + brightness);
        System.out.println("Dimmable: " + isDimmable);
        System.out.println("Price: " + price);
    }
}


