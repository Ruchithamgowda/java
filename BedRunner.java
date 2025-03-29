class BedRunner{
    public static void main(String[] args) 
	{
        Bed bed = new Bed();

        System.out.println("The default value for size is \t" + bed.size);
        System.out.println("The default value for material is \t" + bed.material);
        System.out.println("The default value for weight is \t" + bed.weight);
        System.out.println("Does it have a headboard? \t" + bed.hasHeadboard);

        bed.size = "Queen";
        bed.material = "Wood";
        bed.weight = 60;
        bed.hasHeadboard = true;

        System.out.println("The values after initialization:");
        System.out.println("Bed size: " + bed.size);
        System.out.println("Bed material: " + bed.material);
        System.out.println("Bed weight: " + bed.weight);
        System.out.println("Does it have a headboard? " + bed.hasHeadboard);
    }
}