package smp;

public class SavingsAcc {
	private double monthlyIntRate;
	double bal;

	double computeYearlyIntRate() {
		double yearlyIntRate = this.monthlyIntRate * 12;
		this.bal = this.bal * yearlyIntRate;
		return bal;
	}

	double computeYearlyIntRate(double yearlyIntRate, double bal) {
		return bal * yearlyIntRate;
	}

	double withdraw(double withdrawBal) {
		double newBal = this.bal - withdrawBal;
		return newBal;
	}

	void withdraw2(double withdrawBal) {
		// this.bal = this.bal - withdrawBal;
		this.bal -= withdrawBal;
	}

	public double getBal() {
		return this.bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}

	public double getMonthlyIntRate() {
		return monthlyIntRate;
	}

	public void setMonthlyIntRate(double monthlyIntRate) {
		this.monthlyIntRate = monthlyIntRate;
	}

}
