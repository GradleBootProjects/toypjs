function sign_test(){
    $(document).ready(function(){
        $(".sign_btn").click(function(){
            alert("Btn is OK");
            // var id = document.getElementById("id");
            // var pw = document.getElementById("pw");
            $('#sign_form').attr("action", "sign");
            $('#join_form').submit();
        });
    });
}