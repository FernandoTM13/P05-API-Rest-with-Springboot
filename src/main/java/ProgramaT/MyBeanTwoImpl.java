package ProgramaT;

public class MyBeanTwoImpl implements MyBean {

	private String name;
	private String randomValue;
	
	public MyBeanTwoImpl(String name, String randomValue) {
		this.name = name;
		this.randomValue = randomValue;
	}

	@Override
	public String hello() {
		return "Hello from my MyBeanTwoImpl with name" + name + " y random value: " + randomValue;
	}
	

}
