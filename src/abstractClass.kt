/**
 * interface vs abstract class
 *1. interface can not hold the state but abstract class can.
 */
fun main() {


}

/**
 * 1.can not be initialiozed
 * 2.are always open
 * fun with no impelitaion -> class must be abstract then
 */
abstract class AnimalZ(){
    //no impelitaion -> class must be abstract then
    abstract val name:String

    protected var energy=0
    //not abstract methods are available
  open  fun speak()="Wooof!"
    //return will be Unit be default
    open fun eat(){
        energy++
    }

}
class Dogz:AnimalZ(){
    override val name="jacki"
    override fun speak()="Wof wof"
    override fun eat() {
        TODO("Not yet implemented")
    }
    abstract class PersonA(private var name:String){
        open fun printName(){
            println(name)
        }
    }

    /**in interface each property is abstract
     * but can have fun with body
     * not allowed to set valued
     */
    interface PersonB{
     //   abstract val name:String
        //cannot do that
        //val age = 12

        fun printName(name:String){
            println(name)
        }
    }

    class Malex:PersonA(name = "shayan"),PersonB{


        override fun printName() {
            super<PersonA>.printName()
        }

        override fun printName(name: String) {
            super<PersonB>.printName(name)
        }
    }

}