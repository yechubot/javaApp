public class savingApp {

	public static void main(String[] args) {
		
		double monthlyIncome = 1500; // dollars
		double moneyFood = 200;
		double moneyBus = 100;
		double moneyRent = 300;
		double totalSaving = monthlyIncome - (moneyFood + moneyBus);
		double savingForFood = totalSaving * 0.3;
		double savingForBus = totalSaving * 0.2;
		double savingInAccount = totalSaving * 0.5;
		double deposit = moneyRent *10;
		
		System.out.println("total Saving : " + totalSaving);
		System.out.println("saving for food : " + savingForFood);
		System.out.println("saving for bus : " + savingForBus);
		System.out.println("saving in account : " + savingInAccount);
		System.out.println("deposit : " + deposit);
		
	}
	
	
}
