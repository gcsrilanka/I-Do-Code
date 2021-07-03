var cat = ["Whiskers", "StinkPuss", "Patch", "Sharon"];

var i = 0;
var len = cat.length;
var message = "";

for (; i < len; ) {
    message += cat[i] + "<br> ";
    i++;
}
document.getElementById("cats").innerHTML = message;

