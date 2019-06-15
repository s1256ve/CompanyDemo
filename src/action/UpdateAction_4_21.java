package action;




import hibertest1.Update_4_21;
import com.opensymphony.xwork2.ActionSupport;

public class UpdateAction_4_21 extends ActionSupport{
	private String loginName,loginPwd;
	private int id;
	
	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		new Update_4_21().update(getId(),getLoginName(),getLoginPwd());;
		
		return SUCCESS;
	}

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	



	public String getLoginName() {
		return loginName;
	}



	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}



	public String getLoginPwd() {
		return loginPwd;
	}



	public void setLoginPwd(String loginPwd) {
		this.loginPwd = loginPwd;
	}
	

}
