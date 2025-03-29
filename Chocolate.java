class Chocolate {
    String brand;
    String type;
    double weight;
    double price;
    int cocoaPercentage;
    boolean hasNuts;
    boolean hasCaramel;
    boolean hasWafer;
    String origin;
    String flavor;
    String packaging;
    int shelfLife;
    boolean isSugarFree;
    boolean isVegan;
    String specialEdition;
    String manufacturingDate;
    String expiryDate;
    boolean hasMilk;
    String texture;
    boolean isOrganic;

    public Chocolate(String brand, String type, double weight, double price, int cocoaPercentage, boolean hasNuts,
                     boolean hasCaramel, boolean hasWafer, String origin, String flavor, String packaging, int shelfLife,
                     boolean isSugarFree, boolean isVegan, String specialEdition, String manufacturingDate,
                     String expiryDate, boolean hasMilk, String texture, boolean isOrganic) 
					 {
        this.brand = brand;
        this.type = type;
        this.weight = weight;
        this.price = price;
        this.cocoaPercentage = cocoaPercentage;
        this.hasNuts = hasNuts;
        this.hasCaramel = hasCaramel;
        this.hasWafer = hasWafer;
        this.origin = origin;
        this.flavor = flavor;
        this.packaging = packaging;
        this.shelfLife = shelfLife;
        this.isSugarFree = isSugarFree;
        this.isVegan = isVegan;
        this.specialEdition = specialEdition;
        this.manufacturingDate = manufacturingDate;
        this.expiryDate = expiryDate;
        this.hasMilk = hasMilk;
        this.texture = texture;
        this.isOrganic = isOrganic;
    }

    public void display() {
        System.out.println("Chocolate Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight + " g");
        System.out.println("Price: Rs." + price);
        System.out.println("Cocoa Percentage: " + cocoaPercentage + "%");
        System.out.println("Has Nuts: " + hasNuts);
        System.out.println("Has Caramel: " + hasCaramel);
        System.out.println("Has Wafer: " + hasWafer);
        System.out.println("Origin: " + origin);
        System.out.println("Flavor: " + flavor);
        System.out.println("Packaging: " + packaging);
        System.out.println("Shelf Life: " + shelfLife + " months");
        System.out.println("Is Sugar Free: " + isSugarFree);
        System.out.println("Is Vegan: " + isVegan);
        System.out.println("Special Edition: " + specialEdition);
        System.out.println("Manufacturing Date: " + manufacturingDate);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Has Milk: " + hasMilk);
        System.out.println("Texture: " + texture);
        System.out.println("Is Organic: " + isOrganic);
        System.out.println();
    }
}


