package session2.assignment1;

import java.util.List;
import java.util.Scanner;
import java.io.*;      

public class Survey {

	//list of Questions , and list of users
	List<String> questions;
	List<String> users;

	public static void main(String args[]) throws IOException,FileNotFoundException{  
		
		//creating an object of Class Questions via File handling class
		Questions questions = new FileHandling().inputHandler();			
		questions.setSingleSelectOptions(questions);
		
		Scanner sc= null;
			if(questions!=null){
				try{
				sc = new Scanner(System.in);
				System.out.println("Enter the number of users");	
				//number of users input 
				int totalUsersInSurvey=sc.nextInt();
				
				//defining an array of references of class UserHandling of size equals to total no. of users
				UserHandling[] usersArray=new UserHandling[totalUsersInSurvey];
				
				//initializing each user
				for(int index=0;index<totalUsersInSurvey;index++){
					usersArray[index]=new UserHandling();
				}
				Display display=new Display(questions);
				for(int index=0;index<totalUsersInSurvey;index++){
					usersArray[index]=display.generateUI(usersArray[index]);
				}
				for(int index=0;index<totalUsersInSurvey;index++){
					System.out.println("user "+(index+1)+" entered:"+usersArray[index].responses.get(0).toString()+" "+usersArray[index].responses.get(1).toString()+" "+usersArray[index].responses.get(2).toString());
				}
				new FileHandling().handleResponses(usersArray);
				display.generateResult(usersArray, questions.indicesOfSingleSelectQuestion, questions);
				
				} finally{
					sc.close();
			}	
		}
	}
}
