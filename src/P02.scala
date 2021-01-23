object P02 extends App{
  val list = List(1, 2, 3, 4, 5, 6, 7, 8 ,9, 10)

//  init() which returns all elements except the last
  def penultimate[A](l:List[A]):A = {
    if (l.isEmpty) throw new NoSuchElementException
    l.init.last
  }

  def lastNth[A](n: Int, l: List[A]): A = {
    if (n <= 0) throw new IllegalArgumentException
    if (n > l.length) throw new NoSuchElementException
    l.takeRight(n).head
  }

  println(penultimate(list))
  println(lastNth(2, list))

}
