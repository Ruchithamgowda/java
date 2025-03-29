class AnchorRunner{
    public static void main(String[] args) 
	{
        Anchor anchor = new Anchor();

        System.out.println("The default value for material is \t" + anchor.material);
        System.out.println("The default value for weight is \t" + anchor.weight);
        System.out.println("The default value for isRustProof is \t" + anchor.isRustProof);
        System.out.println("The default value for shape is \t" + anchor.shape);

        anchor.material = "Steel";
        anchor.weight = 15;
        anchor.isRustProof = true;
        anchor.shape = "Fluke";

        System.out.println("The values after initialization:");
        System.out.println("The anchor material: " + anchor.material);
        System.out.println("The anchor weight: " + anchor.weight);
        System.out.println("Is rust-proof? " + anchor.isRustProof);
        System.out.println("The anchor shape is: " + anchor.shape);
    }
}