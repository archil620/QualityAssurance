public class Person
{
	private String name;

	
	PersonAuthentication personAuthentication= new PersonAuthentication();
	PersonContactInfo personContactInfo= new PersonContactInfo();
	
	public Person(String name)
	{
		this.name = name;
	}
	
	public void SetLoginCredentials(String userName, String password)
	{
		personAuthentication.SetLoginCredentials(userName, password);
	}
	
	public boolean AuthenticateUser()
	{
		return personAuthentication.AuthenticateUser();
	}
	
	public void SetAreaCode(String areaCode)
	{
		personContactInfo.SetAreaCode(areaCode);
	}
	public String GetAreaCode()
	{
		return personContactInfo.GetAreaCode();
	}
	public void SetPhoneNumber(String phoneNumber)
	{
		personContactInfo.SetPhoneNumber(phoneNumber);
	}
	public String GetPhoneNumber()
	{
		return personContactInfo.GetPhoneNumber();
	}


	

	
}