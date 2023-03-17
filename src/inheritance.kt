fun main() {
    val dog = Dogx("Rex")
    val lion = Lion(lionName = "Max")
    println(dog.printEnergy())
    dog.eat()
    println(dog.printEnergy())
    lion.updateColor("red")
    dog.updateColor("white")


}

/**
 * use open to make it inheritable
 * each class has ANY parent
 */
open class Parent {

}

//by default is final and is not inheritable
final class finaling() {

}

class child : Parent() {}

open class Animalx(val name: String) {
    protected var energy = 0

    //use open for fun to able it for override
    /**
     *     //use open for fun to able it for override
     */

    protected var visibaleInThisClassAndSubs = 10

    //how to hide it from subclasses

    private var justVisibaleInThisClass = 19
    var color="black"

    init {
        println("Animal class initationling")

    }
    open fun eat() {
        energy++
    }

    open fun run() {
        energy--
    }
    fun printEnergy(){
        println("Current $name has energy of : $energy")
    }

}

class Dogx(dogName: String) : Animalx(name = dogName) {
    init {
        println("Dog class initaitonling")
    }
    override fun eat() {
        energy += 5
    }

    override fun run() {
        energy -= 5
    }
}

open class CatX(catName: String) : Animalx(name = catName) {
    init {
        println("cat class initaitonling")
    }
    open var claws= "sharp"
    override fun eat() {
        energy += 5
    }

    override fun run() {
        energy -= 5
    }
}
class Lion(lionName: String) : CatX( catName = lionName) {
    init {
        println("lion class inatiaoning")
    }

    override var claws: String
        get() = super.claws
        set(value) {}

    override fun eat() {
        energy += 10
    }


    override fun run() {
        energy -= 10
    }

    /**extenstaionFuncations
     *protected and private properties are not avaiable in extens funs
     */

}
fun Animalx.updateColor(color:String){
    this.color=color
}
