function validation(n){
    if(isNaN(n)){
        alert("Enter only valid number: ")
        return false;
    }else{
        return true;
    }
}

function printTable(){
    n = parseInt(document.getElementById('number').value.trim());
    if(validation(n)){
        for(var counter=1;counter<=10;counter++){
            document.write(n+" x "+counter+" = "+(n*counter)+"<br>");
        }	
    }
}