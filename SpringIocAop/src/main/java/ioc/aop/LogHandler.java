package ioc.aop;

public class LogHandler {

	public void logBefore() {
		System.out.println("logbefore method");
	}
	
	public void logAfter() {
		System.out.println("logafter method");
	}
}
