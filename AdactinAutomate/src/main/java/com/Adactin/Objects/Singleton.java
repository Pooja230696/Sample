package com.Adactin.Objects;

public class Singleton {
private LoginPage lp;
	
	private ForgotPasswordPage fp;
	
	private SearchHotel sh;
	
	public LoginPage getLp() {
		if (lp==null) {
			System.out.println("Object Created");
			lp=new LoginPage();
		}
		return lp;
	}
	
	public ForgotPasswordPage getFp() {
		if (fp==null) {
			fp= new ForgotPasswordPage();
		}
		return fp;
		
	}

	public SearchHotel getSh() {
		if(sh==null) {
			sh=new SearchHotel();
		}
		return sh;
	}
	
	

}
