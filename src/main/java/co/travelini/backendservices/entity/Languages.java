package co.travelini.backendservices.entity;

public class Languages 
{
private String name;
private String code;

public Languages()
{
	
}
public Languages(String name, String code)
{
	super();
	this.name = name;
	this.code = code;
}
public String getName() 
{
	return name;
}
public void setName(String name)
{
	this.name = name;
}
public String getCode() 
{
	return code;
}
public void setCode(String code) 
{
	this.code = code;
}
@Override
public String toString() 
{
	return "Languages [name=" + name + ", code=" + code + "]";
}

}
