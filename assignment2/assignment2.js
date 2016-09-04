var result = document.getElementById("result");

do{
	input = prompt("Please enter a valid character");
}while(input.length > 1 || input === "" ||  input.charCodeAt() < 65 ||  (input.charCodeAt() > 90  && input.charCodeAt() < 97) || input.charCodeAt() > 122);

if(input === null){
	result.innerHTML = "Operation Cancelled";
}else{
	var lowerCaseInput = input.toLowerCase();
	if(lowerCaseInput === 'a' || lowerCaseInput === 'e' || lowerCaseInput === 'i' || lowerCaseInput === 'o' || lowerCaseInput ==='u'){
		result.innerHTML = "The Entered Character: <b>"+input+" </b> is a vowel";
	}else{
		result.innerHTML = "The Entered Character: <b>"+input+" </b> is a consonant";
	}
}