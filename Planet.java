class Planet {
    String name;
    double mass;
    double diameter;
    double gravity;
    double orbitalPeriod;
    double rotationPeriod;
    boolean hasRings;
    int numberOfMoons;
    String atmosphereComposition;
    boolean supportsLife;
    double distanceFromSun;
    String surfaceTemperature;
    String color;
    String discoveryYear;
    String discoveredBy;
    String planetType;
    boolean hasMagneticField;
    double axialTilt;
    boolean hasWater;
    boolean isDwarfPlanet;

    public Planet(String name, double mass, double diameter, double gravity, double orbitalPeriod, double rotationPeriod,
                  boolean hasRings, int numberOfMoons, String atmosphereComposition, boolean supportsLife, double distanceFromSun,
                  String surfaceTemperature, String color, String discoveryYear, String discoveredBy, String planetType,
                  boolean hasMagneticField, double axialTilt, boolean hasWater, boolean isDwarfPlanet) 
				  {
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
        this.gravity = gravity;
        this.orbitalPeriod = orbitalPeriod;
        this.rotationPeriod = rotationPeriod;
        this.hasRings = hasRings;
        this.numberOfMoons = numberOfMoons;
        this.atmosphereComposition = atmosphereComposition;
        this.supportsLife = supportsLife;
        this.distanceFromSun = distanceFromSun;
        this.surfaceTemperature = surfaceTemperature;
        this.color = color;
        this.discoveryYear = discoveryYear;
        this.discoveredBy = discoveredBy;
        this.planetType = planetType;
        this.hasMagneticField = hasMagneticField;
        this.axialTilt = axialTilt;
        this.hasWater = hasWater;
        this.isDwarfPlanet = isDwarfPlanet;
    }

    public void display()
	{
        System.out.println("Name: " + name);
        System.out.println("Mass: " + mass + " x10^24 kg");
        System.out.println("Diameter: " + diameter + " km");
        System.out.println("Gravity: " + gravity + " m/s^2");
        System.out.println("Orbital Period: " + orbitalPeriod + " days");
        System.out.println("Rotation Period: " + rotationPeriod + " hours");
        System.out.println("Has Rings: " + hasRings);
        System.out.println("Number of Moons: " + numberOfMoons);
        System.out.println("Atmosphere Composition: " + atmosphereComposition);
        System.out.println("Supports Life: " + supportsLife);
        System.out.println("Distance from Sun: " + distanceFromSun + " AU");
        System.out.println("Surface Temperature: " + surfaceTemperature);
        System.out.println("Color: " + color);
        System.out.println("Discovery Year: " + discoveryYear);
        System.out.println("Discovered By: " + discoveredBy);
        System.out.println("Planet Type: " + planetType);
        System.out.println("Has Magnetic Field: " + hasMagneticField);
        System.out.println("Axial Tilt: " + axialTilt + " degrees");
        System.out.println("Has Water: " + hasWater);
        System.out.println("Is Dwarf Planet: " + isDwarfPlanet);
        System.out.println();
    }
}

