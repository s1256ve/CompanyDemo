package action;




import hibertest1.Delete_4_21;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteAction_4_21 extends ActionSupport{
	private int id;
	
	

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		new Delete_4_21().delete(getId());;
		
		return SUCCESS;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	
	

}
