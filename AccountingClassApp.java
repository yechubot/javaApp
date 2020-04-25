class Accounting{
	
	public  double valueOfSupply;
	public  double vatRate;
	public  double expenseRate;
	public  void print() {
		System.out.println("Value of Supply : " +valueOfSupply);
		System.out.println("VAT : " + getVAT());
		System.out.println("Total : " + getTOTAL());
		System.out.println("Expense : " + getEXPENSE());
		System.out.println("Income : " + getIncome());
		System.out.println("Dividend : " + getDividend1());
		System.out.println("Dividend : " + getDividend2());
		System.out.println("Dividend : " + getDividend3());
	}

	public  double getDividend3() {
		return getIncome()*0.2;
	}

	public  double getDividend2() {
		return getIncome()*0.3;
	}

	public  double getDividend1() {
		return getIncome()*0.5;
	}

	public  double getIncome() {
		return valueOfSupply - getEXPENSE();
	}

	public  double getEXPENSE() {
		return valueOfSupply*expenseRate;
	}

	public  double getTOTAL() {
		return valueOfSupply +getVAT();
	}

	public  double getVAT() {
		return valueOfSupply*vatRate;
	}

}

	
public class AccountingClassApp {
	
	
	public static void main(String[] args) {

		
    //instance : a1 - should delete static for instance	
    Accounting a1 = new Accounting(); // instance (copy class but different value)
	a1.valueOfSupply =10000.0;
	a1.vatRate = 0.1;
	a1.expenseRate = 0.3;
	
	
	Accounting a2 = new Accounting(); 
	a2.valueOfSupply =20000.0;
	a2.vatRate = 0.3;
	a2.expenseRate = 0.5;
	
	a2.print();
	}
	
}
	