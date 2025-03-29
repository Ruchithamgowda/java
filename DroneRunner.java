class DroneRunner {
    public static void main(String[] args) {
		
        Drone drone1 = new Drone("Phantom 4 Pro", "DJI", 1.38, 30, 7, 72, 5870, "20MP", true, true, 4, false, "2.4GHz", 0.6, "DJI N3", true, "Wi-Fi", "Aerial Photography", "Remote Control", true);
        
		drone1.display();

        Drone drone2 = new Drone("Mavic Air 2", "DJI", 0.57, 34, 10, 68, 3500, "48MP", true, true, 4, false, "5.8GHz", 0.5, "DJI Smart Controller", true, "Bluetooth", "Surveying", "Mobile App", true);
        
		drone2.display();
		
		Drone drone3 = new Drone("Anafi", "Parrot", 0.32, 25, 55, 15, "21MP 4K HDR", true, false, "LiPo",2700, 75, "Mobile App", true, true, true, 4, "WiFi", false, "France");
        
		drone3.display();
    }
}