package java8;

import java.util.Optional;

class Person{
	public String address="Hosa road,Banglore";
	//address ="s";
	public Optional<String> getAddress(){
		return Optional.ofNullable(address);
	}
}


public class OptionalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person();
		
		String address=p.getAddress()
				.map(String::toUpperCase)
				
				.orElse("Address is null");
		
		
		System.out.println(address);
	}

}
