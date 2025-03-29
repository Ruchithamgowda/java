class SirenRunner{
    public static void main(String[] args)
	{
        Siren siren = new Siren();

        System.out.println("The default value for soundType is \t" + siren.soundType);
        System.out.println("The default value for volume is \t" + siren.volume);
        System.out.println("The default value for isEmergency is \t" + siren.isEmergency);
        System.out.println("The default value for color is \t" + siren.color);

        siren.soundType = "Wailing";
        siren.volume = 90;
        siren.isEmergency = true;
        siren.color = "Red";

        System.out.println("The values after initialization:");
        System.out.println("The siren sound type: " + siren.soundType);
        System.out.println("The siren volume: " + siren.volume);
        System.out.println("Is emergency? " + siren.isEmergency);
        System.out.println("The siren color is: " + siren.color);
    }
}