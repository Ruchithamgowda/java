class Army {
    String country;
    int soldiers;
    String rank;
    int divisions;
    String weaponType;
    boolean hasAirSupport;
    int tanks;
    String missionType;
    boolean specialForces;
    String commanderName;

    public Army(String country) {
        this.country = country;
    }

    public Army(String country, int soldiers) {
        this(country);
        this.soldiers = soldiers;
    }

    public Army(String country, int soldiers, String rank) {
        this(country, soldiers);
        this.rank = rank;
    }

    public Army(String country, int soldiers, String rank, int divisions) {
        this(country, soldiers, rank);
        this.divisions = divisions;
    }

    public Army(String country, int soldiers, String rank, int divisions, String weaponType) {
        this(country, soldiers, rank, divisions);
        this.weaponType = weaponType;
    }

    public Army(String country, int soldiers, String rank, int divisions, String weaponType, boolean hasAirSupport) {
        this(country, soldiers, rank, divisions, weaponType);
        this.hasAirSupport = hasAirSupport;
    }

    public Army(String country, int soldiers, String rank, int divisions, String weaponType, boolean hasAirSupport, int tanks) {
        this(country, soldiers, rank, divisions, weaponType, hasAirSupport);
        this.tanks = tanks;
    }

    public Army(String country, int soldiers, String rank, int divisions, String weaponType, boolean hasAirSupport, int tanks, String missionType) {
        this(country, soldiers, rank, divisions, weaponType, hasAirSupport, tanks);
        this.missionType = missionType;
    }

    public Army(String country, int soldiers, String rank, int divisions, String weaponType, boolean hasAirSupport, int tanks, String missionType, boolean specialForces) {
        this(country, soldiers, rank, divisions, weaponType, hasAirSupport, tanks, missionType);
        this.specialForces = specialForces;
    }

    public Army(String country, int soldiers, String rank, int divisions, String weaponType, boolean hasAirSupport, int tanks, String missionType, boolean specialForces, String commanderName) {
        this(country, soldiers, rank, divisions, weaponType, hasAirSupport, tanks, missionType, specialForces);
        this.commanderName = commanderName;
    }

    public void info() {
        System.out.println("Country: " + country);
        System.out.println("Number of Soldiers: " + soldiers);
        System.out.println("Rank: " + rank);
        System.out.println("Divisions: " + divisions);
        System.out.println("Weapon Type: " + weaponType);
        System.out.println("Has Air Support: " + hasAirSupport);
        System.out.println("Number of Tanks: " + tanks);
        System.out.println("Mission Type: " + missionType);
        System.out.println("Special Forces Available: " + specialForces);
        System.out.println("Commander Name: " + commanderName);
    }
}
