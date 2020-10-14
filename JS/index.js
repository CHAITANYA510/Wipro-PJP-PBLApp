
function checkDate() {

    var EnteredDate = document.getElementByName("date");
    var date = EnteredDate.substring(0, 2);
    var month = EnteredDate.substring(3, 5);
    var year = EnteredDate.substring(6, 10);

    var myDate = new Date(year, month - 1, date);
    var today = new Date();
    
    document.write("Entered date "+myDate); 
    document.write("Today's date "+today); 

    if (myDate >= today) {
        return true;
    }
    else {
        alert("Entered date is less than today's date ");
        return false;
    }
}

function validatePassword(){
    var pwd = document.getElementsById("newpwd").value;
    var cnfpwd = document.getElementsById("cnfpwd").value;
    //console.out(pwd+"::"+cnfpwd);

    document.getElementById("demo").innerHTML = "Testing";

    if(pwd==cnfpwd){
        console.log('Success');
        return true;
    }
    else{
        console.log('Failure');
        alert("Password does not match");
        return false;
    }
}


/*
function validatePassword(s1,s2){
    var pwd = s1;
    var cnfpwd = s2;
    //console.out(pwd+"::"+cnfpwd);
    if(pwd==cnfpwd){
        return true;
    }
    else{
        return false;
    }
}


if(validatePassword('admin','admin')){
    console.log('Success');
}
else{
    console.log('failure');
}

if(validatePassword('admin','Admin')){
    console.log('Success');
}
else{
    console.log('failure');
}
*/