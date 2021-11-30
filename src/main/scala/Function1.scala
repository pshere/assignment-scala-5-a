
trait Function1 [A,B]{
def add (x:A,y:B):A
}

object addition{
  val addNumbers:Function1[Int,Int]=new Function1[Int,Int] {
    def add(x:  Int, y:  Int): Int = x+y
  }
}

object main{
def main(args:Array[String]): Unit ={
  val value=addition.addNumbers.add(8985,56565)
  println(value)
}
}