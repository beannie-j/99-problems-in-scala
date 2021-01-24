object P04 extends App{
  val list = List(1, 2, 3, 4, 5, 6, 7, 8 ,9, 10)

  def lengthRecursive[A](l:List[A]):Int = l match {
    case Nil => 0
    case h::tail => 1 + lengthRecursive(tail)
  }

  print(lengthRecursive(list))
}
