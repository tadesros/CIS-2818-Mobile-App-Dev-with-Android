//Main can live outside of a class

 fun main(args : Array<String>){

     val firstNum : Int = 10

     val secondNum : Int? = 200 //nullable int
/*
     if(secondNum != null)
     {
         var result = firstNum.times(secondNum)
         println(result)

     }

 */
  //   var result = firstNum.times(secondNum)

  //new Kotlin let function style
     //If safe let result
  secondNum?.let{
      val result = firstNum.times(it)
      println(result)
  }

 }//end main



