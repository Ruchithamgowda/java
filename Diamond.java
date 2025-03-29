class Diamond {
    String type;
    double carat;
    String color;
    String clarity;
    String cut;
    String origin;
    boolean isCertified;
    double price;
    String shape;
    String fluorescence;

    public Diamond(String type) {
        this.type = type;
    }

    public Diamond(String type, double carat) {
        this(type);
        this.carat = carat;
    }

    public Diamond(String type, double carat, String color) {
        this(type, carat);
        this.color = color;
    }

    public Diamond(String type, double carat, String color, String clarity) {
        this(type, carat, color);
        this.clarity = clarity;
    }

    public Diamond(String type, double carat, String color, String clarity, String cut) {
        this(type, carat, color, clarity);
        this.cut = cut;
    }

    public Diamond(String type, double carat, String color, String clarity, String cut, String origin) {
        this(type, carat, color, clarity, cut);
        this.origin = origin;
    }

    public Diamond(String type, double carat, String color, String clarity, String cut, String origin, boolean isCertified) {
        this(type, carat, color, clarity, cut, origin);
        this.isCertified = isCertified;
    }

    public Diamond(String type, double carat, String color, String clarity, String cut, String origin, boolean isCertified, double price) {
        this(type, carat, color, clarity, cut, origin, isCertified);
        this.price = price;
    }

    public Diamond(String type, double carat, String color, String clarity, String cut, String origin, boolean isCertified, double price, String shape) {
        this(type, carat, color, clarity, cut, origin, isCertified, price);
        this.shape = shape;
    }

    public Diamond(String type, double carat, String color, String clarity, String cut, String origin, boolean isCertified, double price, String shape, String fluorescence) {
        this(type, carat, color, clarity, cut, origin, isCertified, price, shape);
        this.fluorescence = fluorescence;
    }

    public void info() {
        System.out.println("Type: " + type);
        System.out.println("Carat: " + carat);
        System.out.println("Color: " + color);
        System.out.println("Clarity: " + clarity);
        System.out.println("Cut: " + cut);
        System.out.println("Origin: " + origin);
        System.out.println("Certified: " + isCertified);
        System.out.println("Price: $" + price);
        System.out.println("Shape: " + shape);
        System.out.println("Fluorescence: " + fluorescence);
    }
}

