package action;





import hibertest1.Load_4_21;
import hibertest1.entity.Users;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoadAction_4_21 extends ActionSupport{
	private int id;
	
	

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		Users u=new Load_4_21().load(getId());
		if(u!=null)
			ActionContext.getContext().getSession().put("u", u);
		return SUCCESS;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	
	

}
