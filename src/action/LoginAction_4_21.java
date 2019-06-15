package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import hibertest1.Load_4_21;
import hibertest1.Login_4_21;
import hibertest1.entity.Users;

public class LoginAction_4_21 extends ActionSupport{
	private String loginName,loginPwd;
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
	@Override
	public String execute() throws Exception {
		Users u=Login_4_21.load(getLoginName(), getLoginPwd());
		if(u!=null&&getLoginName().equalsIgnoreCase("admin")) {
			ActionContext.getContext().getSession().put("admin", u);
			return "admin";
		}else if(u!=null){
			ActionContext.getContext().getSession().put("u", u);
			return SUCCESS;
		}
		return "fail";
	}
}
