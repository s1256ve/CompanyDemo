package action;



import hibertest1.Add_4_21;
import com.opensymphony.xwork2.ActionSupport;

public class AddAction_4_21 extends ActionSupport{
	private String loginName,loginPwd;
	
	

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		if(!Add_4_21.check(loginName)) {
			new Add_4_21().add(getLoginName(), getLoginPwd());
			
			return SUCCESS;
		}
		return "fail";
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
