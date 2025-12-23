package encapsulation;

public class Customer {
	//100% Encapsulation(Java Bean)==>Using Getters and Setters
private int cid;
private String cname;
private int age;
public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}

public Customer() {
	System.out.println("------Empty Constructor-----");
	 
}

public void setCname(String cname) {
	this.cname = cname;
}
public Customer(int cid, String cname, int age) {
	super();
	System.out.println("------Parameterized Constructor-----");
	this.cid = cid;
	this.cname = cname;
	this.age = age;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}



}
