object P03 extends App{
  val list = List(1, 2, 3, 4, 5, 6, 7, 8 ,9, 10)

  def findKth[A](k:Int, l:List[A]):A = {
    try l(k)
    catch {
      case e:IndexOutOfBoundsException => throw new NoSuchElementException
    }
  }
  println(findKth(0, list))
  println(findKth(1, list))
  println(findKth(2, list))

}
