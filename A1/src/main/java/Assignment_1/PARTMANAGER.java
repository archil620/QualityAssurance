package Assignment_1;
public interface PARTMANAGER {
	
	public enum PartResponse
	{
	SUCCESS,
	OUT_OF_STOCK,
	NO_LONGER_MANUFACTURED
	}
	
	// Submit part for manufacture and delivery.
	public PartResponse SubmitPartForManufactureAndDelivery(
	int partNumber,
	int quantity,
	Deliveryaddress deliveryaddress);
	
	
	

}
