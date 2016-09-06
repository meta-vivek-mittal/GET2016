function largestNumber(firstNumber,secondNumber,thirdNumber){
	var maxNumber;
	var maxNumber = firstNumber;
	if(maxNumber < secondNumber){
		maxNumber = secondNumber;
	}
	if(maxNumber < thirdNumber){
		maxNumber = thirdNumber;
	}
	document.write("<h3> Largest Number is </h3>"+maxNumber);
}