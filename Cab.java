class Cab {
    String brand;
    String model;
    int seatingCapacity;
    String fuelType;
    double mileage;
    int engineCapacity;
    String color;
    int price;
    String transmission;
    boolean airConditioning;
    int warranty;
    String bodyType;
    boolean gpsEnabled;
    int weight;
    int maxSpeed;
    int safetyRating;
    boolean sunroof;
    String driveType;
    boolean musicSystem;
    String registrationNumber;

    public Cab(String brand, String model, int seatingCapacity, String fuelType, double mileage, int engineCapacity,
               String color, int price, String transmission, boolean airConditioning, int warranty, String bodyType,
               boolean gpsEnabled, int weight, int maxSpeed, int safetyRating, boolean sunroof, String driveType,
               boolean musicSystem, String registrationNumber)
			   {
        this.brand = brand;
        this.model = model;
        this.seatingCapacity = seatingCapacity;
        this.fuelType = fuelType;
        this.mileage = mileage;
        this.engineCapacity = engineCapacity;
        this.color = color;
        this.price = price;
        this.transmission = transmission;
        this.airConditioning = airConditioning;
        this.warranty = warranty;
        this.bodyType = bodyType;
        this.gpsEnabled = gpsEnabled;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.safetyRating = safetyRating;
        this.sunroof = sunroof;
        this.driveType = driveType;
        this.musicSystem = musicSystem;
        this.registrationNumber = registrationNumber;
    }

    public void display()
	{
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Seating Capacity: " + seatingCapacity);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Mileage: " + mileage + " km/l");
        System.out.println("Engine Capacity: " + engineCapacity + " cc");
        System.out.println("Color: " + color);
        System.out.println("Price: " + price + " INR");
        System.out.println("Transmission: " + transmission);
        System.out.println("Air Conditioning: " + airConditioning);
        System.out.println("Warranty: " + warranty + " years");
        System.out.println("Body Type: " + bodyType);
        System.out.println("GPS Enabled: " + gpsEnabled);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Safety Rating: " + safetyRating + " stars");
        System.out.println("Sunroof: " + sunroof);
        System.out.println("Drive Type: " + driveType);
        System.out.println("Music System: " + musicSystem);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println();
    }
}

