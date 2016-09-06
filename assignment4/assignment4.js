function validation(a,b,c,d){
    if(isNaN(a)){
        alert("Invalid first Input");
        return false;
    }else if(isNaN(b)){
        alert("Invalid second Input");
        return false;
    }else if(isNaN(c)){
        alert("Invalid third Input");
        return false;
    }else if(isNaN(d)){
        alert("Invalid fourth Input");
        return false;
    }else{
        return true;
    }
}

function printChart(){
    var array = [parseInt(document.getElementById('number1').value.trim()),parseInt(document.getElementById('number2').value.trim()),parseInt(document.getElementById('number3').value.trim()),parseInt(document.getElementById('number4').value.trim())];
    if(validation(array[0],array[1],array[2],array[3])){
        var max;
        while(array[0]!=0){
            max = findMax(array);
            counter=0;
            while(counter<4){
                if(array[counter] === max){
                    document.write("*");
                    array[counter]--;
                }else{
                    document.write("&nbsp;&nbsp;");   
                }
                counter++;
            }
            document.write("<br>");
        }
    }
}

function findMax(array){
    var max=array[0];
    var count=1;
    while(count<=3){
        if(max<array[count]){
            max=array[count];
        }
        count++;
    }
    return max;
}