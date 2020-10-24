

function displayDate(){
    timer();
    let today = new Date();
    
    let d = today.getDate();
    let m = today.getMonth() + 1;
    let y = today.getFullYear();

    d = padding(d);
    m = padding(m);
    y = padding(y);

    document.getElementById('date').innerHTML = d + '/' + m + '/' + y;
}

function padding(i) {
    if (i < 10) {i = "0" + i};  // add zero in front of numbers < 10
    return i;
}

function displayTime(){
    
    displayDate();
    let today = new Date();
    
    let h = today.getHours();
    let m = today.getMinutes();
    //let s = today.getSeconds();

    m = padding(m);
    //s = padding(s);

    document.getElementById('time').innerHTML = h + ':' + m;// + ':' + s;
    setTimeout(displayTime, 1000*60);
}

function validatePWD(pwd){
    
    if(pwd.length==0){
        alert("Password cannot be empty");
    }
    let regexp = /^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{6,20}$/;
    if(pwd.match(regexp)){
        return true;
    }
    else{
        alert("Enter paassword in specified format");
        return false;
    }
}

function validateNumber(num){
    
    if(num.length==0){
        alert("Number cannot be empty");
    }

    var regexp = /^\(?([0-9]{3})\)?[-. ]?([0-9]{3})[-. ]?([0-9]{4})$/;
    if(num.match(regexp)){
        return true;
    }
    else{
        alert("Enter number in specified format");
        return false;
    }
}

function formValidation(){

    var pwd = document.getElementById("upwd").value;
    var cpwd = document.getElementById("upwdc").value;

    if(!(validatePWD(pwd) && validatePWD(cpwd) && (pwd==cpwd))){
        return false;
    }
    
    var num = document.getElementById("phoneNumber").value;
    if(!validateNumber(num)){
        return false;
    }

   return true;
}

function timer() {
    setInterval(function(){ alert("3 minutes passed"); }, 60*3000);
  }

