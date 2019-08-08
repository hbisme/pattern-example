package decorator

object Example1 extends App {

  trait Person {
    def cost(): Double

    def show(): Unit
  }


  class Consumer extends Person {
    override def cost(): Double = 0.0

    override def show(): Unit = println("什么衣服都没穿的老王.")

    def pay: Unit = println(s"总共消费: $cost")
  }

  trait Hat extends Consumer {

    val price1 = 50.0

    override def cost(): Double = super.cost() + price1

    override def show(): Unit = {
      super.show()
      println(s"帽子价格为: $price1, 穿上帽子后花费: ${super.cost() + price1}")

      println(s"穿上了帽子")
    }
  }

  trait Jacket extends Consumer {
    val price2 = 100.0

    override def cost(): Double = super.cost() + price2

    override def show(): Unit = {
      super.show()
      println(s"夹克价格为: $price2, 穿上夹克后花费: ${super.cost() + price2}")

      println(s"穿上了夹克")
    }

  }


  // 先进入Jacket,再进入Hat
  val laowang = new Consumer with Hat with Jacket
  laowang.show()
  laowang.pay
  println(laowang.cost())


}
