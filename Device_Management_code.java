import java.util.*;
public class Main
{
public static void main(String[] args)
{
	Phone[] phone=new Phone[4];
	Phone phone1=new Phone(0, null, null, 0);
//code to read values
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<4;i++)
	{
		phone[i]=new Phone(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
	}
	String brand2=sc.next();
	String os2=sc.next();

//code to call required method
	int ans1=findPriceForGivenBrand(phone,brand2);
	System.out.println(ans1);

	phone1=getPhoneIdBasedOnOs(phone,os2);
	if(phone1 !=null)
	{
		System.out.println(phone1.getPhoneId());
	}

	sc.close();
//code to display the result
}

public static int findPriceForGivenBrand(Phone[] phone, String brand)
{
//method logic
	int sum=0;
	for(int j=0;j<4;j++)
	{
		if(phone[j].getBrand().equalsIgnoreCase(brand))
		{
			sum=sum+phone[j].getPrice();
		}
	}
	return sum;
}

public static Phone getPhoneIdBasedOnOs(Phone[] phone, String os)
{
//method logic
	Phone phone2=new Phone(0, os, os, 0);
	for(int k=0;k<4;k++)
	{
		if(phone[k].getOs().equalsIgnoreCase(os))
		{
			phone2=phone[k];
		}
	}
	return phone2;
}
}

class Phone
{
//code to build Phone class
	private int phoneId;
	private String os;
	private  String brand;
	private int price;
	public Phone(int phoneId, String os, String brand, int price)
	{
		this.phoneId=phoneId;
		this.os=os;
		this.brand=brand;
		this.price=price;
	} 


	public int getPhoneId(){
		return phoneId;
	}
	public void setPhoneId( int phoneId){
		this.phoneId=phoneId;
	}

	public String getOs(){
		return os;
	}
	public void setOs(String os){
		this.os=os;
	}

	public String getBrand(){
		return brand;
	}
	public void setBrand(String brand){
		this.brand=brand;
	}


	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price=price;
	}
}