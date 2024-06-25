package com.Student;

public class std2
{
 private int srn;
 private String name;
 private String phoneno;
 private  String city;
 public int getSrn() {
	return srn;
}
public void setSrn(int srn) {
	this.srn = srn;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhoneno() {
	return phoneno;
}
public void setPhoneno(String phoneno) {
	this.phoneno = phoneno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public std2(int srn, String name, String phoneno, String city) {
	super();
	this.srn = srn;
	this.name = name;
	this.phoneno = phoneno;
	this.city = city;
}

public std2(String name, String phoneno, String city) {
	super();
	this.name = name;
	this.phoneno = phoneno;
	this.city = city;
}

public std2() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "std2 [srn=" + srn + ", name=" + name + ", phoneno=" + phoneno + ", city=" + city + "]";
}

}
