class Tab {
    String brand;
    String model;
    int ram;
    int storage;
    double screenSize;
    String os;
    int batteryCapacity;
    int price;
    String processor;
    boolean supportsStylus;
    int warranty;
    String color;
    boolean cellularSupport;
    int weight;
    String material;
    int resolution;
    int cameraMP;
    String speakerType;
    boolean fingerprintSensor;
    String connectivity;

    public Tab(String brand, String model, int ram, int storage, double screenSize, String os, int batteryCapacity, 
               int price, String processor, boolean supportsStylus, int warranty, String color, boolean cellularSupport,
               int weight, String material, int resolution, int cameraMP, String speakerType, boolean fingerprintSensor, 
               String connectivity) 
			   {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
        this.os = os;
        this.batteryCapacity = batteryCapacity;
        this.price = price;
        this.processor = processor;
        this.supportsStylus = supportsStylus;
        this.warranty = warranty;
        this.color = color;
        this.cellularSupport = cellularSupport;
        this.weight = weight;
        this.material = material;
        this.resolution = resolution;
        this.cameraMP = cameraMP;
        this.speakerType = speakerType;
        this.fingerprintSensor = fingerprintSensor;
        this.connectivity = connectivity;
    }

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Storage: " + storage + "GB");
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("OS: " + os);
        System.out.println("Battery Capacity: " + batteryCapacity + "mAh");
        System.out.println("Price: " + price + " INR");
        System.out.println("Processor: " + processor);
        System.out.println("Supports Stylus: " + supportsStylus);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Color: " + color);
        System.out.println("Cellular Support: " + cellularSupport);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Material: " + material);
        System.out.println("Resolution: " + resolution + "p");
        System.out.println("Camera: " + cameraMP + "MP");
        System.out.println("Speaker Type: " + speakerType);
        System.out.println("Fingerprint Sensor: " + fingerprintSensor);
        System.out.println("Connectivity: " + connectivity);
        System.out.println();
    }
}