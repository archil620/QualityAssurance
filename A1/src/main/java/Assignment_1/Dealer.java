package Assignment_1;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
public class Dealer {
	
	public String dealerid;
	public String dealeraccesskey;
	
	
	public String getDealerid() {
		return dealerid;
	}
	public void setDealerid(String dealerid) {
		this.dealerid = dealerid;
	}
	public String getDealeraccesskey() {
		return dealeraccesskey;
	}
	public void setDealeraccesskey(String dealeraccesskey) {
		this.dealeraccesskey = dealeraccesskey;
	}
	

}
