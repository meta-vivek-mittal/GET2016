var result = document.getElementById("result");

do{
	input = prompt("Please Enter a valid number");
}while(isNaN(input) || input === "" );

if(input === null){
	result.innerHTML = "Operation Cancelled";	
}else{	
	input = parseInt(input) + 10;
	result.innerHTML = input;
}