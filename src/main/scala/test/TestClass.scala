package test

class TestClass {

  val id = 1

  def fun= println("===> "+id)

}

object TestClass{

  def main(args: Array[String]): Unit = {

    val pt = new TestClass
    println("hello world1" +  pt.fun)
  }
}
