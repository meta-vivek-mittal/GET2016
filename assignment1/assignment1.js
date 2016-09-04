var largestNumber = document.getElementById("largestNumber");	
	
do{
	firstNumber = prompt("Please enter valid first number");
}while(isNaN(firstNumber) || firstNumber === "" );

do{
	secondNumber = prompt("Please enter valid second number");
}while(isNaN(secondNumber) || secondNumber === "");

do{ 	
	thirdNumber = prompt("Please enter valid third number");
}while(isNaN(thirdNumber) || thirdNumber === "");

if(firstNumber === null || secondNumber === null || thirdNumber === null){
	largestNumber.innerHTML = "Operation Cancelled";
}else{		
	firstNumber = parseInt(firstNumber);
	secondNumber = parseInt(secondNumber);
	thirdNumber = parseInt(thirdNumber);
	var maxNumber = firstNumber;
	if(maxNumber < secondNumber){
		maxNumber = secondNumber;
	}
	if(maxNumber < thirdNumber){
		maxNumber = thirdNumber;
	}
	largestNumber.innerHTML = maxNumber;
}