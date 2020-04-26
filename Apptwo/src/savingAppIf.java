public class savingAppIf {

	public static void main(String[] args) {
		
		double monthlyIncome = Double.parseDouble(args[0]);
		double moneyFood = 200;
		double moneyBus = 100;
		double totalSaving = monthlyIncome - (moneyFood + moneyBus);
		
		double savingInAccount;
		double savingForTravel;
		double savingForAPT;
		
		
		if(monthlyIncome > 1500) {
			savingForAPT = totalSaving * 0.3;
			savingForTravel = totalSaving * 0.2; 
			savingInAccount = totalSaving * 0.5;
		} else {
			savingForAPT = totalSaving * 0.2;
			savingForTravel = totalSaving * 0.1; 
			savingInAccount = totalSaving * 0.7;
		}
		System.out.println("montly income:" + monthlyIncome);
		System.out.println("total Saving : " + totalSaving);
		System.out.println("saving for APT : " + savingForAPT);
		System.out.println("saving for Travel : " + savingForTravel);
		System.out.println("saving in account : " + savingInAccount);
	
	
	
	}
	
	
}