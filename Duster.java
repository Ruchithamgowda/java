class Duster {
    String brand;
    String material;
    String color;
    int length;
    int width;
    int weight;
    boolean washable;
    int price;
    String shape;
    String gripType;
    boolean antiStatic;
    int durability;
    String usage;
    boolean ecoFriendly;
    int warranty;
    String texture;
    int thickness;
    String surfaceCompatibility;
    boolean chemicalResistant;
    String countryOfOrigin;

    public Duster(String brand, String material, String color, int length, int width, int weight, boolean washable,
                  int price, String shape, String gripType, boolean antiStatic, int durability, String usage,
                  boolean ecoFriendly, int warranty, String texture, int thickness, String surfaceCompatibility,
                  boolean chemicalResistant, String countryOfOrigin) {
        this.brand = brand;
        this.material = material;
        this.color = color;
        this.length = length;
        this.width = width;
        this.weight = weight;
        this.washable = washable;
        this.price = price;
        this.shape = shape;
        this.gripType = gripType;
        this.antiStatic = antiStatic;
        this.durability = durability;
        this.usage = usage;
        this.ecoFriendly = ecoFriendly;
        this.warranty = warranty;
        this.texture = texture;
        this.thickness = thickness;
        this.surfaceCompatibility = surfaceCompatibility;
        this.chemicalResistant = chemicalResistant;
        this.countryOfOrigin = countryOfOrigin;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Length: " + length + " cm");
        System.out.println("Width: " + width + " cm");
        System.out.println("Weight: " + weight + " g");
        System.out.println("Washable: " + washable);
        System.out.println("Price: " + price + " INR");
        System.out.println("Shape: " + shape);
        System.out.println("Grip Type: " + gripType);
        System.out.println("Anti-Static: " + antiStatic);
        System.out.println("Durability: " + durability + " years");
        System.out.println("Usage: " + usage);
        System.out.println("Eco-Friendly: " + ecoFriendly);
        System.out.println("Warranty: " + warranty + " months");
        System.out.println("Texture: " + texture);
        System.out.println("Thickness: " + thickness + " mm");
        System.out.println("Surface Compatibility: " + surfaceCompatibility);
        System.out.println("Chemical Resistant: " + chemicalResistant);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println();
    }
}

