package demo.configurationclasses;

public interface BankRepository {
	void doDeposit(int accountId, double amount);
	void doWithdraw(int accountId, double amount);
}
