package co.com.saimyrtestdatabuilder;

import co.com.saimyrdomain.Persona;

public class PersonTestDataBuilder {

	private String name;
	private String lastName;
	
	/*public PersonTestDataBuilder(String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}*/
	
	public PersonTestDataBuilder() {
		this.name = "SAIMYR";
		this.lastName = "Software";
	}
	
	public PersonTestDataBuilder withName(String name) {
		this.name = name;
		return this;
	}
	
	public PersonTestDataBuilder withLastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	
	public Persona build(){
		return new Persona(this.name, this.lastName);
	}
	
}
