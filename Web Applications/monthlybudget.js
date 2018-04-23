function total() 
{
  var num1 = document.budgetForm.rent.value;
  var num2 = document.budgetForm.car.value;
  var num3 = document.budgetForm.phone.value;
  var num4 = document.budgetForm.grocery.value;
  var num5 = document.budgetForm.gas.value;
  var num6 = document.budgetForm.other.value;
    

  if (isNaN(num1) || isNaN(num2) || isNaN(num3) || isNaN(num4) || isNaN(num5) || isNaN(num6)) 
    {
      alert('Enter numbers only!');
      total = "$0.00";
    } 
    
    else if (num1 < 1 && num2 < 1 && num3 < 1 && num4 < 1 && num5 < 1 && num6 < 1) 
      {
        total = "$0.00";
      } 
    
    else 
      {
        var total = parseInt(num1) + parseInt(num2) + parseInt(num3) + parseInt(num4) + parseInt(num5) + parseInt(num6);
        document.getElementById("answer1").value = '$' + total / 4;
        document.getElementById("answer2").value = '$' + total + '.00';
      }
}