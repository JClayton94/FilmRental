
//console.log("request.response[0]");

function getHTTP(){
    var requestURL = 'http://127.0.0.1:8080/api/film';
    var request = new XMLHttpRequest();
    request.open('GET', requestURL);
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Access-Control-Allow-Origin', '*');
    request.responseType = 'json'
    request.send();
   
    request.onload = function() {
        for(i=0; i < request.response.length; i++){
        document.getElementById('textArea').innerHTML += request.response[i].title + " <br>";
        }
    }
}
function searchFilms(film){
    var requestURL = 'http://127.0.0.1:8080/api/film';
    var request = new XMLHttpRequest();
    request.open('GET', requestURL);
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Access-Control-Allow-Origin', '*');
    request.responseType = 'json'
    request.send();
    request.onload = function() {
        document.getElementById('textArea').innerHTML = "";
        for(i=0; i < request.response.length; i++){
            if(request.response[i].title.includes(film.value.toUpperCase())){

                document.getElementById('textArea').innerHTML += request.response[i].title + " <br>" + request.response[i].description  +" <br>";

            }

        }
        //document.getElementById('textArea').innerHTML = "Not found!";
    }
}