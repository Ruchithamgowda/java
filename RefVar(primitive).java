class RefVar{
	public static void main(String[] args){
		byte minTmp=15;
		byte maxTemp=30;
		mintemp=maxtemp;
		System.out.println(mintemp);
		
		short studentsInClass=45;
		short totalStrength=65;
		studentsInClass=totalStrength;
		System.out.println(studentsInClass);
		
		int empId=1001;
		int deptId=2002;
		empId=deptId;
		System.out.println(empId);
		
		long accountNo=7406508813L;
		long referenceNo=9739257715L;
		referenceNo=accountNo;
		System.out.println(referenceNo);
		
		float speed =13.4f;
		float velocity=10.5f;
		speed=velocity;
		System.out.println(speed);
		
		double bankBalance =75000.25;
		double totalSavings=125000.75;
		bankBalance=totalSavings;
		System.out.println(bankBalance);
		
		
		boolean isRaining=false;
		boolean isSnowing=true;
		isSnowing=isRaining;
		System.out.println(isSnowing);
		
		char firstLetter='R';
		char secondLetter='U';
		secondLetter=firstLetter;
		System.out.println(secondLetter);
		
		String movieName="Kantara";
		String director ="Rishab Shetty";
		director=movieName;
		System.out.println(director);
	}
	
}