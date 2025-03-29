class Pallet {
    String material;
    double loadCapacity;
    String size;
    boolean isReusable;
    String type;
    String manufacturer;
    double weight;
    boolean isTreated;
    String color;
    String usage;

    public Pallet(String material) {
        this.material = material;
    }

    public Pallet(String material, double loadCapacity) {
        this(material);
        this.loadCapacity = loadCapacity;
    }

    public Pallet(String material, double loadCapacity, String size) {
        this(material, loadCapacity);
        this.size = size;
    }

    public Pallet(String material, double loadCapacity, String size, boolean isReusable) {
        this(material, loadCapacity, size);
        this.isReusable = isReusable;
    }

    public Pallet(String material, double loadCapacity, String size, boolean isReusable, String type) {
        this(material, loadCapacity, size, isReusable);
        this.type = type;
    }

    public Pallet(String material, double loadCapacity, String size, boolean isReusable, String type, String manufacturer) {
        this(material, loadCapacity, size, isReusable, type);
        this.manufacturer = manufacturer;
    }

    public Pallet(String material, double loadCapacity, String size, boolean isReusable, String type, String manufacturer, double weight) {
        this(material, loadCapacity, size, isReusable, type, manufacturer);
        this.weight = weight;
    }

    public Pallet(String material, double loadCapacity, String size, boolean isReusable, String type, String manufacturer, double weight, boolean isTreated) {
        this(material, loadCapacity, size, isReusable, type, manufacturer, weight);
        this.isTreated = isTreated;
    }

    public Pallet(String material, double loadCapacity, String size, boolean isReusable, String type, String manufacturer, double weight, boolean isTreated, String color) {
        this(material, loadCapacity, size, isReusable, type, manufacturer, weight, isTreated);
        this.color = color;
    }

    public Pallet(String material, double loadCapacity, String size, boolean isReusable, String type, String manufacturer, double weight, boolean isTreated, String color, String usage) {
        this(material, loadCapacity, size, isReusable, type, manufacturer, weight, isTreated, color);
        this.usage = usage;
    }

    public void info() {
        System.out.println("Material of pallet: " + material);
        System.out.println("Load capacity: " + loadCapacity);
        System.out.println("Size: " + size);
        System.out.println("Reusable: " + isReusable);
        System.out.println("Type: " + type);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Weight: " + weight);
        System.out.println("Treated: " + isTreated);
        System.out.println("Color: " + color);
        System.out.println("Usage: " + usage);
    }
}
