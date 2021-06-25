$(function() {

  $('.selectpicker').on('change', function(){
    var selected = $(this).find("option:selected").val();
    alert(selected);
  });
  
});