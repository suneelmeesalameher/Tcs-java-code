import java.util.*;
public class Main{
	public static void main(String[] arg) {
	Scanner sc=new Scanner(System.in);
	Player[] player=new Player[4];
	for(int i=0;i<4;i++)
	{
		int playerId=sc.nextInt();sc.nextLine();
		String skill=sc.nextLine();
		String level=sc.nextLine();
		int points=sc.nextInt();sc.nextLine();
		player[i]=new Player(playerId,skill,level,points);
	}
	String skill1=sc.nextLine();
	String level1=sc.nextLine();
	int ans1=findPointsForGivenSkill(player,skill1);
	if(ans1>0)
	{
	System.out.println(ans1);
	}
	else
	{
		System.out.println("The given Skill is not available");
	}
	Player player2=getPlayerBasedOnLevel(player,skill1,level1);
	if(player2==null)
	{
		System.out.println("No player is available with specified level, skill and eligibility points");
	
	}
	else
	{
		System.out.println(player2.getPlayerId());
	}
	}
	public static int findPointsForGivenSkill(Player[] player, String skill1) {
		int sum=0;
		for(int i=0;i<4;i++)
		{
			if(player[i].getSkill().equalsIgnoreCase(skill1)) {
			sum=sum+player[i].getPoints();	
			}
		}
		return sum;
	}
	public static Player getPlayerBasedOnLevel(Player[] player,String skill1, String level1)
	{
		Player player1=new Player(0,null,null,0);
		for(int i=0;i<4;i++)
		{
			if((player[i].getSkill().equalsIgnoreCase(skill1))&&(player[i].getLevel().equalsIgnoreCase(level1))) {
				if(player[i].getPoints()>=20) {
				player1=player[i];
			}
			}
		}
		return player1;
	}
}

class Player{
	private int playerId;
	private String skill;
	private String level;
	private int points;
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public Player(int playerId, String skill, String level, int points) {
		super();
		this.playerId = playerId;
		this.skill = skill;
		this.level = level;
		this.points = points;
	}
	
}