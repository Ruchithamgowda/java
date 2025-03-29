class HangerRunner{
    public static void main(String[] args) 
	{
        Hanger hanger = new Hanger();
        
        System.out.println("The default value for material is \t" + hanger.material);
        System.out.println("The default value for type is \t" + hanger.type);
        System.out.println("The default value for capacity is \t" + hanger.capacity);
        System.out.println("The default value for hasClips is \t" + hanger.hasClips);
        
        hanger.material = "Plastic";
        hanger.type = "Clothes Hanger";
        hanger.capacity = 5;
        hanger.hasClips = true;
        
        System.out.println("The values after initialization");
        System.out.println("The hanger material: " + hanger.material);
        System.out.println("The hanger type is: " + hanger.type);
        System.out.println("The capacity is: \t" + hanger.capacity);
        System.out.println("Does it have clips? " + hanger.hasClips);
    }
}