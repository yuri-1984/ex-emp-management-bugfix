package jp.co.sample.emp_management.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

/**
 * ログイン時に使用するフォーム.
 * 
 * @author igamasayuki
 * 
 */
public class LoginForm {
	/** メールアドレス */
	@Email(message="Eメールの形式が不正です")
	private String mailAddress;
	/** パスワード */
	@NotBlank(message="パスワードは必須です")
	private String password;
	
	

	public String getMailAddress() {
		return mailAddress;
	}

	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginForm [mailAddress=" + mailAddress + ", password=" + password + "]";
	}

}
