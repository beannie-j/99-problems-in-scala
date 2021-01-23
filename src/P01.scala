object P01 extends App {
  val list = List(1, 2, 3, 4, 5, 6, 7, 8 ,9, 10)

  def lastRecursive[A](ls: List[A]): A = ls match {
    case h :: Nil  => h
    case _ :: tail => lastRecursive(tail)
    case _         => throw new NoSuchElementException
  }
  print(lastRecursive((list)))
}