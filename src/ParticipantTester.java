import java.util.Scanner;


public class ParticipantTester {

	public static void main(String[] args) {
		//Create a scanner
		Scanner scanner = new Scanner(System.in);

		//Create an array of objects for the participants
		Participant[] participants = new Participant[10];
		
		//Initialize the objects via the constructors
		for(int i = 0 ; i < 10 ; i++)
		{
			participants[i] = new Participant();

		}
		 
		//Read the input for sport type selection
		System.out.println("Select a sports category between 'Swimming', 'Soccer', 'Cycling'");
		String sportSelection = scanner.next();

		//Selecting by sport
		System.out.println("Selecting by sport;");
		Participant[] selectedsport =  selectSportType(participants , sportSelection);
		
		//Print the selected participants
		for(int j = 0 ; j < selectedsport.length ; j++)
		{
			System.out.println(selectedsport[j].toString());
		}
		
		//Selecting by National awards
		
		//Read the input for national awards selection
		System.out.println("Desired amount of National awards: (Maximum of 2)");
		int nationalAwardSelection = Integer.parseInt(scanner.next());
	
		System.out.println("Selecting by National Awards;");
		Participant[] selectedNatAw =  selectNationalAwards(participants , nationalAwardSelection);
			
		//Print the selected participants
		for(int j = 0 ; j < selectedNatAw.length ; j++)
		{
			System.out.println(selectedNatAw[j].toString());

		}
		
		//Selecting by international awards
		
		//Read the input for national awards selection
		System.out.println("Desired amount of National awards: (Maximum of 2)");
		int internationalAwardSelection = Integer.parseInt(scanner.next());
		
		System.out.println("Selecting by international awards;");
		Participant[] selectedIntAw =  selectInternationalAwards(participants , internationalAwardSelection);
		
		//Print the selected participants
		for(int j = 0 ; j < selectedIntAw.length ; j++)
		{
			System.out.println(selectedIntAw[j].toString());

		}
		
		
		
		
	}
	
	// Method to select the participants by age
	public static Participant[] selectAge(Participant[] pGroup , int ageLowerBound , int ageUpperBound) {
		
		int selectionCount = 0;
		
		for(int i = 0; i < pGroup.length; i++)
		{
			if( ageLowerBound <= pGroup[i].getAge() && pGroup[i].getAge()  <= ageUpperBound)
			{
				selectionCount++;
			}
		}
		
		Participant[] selectedParticipants = new Participant[selectionCount];
		int index = 0;
		
		for(int i = 0; i < pGroup.length; i++)
		{
			if( ageLowerBound <= pGroup[i].getAge() && pGroup[i].getAge()  <= ageUpperBound)
			{
				selectedParticipants[index++] = pGroup[i];
			}
		}

		return selectedParticipants;
	}
	
	// Method to select the participants by the international award amount
	public static Participant[] selectNationalAwards(Participant[] pGroup, int natAwardAmount) {
		  
		int selectionCount = 0;
		
		for(int i = 0; i < pGroup.length; i++)
		{
			if( natAwardAmount == pGroup[i].getNationalAwards() )
			{
				selectionCount++;
			}
		}
		
		Participant[] selectedParticipants = new Participant[selectionCount];
		
		int index = 0;
		
		for(int i = 0; i < pGroup.length; i++)
		{
			if( natAwardAmount == pGroup[i].getNationalAwards() )
			{
				selectedParticipants[index++] = pGroup[i];
			}
		}
			
		
		return selectedParticipants;
		}
			  
	// Method to select the participants by the international award amount
	public static Participant[] selectInternationalAwards(Participant[] pGroup, int internationalAwardAmount) {
		  
	  	int selectionCount = 0;
	
		for(int i = 0; i < pGroup.length; i++)
		{
			if( internationalAwardAmount == pGroup[i].getInternationalAwards() )
			{
				selectionCount++;
			}
		}
		
		Participant[] selectedParticipants = new Participant[selectionCount];
		
		int index = 0;
		
		for(int i = 0; i < pGroup.length; i++)
		{
			if( internationalAwardAmount == pGroup[i].getInternationalAwards() )
			{
				selectedParticipants[index++] = pGroup[i];
			}
		}
		
		return selectedParticipants;
  
	  }
	  
	// Method to select the participants by the type of sport
	public static Participant[] selectSportType(Participant[] pGroup, String sportType) {
		  
	  	int selectionCount = 0;

	  	//Calculating the size for the selected participant group size
		for(int i = 0; i < pGroup.length; i++)
		{
			//Using equals to compare the sports types provided by the user
			if( sportType.equals(pGroup[i].getSportType()) )
			{
				//Increasing the selection count depending on the participants that match the selecton scope
				selectionCount++;
			}
		}
		
		//Creating an participant object for the selection group
		Participant[] selectedParticipants = new Participant[selectionCount];
		
		int index = 0;
		
		//Copying the participants into a new object
		for(int i = 0; i < pGroup.length; i++)
		{
			if( sportType.equals(pGroup[i].getSportType()) )
			{
				selectedParticipants[index++] = pGroup[i];
			}
		}
		
		return selectedParticipants;
	  
	  }
		 
	 
	

}
