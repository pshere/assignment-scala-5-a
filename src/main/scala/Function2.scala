

trait Function2[list]{
  def sumOfList(list: List[Int]):Int
}
object summation {
  val xs: Function2[List[Int]] = new Function2[List[Int]] {
    def sumOfList(list: List[Int]): Int = {
      list.sum
    }
  }
}

object main{
  def main(args: Array[String]): Unit = {
    println(summation.xs.sumOfList(List(9,9)))
    println(summation.xs.sumOfList(List(10,9)))
  }
}