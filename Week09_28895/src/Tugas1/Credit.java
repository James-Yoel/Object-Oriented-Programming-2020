package Tugas1;

public class Credit extends Payment{
	
	private int installment;
	private int maxInstallmentAmount;
	
	public Credit(Item item, int maxInstallmentAmount) {
		this.item = item;
		this.maxInstallmentAmount = maxInstallmentAmount;
		this.installment = 0;
	}
	
	public int pay() {
		if(isPaidOff) {
			return 0;
		}
		isPaidOff = true;
		return item.getPrice()/maxInstallmentAmount;
	}
	
	public int getRemainingAmount() {
		if(isPaidOff) {
			return 0;
		}
		return (item.getPrice()/maxInstallmentAmount) - installment;
	}
	
	public String getClassName() {
		return "CREDIT";
	}
}
