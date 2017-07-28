
public class BankAccount implements java.io.Serializable {

	
		   private String accountNumber = null;
		   private String totalAmount = null; 
		   private String accountHolderName = null;
		   private int accountHolderAge = 0;
		   private String accountHolderAddress = null;
		   
		public String getAccountNumber() {
			return accountNumber;
		}
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		public String getTotalAmount() {
			return totalAmount;
		}
		public void setTotalAmount(String totalAmount) {
			this.totalAmount = totalAmount;
		}
		public String getAccountHolderName() {
			return accountHolderName;
		}
		public void setAccountHolderName(String accountHolderName) {
			this.accountHolderName = accountHolderName;
		}
		public int getAccountHolderAge() {
			return accountHolderAge;
		}
		public void setAccountHolderAge(int accountHolderAge) {
			this.accountHolderAge = accountHolderAge;
		}
		public String getAccountHolderAddress() {
			return accountHolderAddress;
		}
		public void setAccountHolderAddress(String accountHolderAddress) {
			this.accountHolderAddress = accountHolderAddress;
		}

		  
		
}
