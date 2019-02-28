/**
 * 
 */
package com.tofek.springboot.model;

/**
 * @author Tofeeque
 *
 */
public class Student {

	private int id;
	private String name;
	private String rollNumber;
	
	
	public Student() {}
	
	/**
	 * @param id
	 * @param name
	 * @param rollNumber
	 */
	public Student(int id, String name, String rollNumber) {
		super();
		this.id = id;
		this.name = name;
		this.rollNumber = rollNumber;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the rollNumber
	 */
	public String getRollNumber() {
		return rollNumber;
	}

	/**
	 * @param rollNumber the rollNumber to set
	 */
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

}
