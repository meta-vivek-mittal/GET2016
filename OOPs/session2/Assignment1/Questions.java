package session2.assignment1;

import java.util.ArrayList;
import java.util.List;

public class Questions {

	List<String> question;
	List<String> questionNumber;
	List<String> questionType;
	List<String> optionsAvailable;
	int totalSingleSelectOptions;
	int[] indicesOfSingleSelectQuestion;

	SingleSelect singleSelect;
	
	/**
	 * Initializing the member variables of the class
	 */
	public Questions(){
		question = new ArrayList<String>();
		questionType = new ArrayList<String>();
		optionsAvailable = new ArrayList<String>();
		questionNumber = new ArrayList<String>();
	}
	
	public List<String> getQuestion(){
		return question;
	}
	
	public void setQuestion(List<String> question){
		 this.question = question;
	}
	
	public List<String> getQuestionType(){
		return questionType;
	}
	
	public void setQuestionTpye(List<String> questionType){
		this.questionType = questionType;
	}
	
	public List<String> getQuestionNumber(){
		return questionNumber;
	}
	
	public void setQuestionNumber(List<String> questionNumber){
		 this.questionNumber = questionNumber;
	}
	public List<String> getOptionsAvailable(){
		return optionsAvailable;
	}
	
	public void setOptionsAvailable(List<String> optionsAvailable){
		 this.optionsAvailable = optionsAvailable;
	}
	
	public int getSingleSelectOptions(){
		return totalSingleSelectOptions;
	}
	
	/**
	 * This function checks for Single Select and then check for options
	 */
	public void setSingleSelectOptions(Questions question){
		int count = 0;
		int size = question.questionType.size();
		for (int index = 0; index < size; index++){
			if (question.questionType.get(index).toString().equalsIgnoreCase("Single Select")) {
				this.singleSelect=new SingleSelect();
				singleSelect.setOptionsForSingleSelect(question.optionsAvailable.get(index));
				count++;
			}
		}
		this.indicesOfSingleSelectQuestion=new int[count];
		int indexForSingle=0;
		for (int index = 0; index < size; index++) {
			if (question.questionType.get(index).toString().equalsIgnoreCase("Single Select")) {
				indicesOfSingleSelectQuestion[indexForSingle++]=index;
			}
		}
		this.totalSingleSelectOptions = count;
	}
}
