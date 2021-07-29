package Tugas2;

public class Credit extends Payment{
	
	protected int installment;
	private int maxInstallmentAmount;
	
	public Credit(Item item, int maxInstallmentAmount) {
		this.item = item;
		this.maxInstallmentAmount = maxInstallmentAmount;
		this.installment = 0;
	}
	
	public int pay() {
		if(item.getPrice() - installment <= 0) {
			isPaidOff = true;
		}
		if(isPaidOff) {
			return 0;
		}
		return (int) Math.ceil(((double)item.getPrice())/maxInstallmentAmount);
	}
	
	public int getRemainingAmount() {
		if(isPaidOff) {
			return 0;
		}
		return item.getPrice() - installment;
	}
	
	public String getClassName() {
		return "CREDIT";
	}
}
