function validation(totalRows){
	if(isNaN(totalRows)||totalRows<=0){
		alert("Enter natural Numbers Only");
		return false;
	}else{
		return true;
	}
}

function printForPyramid(){
	totalRows=parseInt(document.getElementById('number').value.trim());
    if(validation(totalRows)){
		document.write("Using For Loop: <br><br>");
        for(var row=1;row<=totalRows;row++){
            for(var spaces=1; spaces<=totalRows-row;spaces++){
				document.write("&nbsp;&nbsp;");	
            }
            for(var star=1; star<=2*row-1; star++){
                document.write("*");
            }
            document.write("<br>");
        }
    }
}
		
function printWhilePyramid(){
	totalRows=parseInt(document.getElementById('number').value.trim());
	if(validation(totalRows)){
		document.write("Using For Loop: <br><br>");
		var row=1;
		while(row<=totalRows){
			var spaces=1;
			while(spaces<=totalRows-row){
				document.write("&nbsp;&nbsp;");
				spaces++;
			}
			var star=1;
			while(star<=2*row-1){
				document.write("*");
				star++;
			}
			document.write("<br>");
			row++;
		}
	}
}
		
function printDoWhilePyramid(){
    totalRows=parseInt(document.getElementById('number').value.trim());   
    if(validation(totalRows)){
        document.write("Using do-while Loop: <br><br>");
        var row=1;
        do{
            var spaces=0;
            do{
                document.write("&nbsp;&nbsp;");
				spaces++;
            }while(spaces<=totalRows-row);	
            var star=1;
            do{
                document.write("*");
				star++;
            }while(star<=2*row-1);
            document.write("<br>");
            row++;
        }while(row<=totalRows);
    }
}