
public class Monkey extends RescueAnimal{
	private String breed;
	 
	 
    public Monkey(String name, String breed, String gender, String age,
    String weight, String acquisitionDate, String acquisitionCountry,
	String trainingStatus, boolean reserved, String inServiceCountry,
	double tailLength, double Height, double bodyLength, String Species) {
        setName(name);
        setBreed(breed);
        setGender(gender);
        setAge(age);
        setWeight(weight);
        setAcquisitionDate(acquisitionDate);
        setAcquisitionLocation(acquisitionCountry);
        setTrainingStatus(trainingStatus);
        setReserved(reserved);
        setInServiceCountry(inServiceCountry);
        settailLength(tailLength);
        setHeight(Height);
        setbodyLength(bodyLength);
        setSpecies(Species);
    }
    
    
        public String setSpecies(String species) {
        	return species;
	}
		public double setbodyLength(double bodyLength) {
			return bodyLength;
		
	}

		public double setHeight(double height) {
        	return height;
	}


		public double settailLength(double tailLength) {
        	return tailLength; 
	}
		public String getBreed() {
            return breed;
        }  
        public void setBreed(String dogBreed) {
            breed = dogBreed;
        }


		public static void setReserved(String nextLine) {			
			
		}


		public void setspecies(String nextLine) {
			// TODO Auto-generated method stub
			
		}


		public static String inServiceCountry() {
			
			return inServiceCountry;
		}
}
