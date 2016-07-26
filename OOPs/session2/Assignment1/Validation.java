package session2.assignment1;


public class Validation {
	
	/**
	 * 
	 * @param input(String) the String entered by the user.
	 * @param options(String) denotes the string of options
	 * @return the status whether input is valid or not
	 */
protected boolean isInputValid(String input,String options)
{
	if(options=="")
	{
		return true;
	}
	input=input.toLowerCase();
	options=options.toLowerCase();
	boolean status=true;
	CharSequence charSequence=input;
	if(!options.contains(charSequence))
	{
		status=false;
	}
	return status;
	
}
}