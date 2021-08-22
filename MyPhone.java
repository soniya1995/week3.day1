package week3.day1;

public class MyPhone {

	public static void main(String[] args) {
		
	// TODO Auto-generated method stub
    AndroidPhone a = new AndroidPhone();
    a.sendMsg();
    a.makeCall();
    a.saveContact();
    a.takevideo();
    
    SmartPhone s = new SmartPhone();
    s.makeCall();
    s.connectWhatsApp();
    s.takevideo();
    s.sendMsg();
	}

}
