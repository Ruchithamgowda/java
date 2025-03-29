class PatientRunner{
    public static void main(String[] args) 
	{
        Patient patient = new Patient();

        System.out.println("The default value for name is \t" + patient.name);
        System.out.println("The default value for age is \t" + patient.age);
        System.out.println("The default value for isAdmitted is \t" + patient.isAdmitted);
        System.out.println("The default value for disease is \t" + patient.disease);

        patient.name = "John Doe";
        patient.age = 40;
        patient.isAdmitted = true;
        patient.disease = "Flu";

        System.out.println("The values after initialization:");
        System.out.println("The patient name: " + patient.name);
        System.out.println("The patient age: " + patient.age);
        System.out.println("Is admitted? " + patient.isAdmitted);
        System.out.println("The disease is: " + patient.disease);
    }
}