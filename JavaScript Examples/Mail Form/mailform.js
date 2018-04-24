$(".form").on('click', function(){
  $(this).addClass('active');
});

$(".submit").on('click', function() {
  $(this).parent().parent().hide(300);
  $(".ok_message").addClass("active");
  var inputname=document.getElementById("name").value;
  var inputname=document.getElementById("email").value;
  var inputname=document.getElementById("message").value;
  var inputname=document.getElementById("emoji").value;
  console.log("name retrieved="+name);
  window.open('http://mark-merry.com/CSIS315/store.php?email=m@l.edu&message=Hi%20&name='+ name +'&emoji=:)');
});

$(".ok_message").on('click', function() {
  $(this).removeClass("active");
  $(".form").removeClass("active").show();
  
});