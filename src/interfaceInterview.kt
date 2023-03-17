fun main() {
val dog = Dog()
    val cat= Cat("Brown")
    val male = Male()
    male.eyeColor()
    val male2= Person{"Yellow"}

}

class Dog : Animal {
    override val legs = 4

    override fun speak() = "HOOP HOOP"
    override val coloring: String = "Black"

}

//muss declare all members of interface
//can be in constructor
class Cat(override val coloring: String) : Animal {

    //override: az ghasd esm yekiye mikhaym override konim
    override val legs = 4
    override fun speak() = " MEEOOW!"

    override fun walk(): Int {

        return 0
    }
}

interface Animal {
    val legs: Int
    fun speak(): String
//we are not allowed to initional property inside interface but we can spesify impleimentaion for it acessors

    /**
     * not allowed
     */
   // val color:String = "black"
    /**
     * allwoed
     */
// its not abstract anymore
    val color : String get() = "black"

    //abstract and should be override
    val coloring:String

    //we can write body
    fun walk(): Int {
        var steps = 0
        for (step in 0..20 step 2) {
            steps += step
        }
        return steps

    }


}

/**
 * interface with only one abstract method is functional interface

 */
fun interface Person{
    fun eyeColor():String

    /**
     * just one is possible
     */
    //fun hairColor():String

    //its not abstract so its ok
    fun hairColor():String = "brow"
}
class Male:Person{
    override fun eyeColor()= "Black"
}

