import knolcart.inventory.{InventoryMaintenance, Items, User}
import org.scalatest.FunSuite

class InventoryTestCases extends FunSuite {

 val invent = new User
 test("user view items should give") {
  assert(invent.viewItems(Map(1 -> Items("SHOES", "sneaker shoes", "style sales", 1750, "designed especially for you"),2 -> Items("TROUSERS", "jeans", "style sales", 750, "designed especially for you")))== Map(1 -> Items("SHOES", "sneaker shoes", "style sales", 1750, "designed especially for you"),2 -> Items("TROUSERS", "jeans", "style sales", 750, "designed especially for you")))
 }
 test("ascending order of price should give") {
  assert(invent.priceLowToHigh(Map(1 -> Items("SHOES", "sneaker shoes", "style sales", 1750, "designed especially for you"),2 -> Items("TROUSERS", "jeans", "style sales", 750, "designed especially for you")))== Map(1 -> Items("SHOES", "sneaker shoes", "style sales", 1750, "designed especially for you"),2 -> Items("TROUSERS", "jeans", "style sales", 750, "designed especially for you")))
 }
 test("descending order of price should give") {
  assert(invent.priceHighToLow(Map(1 -> Items("SHOES", "sneaker shoes", "style sales", 1750, "designed especially for you"),2 -> Items("TROUSERS", "jeans", "style sales", 750, "designed especially for you")))== Map(1 -> Items("SHOES", "sneaker shoes", "style sales", 1750, "designed especially for you"),2 -> Items("TROUSERS", "jeans", "style sales", 750, "designed especially for you")))
 }
}
