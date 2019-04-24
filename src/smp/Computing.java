package smp;

public class Computing {
	

	public double compute(double yearlyIntRate, double bal) {
		double amount = 7;
		amount = 4;
		SavingsAcc sa = new SavingsAcc();
		sa.setBal(500);
		sa.setMonthlyIntRate(1.01);
		sa.computeYearlyIntRate();
		sa.getBal();

		sa.withdraw(amount);
		return bal * yearlyIntRate;
	}

}
