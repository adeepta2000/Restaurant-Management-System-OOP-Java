import java.util.Scanner;
 class VoucherCode {
	private static final String CODE = "FoodKing321";
	void displayVoucher() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter voucher code to get 10% off = ");
		String inputCode = input.nextLine();
		
		if((inputCode.equals(CODE))){
			double finalBill=Food.totalBill;
			finalBill=finalBill-(finalBill*.1);
			System.out.println("Your bill after 10% off = "+finalBill);
		}
		
		else {
			System.out.println("Your total Bill = "+Food.totalBill);
		}
		
		
		
	}
	
}
