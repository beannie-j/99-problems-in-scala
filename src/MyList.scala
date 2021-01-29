abstract class MyList[+A] {
  def head: A
  def tail: MyList[A]
  def isEmpty: Boolean
  def add[B >: A](element: B): MyList[B]
  def printElements: String
  override def toString: String = s"[$printElements]"
}

object Empty extends MyList[Nothing] {
  def head: Nothing = throw new NoSuchElementException
  def tail: MyList[Nothing] = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add[B >: Nothing](element: B): MyList[B] = new Cons(element, Empty)
  def printElements: String = ""
}

class Cons[+A](h: A, t: MyList[A]) extends MyList[A] {
  def head: A = h
  def tail: MyList[A] = t
  def isEmpty: Boolean = false
//  def add(element: Int): MyList = new Cons(element, this)
  def add[B >: A](element: B): MyList[B] = new Cons(element, this)

//  recursive
  def printElements: String =
    if (t.isEmpty) s"$h"
    else s"$h ${t.printElements}"

}

object ListTest extends App {
  val listOfIntegers: MyList[Int] = Empty
  val listofStrings: MyList[String] = Empty
}