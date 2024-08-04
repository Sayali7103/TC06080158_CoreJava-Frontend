
public class GSNormalAcc extends NormalAcc {
	
//	protected static final float Charges = 0;
//	protected static float deliveryCharge=50;
//	protected static float TotalCharge=charges+deliveryCharge;


	public GSNormalAcc(int accNo, String accNm, float charges, float deliveryCharge) {
		super(accNo, accNm, charges, deliveryCharge);
		// TODO Auto-generated constructor stub
	}
   	
	public void bookProduct(float charges)
	{	
		System.out.println("Your Product Charges are: "+charges);
		System.out.println("Your Delivery Charges are: "+deliveryCharge);
		System.out.println("Your Total Charges are: "+(charges + deliveryCharge));
	}


	@Override
	public String toString() {
		System.out.println("\nDear Normal User ... ") ;
		System.out.println("Your account is created with Number:" + (getAccNo()) + " & Your Name is: " + getAccNm());
		return "\n";

	}
	
	
}
