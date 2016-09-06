function fetchChoices(){
	var technologiesArray=document.getElementsByName("technology");
	var sportsArray=document.getElementsByName("game");
	var choicesSelected = "";
    var counter=0;
	while(counter<technologiesArray.length){
        if(technologiesArray[counter].checked){
            choicesSelected = "Selected Technology : &nbsp;&nbsp;" + technologiesArray[counter].value + "<br />";
        }
        counter++;
    }
    counter=0;
    while(counter< sportsArray.length){
        if(sportsArray[counter].checked){
            choicesSelected += "Selected Sport : &nbsp;&nbsp;" + sportsArray[counter].value + "<br />";
        }
        counter++;
    }
	document.getElementById("displayOutput").innerHTML = choicesSelected;
}