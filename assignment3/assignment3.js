function fetchChoices(){
    var foodArray=document.getElementsByName("Food");
    var choicesSelected = "";
    if(foodArray[0].checked){
        var itemSelected = document.getElementById('veg-food');
        choicesSelected += itemSelected.options[itemSelected.selectedIndex].value+" of "+foodArray[0].value+" has been selected";
    }else{
        var itemSelected = document.getElementById('non-veg food');
        choicesSelected +=itemSelected.options[itemSelected.selectedIndex].value+" of "+foodArray[1].value+" has been selected";
    }
    alert(choicesSelected);
}