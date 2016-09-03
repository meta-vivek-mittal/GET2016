function getLocation() {
    if (navigator.geolocation) {
        navigator.geolocation.getCurrentPosition(showPosition);
    } else {
		var x = document.getElementById("result");
        x.innerHTML = "Geolocation is not supported by this browser.";
    }
}

function showPosition(position) {
	var x = document.getElementById("result");
    x.innerHTML = "Latitude: " + position.coords.latitude +
    "<br>Longitude: " + position.coords.longitude;
}