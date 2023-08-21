
let checkID = function() {
    const check = document.getElementById("sign_form");

    return check.name.value.length < 20 && check.pw.value.length <= 4;
};

function sign_test(){
    let res = checkID();
    let OK = true;

    if(res === OK){
        alert("SUCCESS!!!");
        $('#sign_form').attr("action", "sign");
        $('#sign_form').submit();
    }
    else {
        alert("[FAIL] Please Check Name or PW");
    }

}

