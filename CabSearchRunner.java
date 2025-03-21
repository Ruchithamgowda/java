class CabSearchRunner {
    public static void main(String[] args) {
        int cost = CabSearch.getCostBySourceAndDestination("Bangalore", "Mysore");
        System.out.println("Cost: " + cost);

        cost = CabSearch.getCostBySourceAndDestination("Mumbai", "Goa");
        System.out.println("Cost: " + cost);

        cost = CabSearch.getCostBySourceAndDestination("Unknown", "Unknown");
        System.out.println("Cost: " + cost);

        int distance = CabSearch.getDistanceBySourceAndDestination("Bangalore", "Mysore");
        System.out.println("Distance: " + distance);

        distance = CabSearch.getDistanceBySourceAndDestination("Mumbai", "Goa");
        System.out.println("Distance: " + distance);

        distance = CabSearch.getDistanceBySourceAndDestination("Unknown", "Unknown");
        System.out.println("Distance: " + distance);

        CabSearch.searchAvailability("Mysore");
        CabSearch.searchAvailability("Agra");
        CabSearch.searchAvailability("Unknown");
    }
}
