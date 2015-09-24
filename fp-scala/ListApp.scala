// by aroc725 in https://forums.manning.com/posts/list/31212.page

import fpinscala.datastructures.Cons
import fpinscala.datastructures.List
import fpinscala.datastructures.Nil

object ListApp extends App {
    val example = Cons(1, Cons(2, Cons(3, Nil)))
    val example2 = List(1,2,3)
    val total = List.sum(example)
    println("Total = " + total)
    val example3 = List(1.0, 2.0, 3.0)
    val product = List.product(example3)
    println("Product = " + product)
    
    val x = List(1,2,3,4,5) match {
      case Cons(x, Cons(2, Cons(4, _))) => x
      case Nil => 42
      case Cons(x, Cons(y, Cons(3, Cons(4, _)))) => x + y
      case Cons(h, t) => h + List.sum(t)
      case _ => 101
    }
    println("x = " + x)

}
