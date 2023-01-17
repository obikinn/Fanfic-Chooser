package fanficChooser;

import java.util.Random;
import java.util.Scanner;

public class FanficChooser {
	
	public static void main(String[] args){
		
		// Variables
		Scanner input = new Scanner(System.in);
	  Random random = new Random();
	  String shipName[] = {"ZADR", "OBIKIN", "STYLE", "AKUROKU", "SORIKU", "CREEK", "BUNNY", 
                               "GIGOLAS", "SIDLINK", "SNUFMIN", "RUSAME", "DAVEKAT", "JOHNDAVE", 
	    	               "RINHARU", "FINNPOE", "KYHUX", "DINLUKE", "REXWALKER", "CODYWAN"};
    
	  // Code
		
    // Ask for user input
    System.out.println("Do you want to read a fanfic? (Y/N)");
    String yesNo = input.nextLine();
		
		// If they say yes
		if(yesNo.equals("y") || yesNo.equals("Y")) {	
		  	String shipChosen = shipName[random.nextInt(shipName.length)];
	    	System.out.println("\n" + "YOU SHALL READ " + shipChosen + "!");
	    	System.out.println("Copy and paste the below URL into your web browser:");

	    	if(shipChosen.equals("ZADR")) {
			System.out.println("https://archiveofourown.org/tags/Dib*s*Zim%20(Invader%20Zim)/works");	    
	    	}
	    	if(shipChosen.equals("OBIKIN")) {
			System.out.println("https://archiveofourown.org/tags/Obi-Wan%20Kenobi*s*Anakin%20Skywalker/works");	    
	    	}
	    	if(shipChosen.equals("STYLE")) {
			System.out.println("https://archiveofourown.org/tags/Kyle%20Broflovski*s*Stan%20Marsh/works");	    
	    	}
	    	if(shipChosen.equals("AKUROKU")) {
			System.out.println("https://archiveofourown.org/tags/Axel*s*Roxas%20(Kingdom%20Hearts)/works");	    		
	    	}		    	
	    	if(shipChosen.equals("SORIKU")) {
			System.out.println("https://archiveofourown.org/tags/Riku*s*Sora%20(Kingdom%20Hearts)/works");	    
	    	}
	    	if(shipChosen.equals("CREEK")) {
			System.out.println("https://archiveofourown.org/tags/Craig%20Tucker*s*Tweek%20Tweak/works");	    
	    	}
	    	if(shipChosen.equals("BUNNY")) {
			System.out.println("https://archiveofourown.org/tags/Kenny%20McCormick*s*Leopold%20%22Butters%22%20Stotch/works");	    
	    	}
	    	if(shipChosen.equals("GIGOLAS")) {
			System.out.println("https://archiveofourown.org/tags/Gimli%20(Son%20of%20Gl%C3%B3in)*s*Legolas%20Greenleaf/works");	    
	    	}
	    	if(shipChosen.equals("SIDLINK")) {
			System.out.println("https://archiveofourown.org/tags/Link*s*Prince%20Sidon/works");	    
	    	}
	    	if(shipChosen.equals("SNUFMIN")) {
			System.out.println("https://archiveofourown.org/tags/Mumintrollet%20%7C%20Moomintroll*s*Snusmumriken%20%7C%20Snufkin/works");	    
	    	}		    	
	    	if(shipChosen.equals("RUSAME")) {
			System.out.println("https://archiveofourown.org/tags/America*s*Russia%20(Hetalia)/works");	    
	    	}
	    	if(shipChosen.equals("DAVEKAT")) {
			System.out.println("httpshttps://archiveofourown.org/tags/Dave%20Strider*s*Karkat%20Vantas/works");	    
	    	}
	    	if(shipChosen.equals("JOHNDAVE")) {
			System.out.println("https://archiveofourown.org/tags/John%20Egbert*s*Dave%20Strider/works");	    
	    	}
	    	if(shipChosen.equals("RINHARU")) {
			System.out.println("https://archiveofourown.org/tags/Matsuoka%20Rin*s*Nanase%20Haruka/works");	    
	    	}
	    	if(shipChosen.equals("FINNPOE")) {
			System.out.println("https://archiveofourown.org/tags/Poe%20Dameron*s*Finn/works");	    
	    	}		
	    	if(shipChosen.equals("KYHUX")) {
			System.out.println("https://archiveofourown.org/tags/Armitage%20Hux*s*Kylo%20Ren/works");	    
	    	}		
	    	if(shipChosen.equals("DINLUKE")) {
			System.out.println("https://archiveofourown.org/tags/Din%20Djarin*s*Luke%20Skywalker/works");	    
	    	}	
	    	if(shipChosen.equals("REXWALKER")) {
			System.out.println("https://archiveofourown.org/tags/CT-7567%20%7C%20Rex*s*Anakin%20Skywalker/works");	    
	    	}	
	    	if(shipChosen.equals("CODYWAN")) {
			System.out.println("https://archiveofourown.org/tags/CC-2224%20%7C%20Cody*s*Obi-Wan%20Kenobi/works");	    
	    	}	
	    	else { 	    		
	    	}
					
		  	// Generate another 						
		    System.out.println("\n" + "Not feeling that ship? Want to pick another? (Y/N)");
		    String another = input.nextLine();
		    
		    // Loop
		    do{    
				  shipChosen = shipName[random.nextInt(shipName.length)];
		    	System.out.println("\n" + "YOU SHALL READ " + shipChosen + "!");
		    	System.out.println("Copy and paste the below URL into your web browser:");
	
		    	if(shipChosen.equals("ZADR")) {
				System.out.println("https://archiveofourown.org/tags/Dib*s*Zim%20(Invader%20Zim)/works");	    
		    	}
		    	if(shipChosen.equals("OBIKIN")) {
				System.out.println("https://archiveofourown.org/tags/Obi-Wan%20Kenobi*s*Anakin%20Skywalker/works");	    
		    	}
		    	if(shipChosen.equals("STYLE")) {
				System.out.println("https://archiveofourown.org/tags/Kyle%20Broflovski*s*Stan%20Marsh/works");	    
		    	}
		    	if(shipChosen.equals("AKUROKU")) {
				System.out.println("https://archiveofourown.org/tags/Axel*s*Roxas%20(Kingdom%20Hearts)/works");	    		
		    	}		    	
		    	if(shipChosen.equals("SORIKU")) {
				System.out.println("https://archiveofourown.org/tags/Riku*s*Sora%20(Kingdom%20Hearts)/works");	    
		    	}
		    	if(shipChosen.equals("CREEK")) {
				System.out.println("https://archiveofourown.org/tags/Craig%20Tucker*s*Tweek%20Tweak/works");	    
		    	}
		    	if(shipChosen.equals("BUNNY")) {
				System.out.println("https://archiveofourown.org/tags/Kenny%20McCormick*s*Leopold%20%22Butters%22%20Stotch/works");	    
		    	}
		    	if(shipChosen.equals("GIGOLAS")) {
				System.out.println("https://archiveofourown.org/tags/Gimli%20(Son%20of%20Gl%C3%B3in)*s*Legolas%20Greenleaf/works");	    
		    	}
		    	if(shipChosen.equals("SIDLINK")) {
				System.out.println("https://archiveofourown.org/tags/Link*s*Prince%20Sidon/works");	    
		    	}
		    	if(shipChosen.equals("SNUFMIN")) {
				System.out.println("https://archiveofourown.org/tags/Mumintrollet%20%7C%20Moomintroll*s*Snusmumriken%20%7C%20Snufkin/works");	    
		    	}		    	
		    	if(shipChosen.equals("RUSAME")) {
				System.out.println("https://archiveofourown.org/tags/America*s*Russia%20(Hetalia)/works");	    
		    	}
		    	if(shipChosen.equals("DAVEKAT")) {
				System.out.println("httpshttps://archiveofourown.org/tags/Dave%20Strider*s*Karkat%20Vantas/works");	    
		    	}
		    	if(shipChosen.equals("JOHNDAVE")) {
				System.out.println("https://archiveofourown.org/tags/John%20Egbert*s*Dave%20Strider/works");	    
		    	}
		    	if(shipChosen.equals("RINHARU")) {
				System.out.println("https://archiveofourown.org/tags/Matsuoka%20Rin*s*Nanase%20Haruka/works");	    
		    	}
		    	if(shipChosen.equals("FINNPOE")) {
				System.out.println("https://archiveofourown.org/tags/Poe%20Dameron*s*Finn/works");	    
		    	}		
		    	if(shipChosen.equals("KYHUX")) {
				System.out.println("https://archiveofourown.org/tags/Armitage%20Hux*s*Kylo%20Ren/works");	    
		    	}		
		    	if(shipChosen.equals("DINLUKE")) {
				System.out.println("https://archiveofourown.org/tags/Din%20Djarin*s*Luke%20Skywalker/works");	    
		    	}	
		    	if(shipChosen.equals("REXWALKER")) {
				System.out.println("https://archiveofourown.org/tags/CT-7567%20%7C%20Rex*s*Anakin%20Skywalker/works");	    
		    	}	
		    	if(shipChosen.equals("CODYWAN")) {
				System.out.println("https://archiveofourown.org/tags/CC-2224%20%7C%20Cody*s*Obi-Wan%20Kenobi/works");	    
		    	}	
		    	else { 		    		
		    	}
		   	
		    	System.out.println("\n" + "Not feeling that ship? Want to pick another? (Y/N)");
			    another = input.nextLine();
          
		      } 
		    
		    while(another.equals("y") || another.equals("Y"));    
      
		    System.out.println("Bye bitch.");
		}
		
		// If they say no
		else {
			System.out.println("Bye bitch.");
		}   
	    
	  // Close input stream	    
		input.close();
		
		System.out.println();
		System.out.println();
		
	}
}
