class Ak47 {
    String manufacturer;
    String countryOfOrigin;
    double weight;
    double length;
    double barrelLength;
    int magazineCapacity;
    String fireMode;
    double muzzleVelocity;
    int effectiveRange;
    boolean hasScope;

    public Ak47(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Ak47(String manufacturer, String countryOfOrigin) {
        this(manufacturer);
        this.countryOfOrigin = countryOfOrigin;
    }

    public Ak47(String manufacturer, String countryOfOrigin, double weight) {
        this(manufacturer, countryOfOrigin);
        this.weight = weight;
    }

    public Ak47(String manufacturer, String countryOfOrigin, double weight, double length) {
        this(manufacturer, countryOfOrigin, weight);
        this.length = length;
    }

    public Ak47(String manufacturer, String countryOfOrigin, double weight, double length, double barrelLength) {
        this(manufacturer, countryOfOrigin, weight, length);
        this.barrelLength = barrelLength;
    }

    public Ak47(String manufacturer, String countryOfOrigin, double weight, double length, double barrelLength, int magazineCapacity) {
        this(manufacturer, countryOfOrigin, weight, length, barrelLength);
        this.magazineCapacity = magazineCapacity;
    }

    public Ak47(String manufacturer, String countryOfOrigin, double weight, double length, double barrelLength, int magazineCapacity, String fireMode) {
        this(manufacturer, countryOfOrigin, weight, length, barrelLength, magazineCapacity);
        this.fireMode = fireMode;
    }

    public Ak47(String manufacturer, String countryOfOrigin, double weight, double length, double barrelLength, int magazineCapacity, String fireMode, double muzzleVelocity) {
        this(manufacturer, countryOfOrigin, weight, length, barrelLength, magazineCapacity, fireMode);
        this.muzzleVelocity = muzzleVelocity;
    }

    public Ak47(String manufacturer, String countryOfOrigin, double weight, double length, double barrelLength, int magazineCapacity, String fireMode, double muzzleVelocity, int effectiveRange) {
        this(manufacturer, countryOfOrigin, weight, length, barrelLength, magazineCapacity, fireMode, muzzleVelocity);
        this.effectiveRange = effectiveRange;
    }

    public Ak47(String manufacturer, String countryOfOrigin, double weight, double length, double barrelLength, int magazineCapacity, String fireMode, double muzzleVelocity, int effectiveRange, boolean hasScope) {
        this(manufacturer, countryOfOrigin, weight, length, barrelLength, magazineCapacity, fireMode, muzzleVelocity, effectiveRange);
        this.hasScope = hasScope;
    }

    public void info() {
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Country of Origin: " + countryOfOrigin);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Length: " + length + " cm");
        System.out.println("Barrel Length: " + barrelLength + " cm");
        System.out.println("Magazine Capacity: " + magazineCapacity + " rounds");
        System.out.println("Fire Mode: " + fireMode);
        System.out.println("Muzzle Velocity: " + muzzleVelocity + " m/s");
        System.out.println("Effective Range: " + effectiveRange + " meters");
        System.out.println("Has Scope: " + hasScope);
    }
}


