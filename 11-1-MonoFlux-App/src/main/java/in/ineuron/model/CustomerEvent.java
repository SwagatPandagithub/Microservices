package in.ineuron.model;

import java.util.Date;

public class CustomerEvent {
	
	public String customerName;
	public Date date;
	
	
	
	
	
	public CustomerEvent(String customerName, Date date) {
		super();
		this.customerName = customerName;
		this.date = date;
	}
	@Override
	public String toString() {
		return "CustomerEvent [customerName=" + customerName + ", date=" + date + "]";
	}
	public CustomerEvent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
