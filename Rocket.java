class Rocket {
    String name;
    String manufacturer;
    double height;
    double diameter;
    double mass;
    double payloadCapacity;
    int stages;
    String fuelType;
    double thrust;
    double burnTime;
    boolean isReusable;
    String launchSite;
    String launchDate;
    String missionType;
    boolean hasCrew;
    int numberOfEngines;
    double maxSpeed;
    boolean hasEscapeSystem;
    String orbitType;
    String destination;

    public Rocket(String name, String manufacturer, double height, double diameter, double mass, double payloadCapacity,
                  int stages, String fuelType, double thrust, double burnTime, boolean isReusable, String launchSite,
                  String launchDate, String missionType, boolean hasCrew, int numberOfEngines, double maxSpeed,
                  boolean hasEscapeSystem, String orbitType, String destination) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.height = height;
        this.diameter = diameter;
        this.mass = mass;
        this.payloadCapacity = payloadCapacity;
        this.stages = stages;
        this.fuelType = fuelType;
        this.thrust = thrust;
        this.burnTime = burnTime;
        this.isReusable = isReusable;
        this.launchSite = launchSite;
        this.launchDate = launchDate;
        this.missionType = missionType;
        this.hasCrew = hasCrew;
        this.numberOfEngines = numberOfEngines;
        this.maxSpeed = maxSpeed;
        this.hasEscapeSystem = hasEscapeSystem;
        this.orbitType = orbitType;
        this.destination = destination;
    }

    public void display() {
        System.out.println("Rocket Name: " + name);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Height: " + height + " m");
        System.out.println("Diameter: " + diameter + " m");
        System.out.println("Mass: " + mass + " kg");
        System.out.println("Payload Capacity: " + payloadCapacity + " kg");
        System.out.println("Stages: " + stages);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Thrust: " + thrust + " kN");
        System.out.println("Burn Time: " + burnTime + " s");
        System.out.println("Is Reusable: " + isReusable);
        System.out.println("Launch Site: " + launchSite);
        System.out.println("Launch Date: " + launchDate);
        System.out.println("Mission Type: " + missionType);
        System.out.println("Has Crew: " + hasCrew);
        System.out.println("Number of Engines: " + numberOfEngines);
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Has Escape System: " + hasEscapeSystem);
        System.out.println("Orbit Type: " + orbitType);
        System.out.println("Destination: " + destination);
        System.out.println();
    }
}

