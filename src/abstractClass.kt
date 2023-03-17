/**
 * interface vs abstract class
 *
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
    //not abstract methods are available
    fun speak()="Wooof!"
}
class Dogz:AnimalZ(){
    override val name="jacki"

}