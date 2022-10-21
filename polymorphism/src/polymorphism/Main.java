package polymorphism;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// Çok biçimlilik.
//		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger(),new ConsoleLogger()};
//		for(BaseLogger logger : loggers) {
//			logger.log("Log mesajı");
//		}
		CustomerManager customerManager=new CustomerManager(new FileLogger());
		customerManager.add();
	}
	

}
