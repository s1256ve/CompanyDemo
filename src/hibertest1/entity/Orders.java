package hibertest1.entity;

public class Orders {
	private String name,pname;
	
	private Integer id,price,number,amount;
	public Orders() {}
	
	public Orders(String name, String pname, Integer price, Integer number, Integer amount) {
		super();
		this.name = name;
		this.pname = pname;
		this.price = price;
		this.number = number;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
}
