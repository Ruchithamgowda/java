lass Drone {
    String model;
    String manufacturer;
    double weight;
    double maxFlightTime;
    double maxRange;
    double maxSpeed;
    int batteryCapacity;
    String cameraResolution;
    boolean hasGPS;
    boolean hasObstacleAvoidance;
    int numberOfRotors;
    boolean isWaterResistant;
    String communicationProtocol;
    double maxPayload;
    String flightController;
    boolean supportsAutonomousFlight;
    String connectivity;
    String application;
    String controlType;
    boolean hasReturnToHome;

    public Drone(String model, String manufacturer, double weight, double maxFlightTime, double maxRange, double maxSpeed,
                 int batteryCapacity, String cameraResolution, boolean hasGPS, boolean hasObstacleAvoidance, int numberOfRotors,
                 boolean isWaterResistant, String communicationProtocol, double maxPayload, String flightController,
                 boolean supportsAutonomousFlight, String connectivity, String application, String controlType, boolean hasReturnToHome) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.maxFlightTime = maxFlightTime;
        this.maxRange = maxRange;
        this.maxSpeed = maxSpeed;
        this.batteryCapacity = batteryCapacity;
        this.cameraResolution = cameraResolution;
        this.hasGPS = hasGPS;
        this.hasObstacleAvoidance = hasObstacleAvoidance;
        this.numberOfRotors = numberOfRotors;
        this.isWaterResistant = isWaterResistant;
        this.communicationProtocol = communicationProtocol;
        this.maxPayload = maxPayload;
        this.flightController = flightController;
        this.supportsAutonomousFlight = supportsAutonomousFlight;
        this.connectivity = connectivity;
        this.application = application;
        this.controlType = controlType;
        this.hasReturnToHome = hasReturnToHome;
    }

    public void display() {
        System.out.println("Drone Model: " + model);
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Max Flight Time: " + maxFlightTime + " min");
        System.out.println("Max Range: " + maxRange + " km");
        System.out.println("Max Speed: " + maxSpeed + " km/h");
        System.out.println("Battery Capacity: " + batteryCapacity + " mAh");
        System.out.println("Camera Resolution: " + cameraResolution);
        System.out.println("Has GPS: " + hasGPS);
        System.out.println("Has Obstacle Avoidance: " + hasObstacleAvoidance);
        System.out.println("Number of Rotors: " + numberOfRotors);
        System.out.println("Is Water Resistant: " + isWaterResistant);
        System.out.println("Communication Protocol: " + communicationProtocol);
        System.out.println("Max Payload: " + maxPayload + " kg");
        System.out.println("Flight Controller: " + flightController);
        System.out.println("Supports Autonomous Flight: " + supportsAutonomousFlight);
        System.out.println("Connectivity: " + connectivity);
        System.out.println("Application: " + application);
        System.out.println("Control Type: " + controlType);
        System.out.println("Has Return To Home: " + hasReturnToHome);
        System.out.println();
    }
}

