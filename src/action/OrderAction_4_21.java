package action;

import com.opensymphony.xwork2.ActionSupport;

import hibertest1.Order_4_21;
import hibertest1.entity.Orders;

public class OrderAction_4_21 extends ActionSupport{
	private String name,pname;
	
	private Integer number,price,amount;
	
	
	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public String execute() throws Exception {
		//int amount=0,price=0;
		//System.out.println(getName()+","+ getPname()+","+ getPrice()+","+ getNumber()+","+ getAmount());
		/*
		switch (getPname()) {
		case "Java":
			price=250;
			
			break;
		case "Struts":
			price=300;
			break;	
		case "C#":
			price=280;
			break;
		default:
			price=0;
			break;
		}
		*/
		//amount=getNumber()*price;
		String pn="";
		Integer am=0;
		System.out.println(getName()+","+ getPname()+","+ getPrice()+","+ getNumber()+","+ getAmount());
		switch (getPrice().intValue()) {
		case 250:
			pn="Java";
			am=getNumber().intValue()*250;
			break;
		case 300:
			pn="Java";
			am=getNumber().intValue()*300;
			break;
		case 280:	
			pn="Java";
			am=getNumber().intValue()*280;
			break;
		default:
			pn="";
			am=0;
			break;
		}
		System.out.println(pn+":"+am);
		if(!getName().equals("")) {
			new Order_4_21().add(getName(), pn, getPrice(), getNumber(), am);
			return SUCCESS;
		}
		
		return "fail";
	}
}
