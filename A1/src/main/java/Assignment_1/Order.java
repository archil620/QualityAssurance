package Assignment_1;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

//XML schema defined here
@XmlRootElement(name="order")
@XmlAccessorType(XmlAccessType.FIELD)
public class Order {
	
	@XmlElement
	Dealer dealer;
	
	@XmlElement
	public String result;
	@XmlElement
	public String error;
	@XmlElement
	public String errormessage;
	
	@XmlElementWrapper(name="orderitems")
	@XmlElement(name="item")
	List<Item> itemlist= new ArrayList<Item>();
	
	@XmlElement(name="deliveryaddress")
	Deliveryaddress deliveryaddress;
	
	
	public Dealer getDealer() {
		return dealer;
	}
	public void setDealer(Dealer dealer) {
		this.dealer = dealer;
	}
	public Deliveryaddress getDeliveryaddress() {
		return deliveryaddress;
	}
	public void setDeliveryaddress(Deliveryaddress deliveryaddress) {
		this.deliveryaddress = deliveryaddress;
	}
	public List<Item> getItemlist() {
		return itemlist;
	}
	public void setItemlist(List<Item> itemlist) {
		this.itemlist = itemlist;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getErrormessage() {
		return errormessage;
	}
	public void setErrormessage(String errormessage) {
		this.errormessage = errormessage;
	}
	
	
	

}	
