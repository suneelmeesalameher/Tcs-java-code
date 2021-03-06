import java.util.*;
import java.util.Arrays;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TravelAgencies[] travelagencies=new TravelAgencies[4];
		for(int i=0;i<4;i++)
		{
			int regNo=sc.nextInt();sc.nextLine();
			String agencyName=sc.nextLine();
			String packageType=sc.nextLine();
			int price=sc.nextInt();sc.nextLine();
			Boolean flightFacility=sc.nextBoolean();
			travelagencies[i]=new TravelAgencies(regNo,agencyName,packageType,price,flightFacility);
		}
		int ans1=findAgencyWithHighestPackagePrice(travelagencies);
		int reg=sc.nextInt();sc.nextLine();
		String pack=sc.nextLine();
		TravelAgencies trav1= agencyDetailsforGivenIdAndType(travelagencies,reg,pack);
		System.out.println(ans1);
		System.out.println(trav1.getAgencyName()+":"+trav1.getPrice());
		
	}
	public static int findAgencyWithHighestPackagePrice(TravelAgencies[] travelagencies)
	{
		int con=0;
		for(int i=0;i<4;i++)
		{
			if(travelagencies[i].getPrice()>con)
			{
				con=travelagencies[i].getPrice();
			}
		}
		return con;
		
	}
	public static TravelAgencies agencyDetailsforGivenIdAndType(TravelAgencies[] travelagencies,int reg,String pack)
	{
		TravelAgencies travelagencies1=new TravelAgencies(0,null,null,0,null);
		for(int i=0;i<4;i++)
		{
			if((travelagencies[i].getRegNo()==reg)&&(travelagencies[i].getPackageType().equalsIgnoreCase(pack)))
			{
				if(travelagencies[i].getFlightFacility())
				{
					travelagencies1=travelagencies[i];
				}
			}
		}
		return travelagencies1;
		
	}
	
	
}
class TravelAgencies{
	private int regNo;
	private String agencyName;
	private String packageType;
	private int price;
	private Boolean flightFacility;
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getAgencyName() {
		return agencyName;
	}
	public void setAgencyName(String agencyName) {
		this.agencyName = agencyName;
	}
	public String getPackageType() {
		return packageType;
	}
	public void setPackageType(String packageType) {
		this.packageType = packageType;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Boolean getFlightFacility() {
		return flightFacility;
	}
	public void setFlightFacility(Boolean flightFacility) {
		this.flightFacility = flightFacility;
	}
	public TravelAgencies(int regNo, String agencyName, String packageType, int price, Boolean flightFacility) {
		super();
		this.regNo = regNo;
		this.agencyName = agencyName;
		this.packageType = packageType;
		this.price = price;
		this.flightFacility = flightFacility;
	}
	
}