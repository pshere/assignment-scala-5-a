trait Function3{
def higherOrderFunction(f: Int=> Int, num:Int):Int
}

object hof{
  def functionToBePerformed(num: Int):Int=num+3
  val hf:Function3=new Function3 {
    override def higherOrderFunction(f: Int => Int, num: Int): Int = {
     f(num)

    }
  }


}
object main{
  def main(args:Array[String]): Unit = {
println(hof.functionToBePerformed(9))
    println(hof.hf.higherOrderFunction(hof.functionToBePerformed,1))
  }
}