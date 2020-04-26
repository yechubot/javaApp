public class savingAppMethod {
	
	public static double monthlyIncome; 
	public static double moneyFood;
	public static double moneyBus;
	
	public static void main(String[] args) {
		
		monthlyIncome = 1500; //dollars
		moneyFood = 200;
	    moneyBus = 100;
		
		
		System.out.println("total Saving : " + getTotal());
		System.out.println("saving for food : " +  getFoodMoney());
		System.out.println("saving for bus : " +  getBusMoney());
		System.out.println("saving in account : " +  getSavingAccount());
		System.out.println("spend: " + spend());
		
	}

	private static double spend() {
		return moneyFood + moneyBus;
	}

	private static double getSavingAccount() {
		return getTotal() * 0.5;
	}

	private static double getBusMoney() {
		return getTotal() * 0.2;
	}

	private static double getFoodMoney() {
		return getTotal() * 0.3;
	}

	private static double getTotal() {
		return monthlyIncome - spend();
	}
	
	
}