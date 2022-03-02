var userId = 1;
var contentType = {pageHeder:1, paragraph:2};

$(document).ready(function(){
    $('#l1, #l2, #l3').click(function(event){
        $('#l1, #l2, #l3.active').removeClass('active');
        $(this).addClass('active');
        event.preventDefault();
    });
});

$(document).ready(function () {
    $('#t1, #t2, #t3').click(function (event) {
        $('#t1, #t2, #t3.active').removeClass('active');
        $(this).addClass('active');
        event.preventDefault();
    });
});

$(document).ready(function() {
    var input = {userId: userId, contentType: contentType.pageHeder, index: 1};
    $.ajax({
        url: "http://localhost:8080/info/getContent",
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(input),
        success: function(data, status) {
            $("#Header1").text(data);
        }
    });

    var input = {userId: userId, contentType: contentType.paragraph, index: 1};
    $.ajax({
        url: "http://localhost:8080/info/getContent",
        type: "POST",
        contentType: "application/json",
        data: JSON.stringify(input),
        success: function(data, status) {
            $("#Paragraph1").text(data);
        }
    });
});

