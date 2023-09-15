import java.util.Random;
import java.util.Arrays;

public class Participant {
    private String name;
    private String surname;
    private int age;
    private String sportType;
    private String[] internationalAwards;
    private String[] nationalAwards;
    
    //Constructor
    public Participant()
    {
    	// Initialize attributes with random values using helper functions
    	this.name = randomName();
    	this.surname = randomSurname();
    	this.age = randomAge();
    	this.sportType = randomSportType();
    	this.internationalAwards = randomInternationalAwards();
    	this.nationalAwards = randomNationalAwards();
    }
    
    // Custom toString method to display participant information
    public String toString() {
        return "Name=" + name + ", Surname=" + surname + ", age=" + age + ", Sports=" + sportType + 
        			", international awards " + Arrays.toString(internationalAwards) + ", national awards=" + Arrays.toString(nationalAwards) + "]";
     
    }
    
    // Get an Set Functions for each element
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSportType() {
        return sportType;
    }
    public void setSportType(String sportType) {
        this.sportType = sportType;
    }

    public String[]  getNationalAwards() {
        return nationalAwards;
    }

    public void setNationalAwardss(String[] nationalAwardCount) {
        this.nationalAwards = nationalAwardCount;
    }
    
    public String[]  getInternationalAwards() {
        return internationalAwards;
    }

    public void setInternationalAwards(String[] internationalAwardCount) {
        this.internationalAwards = internationalAwardCount;
    }
    
    //Helper functions for Constructor
    
    //Function for constructor to pick a random name
    public String randomName() {
    	String[] firstNames = {"Josef","Andre","Phillip","Stefan","David","Fiona","Lars","Corina","James","Alice"};
    	
    	Random rand = new Random();
    	int firstNameRNG = rand.nextInt(10);
    	
    	String rName = firstNames[firstNameRNG];
    	
    	return rName;
    }
    
    //Function for constructor to pick a random surname
    public String randomSurname() {
    	String[] lastNames = {"Smith", "Johnson", "Brown", "Davis", "Wilson", "Lee","Jentzen","Hartl","Iskender","Hamlin","Dirk"};
    	
    	Random rand = new Random();
    	int surnameRNG = rand.nextInt(10);
    	
    	String rSurname = lastNames[surnameRNG];
    	
    	return rSurname;
    }
    
    //Function for constructor to pick a random sports type
    public String randomSportType() {
    	String[] sportTypes = {"Swimming", "Soccer", "Cycling"};
    	
    	Random rand = new Random();
    	int sportTypeRNG = rand.nextInt(3);
    	
    	//Select a random sport type tag from the list
    	String rSportType = sportTypes[sportTypeRNG];
    	
    	return rSportType;
    }
    
    //Function for constructor to pick a random age
    public int randomAge() {
    	Random rand = new Random();
    	
    	// Generate a random age between 16 and 35
    	int rAge = rand.nextInt(20) + 16;
    	
    	return rAge;
    }
    
    //Function for constructor to pick a random national awards number
    public String[] randomNationalAwards() {
    	Random rand = new Random();
    	String[] medals = {"Gold","Silver","Bronze"};
    	
    	int index = 0;
    	
    	// Generate a random number of national awards (0 to 2)
    	int rNationalAwards = rand.nextInt(3);
    	
    	String[] tempNatAwards = new String[rNationalAwards];
    	
    	for(int i = 0 ; i < rNationalAwards ; i++)
    	{
    		tempNatAwards[index++] = medals[rand.nextInt(3)];
    	}
    	
    	return tempNatAwards;
    }
    
  //Function for constructor to pick a random international awards number
    public String[] randomInternationalAwards() {
    	Random rand = new Random();
    	String[] medals = {"Gold","Silver","Bronze"};
    	
    	int index = 0;
    	
    	// Generate a random number of international awards (0 to 2)
    	int rIntertionalAwards = rand.nextInt(3);
    	
    	String[] tempIntAwards = new String[rIntertionalAwards];
    	
    	for(int i = 0 ; i < rIntertionalAwards ; i++)
    	{
    		tempIntAwards[index++] = medals[rand.nextInt(3)];
    	}
    	
    	return tempIntAwards;
    }
    
}
