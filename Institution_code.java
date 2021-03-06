import java.util.Scanner;
public class Main
{

	public static void main(String[] args)
	{
//code to read values

	Scanner sc=new Scanner(System.in);
	Institution[] institution=new Institution[4];
	Institution institute=new Institution(0,null,null,0,null);
	for(int i=0;i<4;i++)
	{
		institution[i]=new Institution(sc.nextInt(), sc.next(), sc.next(), sc.nextInt(),sc.next());
	}
	String location1=sc.next();
	int ans1=findNumClearancedByLoc(institution, location1);
	System.out.println(ans1);
	String institutionName2=sc.next();
	sc.close();
	institute=updateInstitutionGrade(institution, institutionName2);
	if(institute!=null)
	{
		int x=(Integer.parseInt(institute.getNoOfStudentsPlaced())*100/(institute.getNoOfStudentsCleared()));
		if(x>=80){
			System.out.println("A" + x);
		}
		else{
			System.out.println(x);
		}
	}

	//code to call required method
//code to display the result
	}

	public static int findNumClearancedByLoc(Institution[] instArray, String location)
	{
//method logic
		int sum=0;
		for(int j=0;j<4;j++)
		{
			if(instArray[j].getLocation().equalsIgnoreCase(location)){
				sum=sum+instArray[j].getNoOfStudentsCleared();
			}
		}
		return sum;
	}

	public static Institution updateInstitutionGrade(Institution[] instArray, String instName)
	{
//method logic
		Institution ins=new Institution(0,null,null,0,null);
		for(int k=0;k<4;k++)
		{
			if(instArray[k].getInstitutionName().equalsIgnoreCase(instName)){
				ins=instArray[k];
			}
		}
		return ins;
	}
}
class Institution
{
//code to build Institution class
	private int institutionId;
	private String institutionName;
	private String noOfStudentsPlaced;
	private int noOfStudentsCleared;
	private String location;
	private String grade;

	public Institution(int institutionId, String institutionName, String noOfStudentsPlaced, int noOfStudentsCleared,String location) 
	{
		this.institutionId = institutionId;
		this.institutionName = institutionName;
		this.noOfStudentsPlaced = noOfStudentsPlaced;
		this.noOfStudentsCleared = noOfStudentsCleared;
		this.location = location;
	}

	public void setInstitutionId(int institutionId) {
		this.institutionId = institutionId;
	}
	public String getInstitutionName() {
		return institutionName;
	}
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}
	public String getNoOfStudentsPlaced() {
		return noOfStudentsPlaced;
	}
	public void setNoOfStudentsPlaced(String noOfStudentsPlaced) {
		this.noOfStudentsPlaced = noOfStudentsPlaced;
	}
	public int getNoOfStudentsCleared() {
		return noOfStudentsCleared;
	}
	public void setNoOfStudentsCleared(int noOfStudentsCleared) {
		this.noOfStudentsCleared = noOfStudentsCleared;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}

	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
}