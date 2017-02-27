package info.orm;

public class Employee 
{
  private Integer eid;
 private  String ename;
   private Double esalary;
/* 
 * when we generate the classes we should always use wrapper classes like Integers,Boolean,Double
 * etc.
 * we should not use primitive data types
 * 
 * Why  we dont use primitive data types?
 * 
 * primitive data types cannot hold null values.wrapper classes can store null values also.
 * that why we are using wrapper classes
 * 
 *  example:
 *  
 * private int salary;  wrong
 *  private Integer salary; correct
 * 
 * */
   
   
   
   public Integer getEid() {
	return eid;
}
public void setEid(Integer eid) {
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public Double getEsalary() {
	return esalary;
}
public void setEsalary(Double esalary) {
	this.esalary = esalary;
}
   
   
}
