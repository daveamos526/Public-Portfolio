var j=0;
var k=0;
var m=0;
var sum=0;
var array;

function getValues()
{
  j= ~~document.getElementById("j_parameter").value;
  k= ~~document.getElementById("k_parameter").value;
  m= ~~document.getElementById("m_parameter").value;

  sequence_start();
  fibonacci(m);
}

function sequence_start()
{
  array=[j];
  for(i=0;i<j; i++)
    {
      array[i]=k;
      if(i==0)
        {
          document.getElementById("resultsBox").value = array[i];
        }
      else
        {
          document.getElementById("resultsBox").value += ", " + array[i];
        }
    }
}

function fibonacci(num)
{
  var a = 0;
  
  num-=2;
  
  while (num > 0)
    {
      a=0;
      for(i=0; i<array.length; i++)
        {
          a += array[i];
        }
      document.getElementById("resultsBox").value += ", " + a;
      
      for(index=0; index<array.length-1; index++)
        {
          array[index] = array[index+1];
        }
      array[j-1] = a;
      
      num--;
    }
}
