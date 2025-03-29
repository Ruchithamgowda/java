class Wallet {
    String brand;
    String material;
    String color;
    double price;
    boolean isWaterproof;
    int cardSlots;
    String size;
    boolean hasCoinPocket;
    String closureType;
    String usage;

    public Wallet(String brand) {
        this.brand = brand;
    }

    public Wallet(String brand, String material) {
        this(brand);
        this.material = material;
    }

    public Wallet(String brand, String material, String color) {
        this(brand, material);
        this.color = color;
    }

    public Wallet(String brand, String material, String color, double price) {
        this(brand, material, color);
        this.price = price;
    }

    public Wallet(String brand, String material, String color, double price, boolean isWaterproof) {
        this(brand, material, color, price);
        this.isWaterproof = isWaterproof;
    }

    public Wallet(String brand, String material, String color, double price, boolean isWaterproof, int cardSlots) {
        this(brand, material, color, price, isWaterproof);
        this.cardSlots = cardSlots;
    }

    public Wallet(String brand, String material, String color, double price, boolean isWaterproof, int cardSlots, String size) {
        this(brand, material, color, price, isWaterproof, cardSlots);
        this.size = size;
    }

    public Wallet(String brand, String material, String color, double price, boolean isWaterproof, int cardSlots, String size, boolean hasCoinPocket) {
        this(brand, material, color, price, isWaterproof, cardSlots, size);
        this.hasCoinPocket = hasCoinPocket;
    }

    public Wallet(String brand, String material, String color, double price, boolean isWaterproof, int cardSlots, String size, boolean hasCoinPocket, String closureType) {
        this(brand, material, color, price, isWaterproof, cardSlots, size, hasCoinPocket);
        this.closureType = closureType;
    }

    public Wallet(String brand, String material, String color, double price, boolean isWaterproof, int cardSlots, String size, boolean hasCoinPocket, String closureType, String usage) {
        this(brand, material, color, price, isWaterproof, cardSlots, size, hasCoinPocket, closureType);
        this.usage = usage;
    }

    
    public void info() {
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Price: $" + price);
        System.out.println("Waterproof: " + isWaterproof);
        System.out.println("Card Slots: " + cardSlots);
        System.out.println("Size: " + size);
        System.out.println("Has Coin Pocket: " + hasCoinPocket);
        System.out.println("Closure Type: " + closureType);
        System.out.println("Usage: " + usage);
    }
}


