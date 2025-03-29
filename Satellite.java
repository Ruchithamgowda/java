class Satellite {
    String name;
    String type;
    double weight;
    double altitude;
    String launchDate;
    String country;
    String operator;
    boolean isActive;
    double speed;
    String orbitType;
    int lifespan;
    String fuelType;
    boolean hasSolarPanels;
    int communicationFrequency;
    boolean isManned;
    int powerCapacity;
    String missionPurpose;
    boolean hasScientificInstruments;
    int dataTransmissionRate;
    boolean hasAI;

    public Satellite(String name, String type, double weight, double altitude, String launchDate, String country,
                     String operator, boolean isActive, double speed, String orbitType, int lifespan, String fuelType,
                     boolean hasSolarPanels, int communicationFrequency, boolean isManned, int powerCapacity,
                     String missionPurpose, boolean hasScientificInstruments, int dataTransmissionRate, boolean hasAI) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.altitude = altitude;
        this.launchDate = launchDate;
        this.country = country;
        this.operator = operator;
        this.isActive = isActive;
        this.speed = speed;
        this.orbitType = orbitType;
        this.lifespan = lifespan;
        this.fuelType = fuelType;
        this.hasSolarPanels = hasSolarPanels;
        this.communicationFrequency = communicationFrequency;
        this.isManned = isManned;
        this.powerCapacity = powerCapacity;
        this.missionPurpose = missionPurpose;
        this.hasScientificInstruments = hasScientificInstruments;
        this.dataTransmissionRate = dataTransmissionRate;
        this.hasAI = hasAI;
    }

    public void display() {
        System.out.println("Satellite Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Altitude: " + altitude + " km");
        System.out.println("Launch Date: " + launchDate);
        System.out.println("Country: " + country);
        System.out.println("Operator: " + operator);
        System.out.println("Is Active: " + isActive);
        System.out.println("Speed: " + speed + " km/h");
        System.out.println("Orbit Type: " + orbitType);
        System.out.println("Lifespan: " + lifespan + " years");
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Has Solar Panels: " + hasSolarPanels);
        System.out.println("Communication Frequency: " + communicationFrequency + " MHz");
        System.out.println("Is Manned: " + isManned);
        System.out.println("Power Capacity: " + powerCapacity + " kW");
        System.out.println("Mission Purpose: " + missionPurpose);
        System.out.println("Has Scientific Instruments: " + hasScientificInstruments);
        System.out.println("Data Transmission Rate: " + dataTransmissionRate + " Mbps");
        System.out.println("Has AI: " + hasAI);
        System.out.println();
    }
}


