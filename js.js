
//console.log("request.response[0]");

let JSONArray = [];

function getData(){
    var requestURL = 'http://127.0.0.1:8080/api/film';
    var request = new XMLHttpRequest();
    request.open('GET', requestURL);
    request.setRequestHeader('Content-Type', 'application/json');
    request.setRequestHeader('Access-Control-Allow-Origin', '*');
    request.responseType = 'json'
    request.send();
   
    request.onload = function() {
       
        JSONArray = request.response;

    }
}
function searchFilms(film){

    document.getElementById('textArea').innerHTML = "";
    if(film.value == ''){
        return;
    }
    for(i=0; i < JSONArray.length; i++){
        
        if(JSONArray[i].title.includes(film.value.toUpperCase())){

            document.getElementById('textArea').innerHTML += JSONArray[i].title + " <br>" + JSONArray[i].description  +" <br>";

        }
    }
}
