fun main() {
    val person= Personx(name = "shayan")
    val personx= Personx(name = "shayan", age = 23)
    val person3=Personx(name= "shayan", age = 23, true)
}
class Personx( val name:String,
//               val age:Int=0,
//               val isMale:Boolean=false
){
    /**
     * when ever we create obj we call this constractor
     */
    init {
        println("Hey $name im currently initaionling")
    }

    /**
     *   we can acess name prob just be using val/var in func body
     */

//    fun printName(){
//        println("my name is $name")
//    }

    /**multiple init is allowd
     * order is top to the bottom
     */

    init {
        println("Execulting ater first init block")
    }

    /**
     * prefare just single constractors
     */


    /**secondery constractor
     *
     */
    constructor(name:String,age:Int):this(name=name ){
        println("secendroy const nummber 2")

    }
    //third one
    constructor(name:String,age:Int,isMale:Boolean):this(name=name ){
        println("secendroy const nummber 2")

    }
}