import knolcart.checkout.{Checkout, Products}
import org.scalatest.FunSuite

class CheckoutTestCases extends FunSuite{

 val check = new Checkout
 test("checkout view should give") {
  assert(check.viewItems(Map(1 -> Products("SHOES", "sneaker shoes", "style sales", 1750, "designed especially for you"),2 -> Products("TROUSERS", "jeans", "style sales", 750, "designed especially for you")))== Map(1 -> Products("SHOES", "sneaker shoes", "style sales", 1750, "designed especially for you"),2 -> Products("TROUSERS", "jeans", "style sales", 750, "designed especially for you")))
 }
}
