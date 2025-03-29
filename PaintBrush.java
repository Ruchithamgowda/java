class PaintBrush {
    String brand;
    String type;
    String material;
    int size;
    String color;
    boolean isSynthetic;
    boolean isWashable;
    String handleMaterial;
    double price;
    int durability;
    String usageType;
    boolean isForWatercolor;
    boolean isForAcrylic;
    boolean isForOilPaint;
    int bristleLength;
    int bristleThickness;
    boolean hasGrip;
    String countryOfOrigin;
    int warranty;
    boolean isEcoFriendly;

    public PaintBrush(String brand, String type, String material, int size, String color, boolean isSynthetic, boolean isWashable,
                      String handleMaterial, double price, int durability, String usageType, boolean isForWatercolor,
                      boolean isForAcrylic, boolean isForOilPaint, int bristleLength, int bristleThickness, boolean hasGrip,
                      String countryOfOrigin, int warranty, boolean isEcoFriendly) 
					  {
        this.brand = brand;
        this.type = type;
        this.material = material;
        this.size = size;
        this.color = color;
        this.isSynthetic = isSynthetic;
        this.isWashable = isWashable;
        this.handleMaterial = handleMaterial;
        this.price = price;
        this.durability = durability;
        this.usageType = usageType;
        this.isForWatercolor = isForWatercolor;
        this.isForAcrylic = isForAcrylic;
        this.isForOilPaint = isForOilPaint;
        this.bristleLength = bristleLength;
        this.bristleThickness = bristleThickness;
        this.hasGrip = hasGrip;
        this.countryOfOrigin = countryOfOrigin;
        this.warranty = warranty;
        this.isEcoFriendly = isEcoFriendly;
    }

    public void display() {
        System.out.println("Paint Brush Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Is Synthetic: " + isSynthetic);
        System.out.println("Is Washable: " + isWashable);
        System.out.println("Handle Material: " + handleMaterial);
        System.out.println("Price: Rs." + price);
        System.out.println("Durability: " + durability + " years");
        System.out.println("Usage Type: " + usageType);
        System.out.println("Suitable for Watercolor: " + isForWatercolor);
        System.out.println("Suitable for Acrylic: " + isForAcrylic);
        System.out.println("Suitable for Oil Paint: " + isForOilPaint);
        System.out.println("Bristle Length: " + bristleLength + " mm");
        System.out.println("Bristle Thickness: " + bristleThickness + " mm");
        System.out.println("Has Grip: " + hasGrip);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Is Eco-Friendly: " + isEcoFriendly);
        System.out.println();
    }
}


