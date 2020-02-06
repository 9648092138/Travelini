package co.travelini.backendservices.entity;

public class GroupSize 
{
private String code;
private String name;

public GroupSize()
{
	
}
public GroupSize(String code, String name)
{
	super();
	this.code = code;
	this.name = name;
}
public String getCode() {
	return code;
}
public void setCode(String code) {
	this.code = code;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() 
{
	return "GroupSize [code=" + code + ", name=" + name + "]";
}

}
