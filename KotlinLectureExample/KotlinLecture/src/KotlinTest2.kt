fun main(args :Array<String>){

    for(index in 0 .. 10) {
        //println("Value is " + index)
        //interpolation
        println("Value is $index")
    }

    doSomething()

}


fun doSomething(){
    println("Hello")
}