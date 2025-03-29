class Dustbin {
    String brand;
    String material;
    int capacity;
    String color;
    boolean hasLid;
    boolean pedalOperated;
    boolean recyclable;
    double height;
    double diameter;
    int weight;
    boolean waterproof;
    boolean fireResistant;
    String shape;
    int warranty;
    String useType;
    boolean indoorUse;
    boolean outdoorUse;
    boolean smartSensor;
    String openingMechanism;
    int price;

    public Dustbin(String brand, String material, int capacity, String color, boolean hasLid, boolean pedalOperated,
                   boolean recyclable, double height, double diameter, int weight, boolean waterproof,
                   boolean fireResistant, String shape, int warranty, String useType, boolean indoorUse,
                   boolean outdoorUse, boolean smartSensor, String openingMechanism, int price) 
				   {
        this.brand = brand;
        this.material = material;
        this.capacity = capacity;
        this.color = color;
        this.hasLid = hasLid;
        this.pedalOperated = pedalOperated;
        this.recyclable = recyclable;
        this.height = height;
        this.diameter = diameter;
        this.weight = weight;
        this.waterproof = waterproof;
        this.fireResistant = fireResistant;
        this.shape = shape;
        this.warranty = warranty;
        this.useType = useType;
        this.indoorUse = indoorUse;
        this.outdoorUse = outdoorUse;
        this.smartSensor = smartSensor;
        this.openingMechanism = openingMechanism;
        this.price = price;
    }

    public void display()
	{
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Capacity: " + capacity + "L");
        System.out.println("Color: " + color);
        System.out.println("Has Lid: " + hasLid);
        System.out.println("Pedal Operated: " + pedalOperated);
        System.out.println("Recyclable: " + recyclable);
        System.out.println("Height: " + height + " cm");
        System.out.println("Diameter: " + diameter + " cm");
        System.out.println("Weight: " + weight + " g");
        System.out.println("Waterproof: " + waterproof);
        System.out.println("Fire Resistant: " + fireResistant);
        System.out.println("Shape: " + shape);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Use Type: " + useType);
        System.out.println("Indoor Use: " + indoorUse);
        System.out.println("Outdoor Use: " + outdoorUse);
        System.out.println("Smart Sensor: " + smartSensor);
        System.out.println("Opening Mechanism: " + openingMechanism);
        System.out.println("Price: " + price + " INR");
        System.out.println();
    }
}

