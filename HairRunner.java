class HairRunner{
    public static void main(String[] args) 
	{
        Hair hair = new Hair();

        System.out.println("The default value for color is \t" + hair.color);
        System.out.println("The default value for length is \t" + hair.length);
        System.out.println("The default value for isCurly is \t" + hair.isCurly);
        System.out.println("The default value for type is \t" + hair.type);

        hair.color = "Black";
        hair.length = 20;
        hair.isCurly = false;
        hair.type = "Silky";

        System.out.println("The values after initialization:");
        System.out.println("The hair color: " + hair.color);
        System.out.println("The hair length: " + hair.length);
        System.out.println("Is curly? " + hair.isCurly);
        System.out.println("The hair type is: " + hair.type);
    }
}