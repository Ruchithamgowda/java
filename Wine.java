class Wine {
    String name;
    String type;
    String region;
    int year;
    double alcoholContent;
    String grapeVariety;
    boolean isAged;
    int agingYears;
    String bottleSize;
    double price;

    public Wine(String name) {
        this.name = name;
    }

    public Wine(String name, String type) {
        this(name);
        this.type = type;
    }

    public Wine(String name, String type, String region) {
        this(name, type);
        this.region = region;
    }

    public Wine(String name, String type, String region, int year) {
        this(name, type, region);
        this.year = year;
    }

    public Wine(String name, String type, String region, int year, double alcoholContent) {
        this(name, type, region, year);
        this.alcoholContent = alcoholContent;
    }

    public Wine(String name, String type, String region, int year, double alcoholContent, String grapeVariety) {
        this(name, type, region, year, alcoholContent);
        this.grapeVariety = grapeVariety;
    }

    public Wine(String name, String type, String region, int year, double alcoholContent, String grapeVariety, boolean isAged) {
        this(name, type, region, year, alcoholContent, grapeVariety);
        this.isAged = isAged;
    }

    public Wine(String name, String type, String region, int year, double alcoholContent, String grapeVariety, boolean isAged, int agingYears) {
        this(name, type, region, year, alcoholContent, grapeVariety, isAged);
        this.agingYears = agingYears;
    }

    public Wine(String name, String type, String region, int year, double alcoholContent, String grapeVariety, boolean isAged, int agingYears, String bottleSize) {
        this(name, type, region, year, alcoholContent, grapeVariety, isAged, agingYears);
        this.bottleSize = bottleSize;
    }

    public Wine(String name, String type, String region, int year, double alcoholContent, String grapeVariety, boolean isAged, int agingYears, String bottleSize, double price) {
        this(name, type, region, year, alcoholContent, grapeVariety, isAged, agingYears, bottleSize);
        this.price = price;
    }

    public void info() {
        System.out.println("Wine Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Region: " + region);
        System.out.println("Year: " + year);
        System.out.println("Alcohol Content: " + alcoholContent + "%");
        System.out.println("Grape Variety: " + grapeVariety);
        System.out.println("Is Aged: " + isAged);
        System.out.println("Aging Years: " + agingYears);
        System.out.println("Bottle Size: " + bottleSize);
        System.out.println("Price: $" + price);
    }
}


