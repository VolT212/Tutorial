function oceny(){
    a = prompt("Podaj ocenę:");
    if (a ==1){
        console.log("Niedostateczny")
    }
    else if (a ==2){
        console.log("Dopuszczający")
    }
    else if (a ==3){
        console.log("Dostateczny")
    }
    else if (a ==4){
        console.log("Dobry")
    }
    else if (a ==5){
        console.log("Bardzo dobry")
    }
    else if (a ==6){
        console.log("Celujący")
    }
    else{
        console.log("Nie podałeś oceny");
    }

}



function potegowanie(){
    a = prompt("Podaj liczbę jaką chcesz podnieść do 10 potęgi:");
    console.log(a**10);

}


function sprawdzenie(){
    a = prompt("Podaj liczbę.");
    if (a%2 ===0){
        console.log("Parzysta");
    }
    else if (a%2 === 1){
        console.log("Nieparzysta");
    }
    else{
        console.log("Nie podałeś liczby");
    }
}


function haslo(){
    a = prompt("Podaj hasło");
    if (a.length >= 12 && a.length <= 16 && a.match(/[a-z]/) && a.match(/[A-Z]/) && a.match(/[0-9]/) && a.match(/[@]/) ||a.match(/[#]/) ||a.match(/[$]/)){
        return true;
    }
    else{
        return false;
    }
}


haslo()



