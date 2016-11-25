package account;

public class TransferToTransaction extends Transaction {

	private String toName;

	public TransferToTransaction(int amount, String to) {
		super(amount);
		toName = to;
	}

	public void printTransaction() {
		System.out.println(super.toString() + " transfered to " + toName);
	}

}
 