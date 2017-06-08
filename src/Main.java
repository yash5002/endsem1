
public class Main {

	public static void main(String[] args) {
		
		Evm t=new Evm(1,"Ponda"); 
		Candidate c1=new Candidate(t,"Tanay");
		Candidate c5=new Candidate(t,"Vrunali");
		
		
		
		
		Evm m=new Evm(2,"Bicholim");
		Candidate c2=new Candidate(m,"Tanaya");
		Candidate c3=new Candidate(m,"Pankaj");
		Candidate c4=new Candidate(m,"Tanvi");
		
		
		
		Voter v=new Voter(101,c1);
		c1.incrementVoteCount();
		System.out.println("VOTE COUNTED. THANK YOU FOR VOTING");
		Voter v2=new Voter(102,c1);
		c1.incrementVoteCount();
		System.out.println("VOTE COUNTED. THANK YOU FOR VOTING");		
		Voter v5=new Voter(103,c1);
		c1.incrementVoteCount();
		System.out.println("VOTE COUNTED. THANK YOU FOR VOTING");		
		Voter v3=new Voter(104,c3);
		c3.incrementVoteCount();
		System.out.println("VOTE COUNTED. THANK YOU FOR VOTING");		
		Voter v4=new Voter(105,c3);
		c3.incrementVoteCount();
		System.out.println("VOTE COUNTED. THANK YOU FOR VOTING");		
		Voter v6=new Voter(106,c2);
		c2.incrementVoteCount();
		System.out.println("VOTE COUNTED. THANK YOU FOR VOTING");		
		Voter v7=new Voter(107,c3);
		c3.incrementVoteCount();
		System.out.println("VOTE COUNTED. THANK YOU FOR VOTING");		
		Voter v8=new Voter(108,c2);
		c2.incrementVoteCount();
		System.out.println("VOTE COUNTED. THANK YOU FOR VOTING");		
		Voter v9=new Voter(109,c2);
		c2.incrementVoteCount();
		System.out.println("VOTE COUNTED. THANK YOU FOR VOTING");		
		Voter v10=new Voter(110,c2);
		c2.incrementVoteCount();
		System.out.println("VOTE COUNTED. THANK YOU FOR VOTING");		
		
		
		System.out.println("###################################################");
		System.out.println("Total number of votes = "+Voter.counter());
		System.out.println("###################################################");
		
		System.out.println("");

		System.out.println("###################################################");
		System.out.println("After closing poll:");
		System.out.print(Evm.closepoll());
		System.out.println("###################################################");
		
		System.out.println("");

		System.out.println("###################################################");
		System.out.println(c1.getName()+" got "+c1.getNumberOfVotes()+" number of votes from "+ t.getConstinuency());
		System.out.println(c5.getName()+" got "+c5.getNumberOfVotes()+" number of votes from "+ t.getConstinuency());
		System.out.println("###################################################");

		System.out.println("");

		System.out.println("###################################################");
		System.out.println(c3.getName()+" got "+c3.getNumberOfVotes()+" number of votes from "+ m.getConstinuency());
		System.out.println(c2.getName()+" got "+c2.getNumberOfVotes()+" number of votes from "+ m.getConstinuency());
		System.out.println(c4.getName()+" got "+c4.getNumberOfVotes()+" number of votes from "+ m.getConstinuency());
		System.out.println("###################################################");

		System.out.println("");
		
		Voter.resetCounter();
		System.out.println("###################################################");

		System.out.println("After reseting counter:");
		System.out.println("Total number of votes polled during the poll is "+Voter.counter());
		System.out.println("###################################################");

		System.out.println("");

	}

}
