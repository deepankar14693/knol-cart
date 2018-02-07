package knolcart.api

import knolcart.accounts.Accounts
import knolcart.checkout.{Products,Checkout}
import knolcart.inventory.{Items, User}

class Test{
 val phone1 = 9773757689L
 val user1 = "deepankar"
 val phone2 = 7838011709L
 val user2 = "abhi"
 val initmap = Map(phone1 -> user1,phone2 -> user2)
 val AccountServices = new Accounts
 val shoe1 = Items("SHOES", "sneaker shoes", "style sales", 1750, "designed especially for you")
 val bag1 = Items("BAGS", "office bags", "bajaj sales", 8500, "coolest and handy bags for school,college and office going guys")
 val trouser1 = Items("TROUSERS", "jeans", "style sales", 750, "designed especially for you")
 val shirt1 = Items("SHIRTS", "denim shirts", "bajaj sales", 1850, "coolest and handy bags for school,college and office going guys")
 val shoe2 = Items("SHOES", "formal shoes", "style sales", 1250, "designed especially for you")
 val bag2 = Items("BAGS", "school bags", "bajaj sales", 850, "coolest and handy bags for school,college and office going guys")
 val trouser2 = Items("TROUSERS", "formal pants", "style sales", 1350, "designed especially for you")
 val shirt2 = Items("SHIRTS", "check shirts", "bajaj sales", 1050, "coolest and handy bags for school,college and office going guys")
 //val itemMap = Map(1 -> shoe1, 2 -> bag1)
 val productMap = Map(1 -> shoe1, 2 -> bag1, 3 -> trouser1, 4 -> shirt1, 5 -> shoe2, 6 -> bag2, 7 -> trouser2, 8 -> shirt2)
 val InventoryMaintenance = new User

 val shoe3 = Products("SHOES", "sneaker shoes", "style sales", 1750, "designed especially for you")
 val bag3 = Products("BAGS", "office bags", "bajaj sales", 8500, "coolest and handy bags for school,college and office going guys")
 val trouser3 = Products("TROUSERS", "jeans", "style sales", 750, "designed especially for you")
 val shirt3 = Products("SHIRTS", "denim shirts", "bajaj sales", 1850, "coolest and handy bags for school,college and office going guys")
 val shoe4 = Products("SHOES", "formal shoes", "style sales", 1250, "designed especially for you")
 val bag4 = Products("BAGS", "school bags", "bajaj sales", 850, "coolest and handy bags for school,college and office going guys")
 val trouser4 = Products("TROUSERS", "formal pants", "style sales", 1350, "designed especially for you")
 val shirt4 = Products("SHIRTS", "check shirts", "bajaj sales", 1050, "coolest and handy bags for school,college and office going guys")
 val checkMap = Map(1 -> shoe3, 2 -> bag3, 3 -> trouser3, 4 -> shirt3, 5 -> shoe4, 6 -> bag4, 7 -> trouser4, 8 -> shirt4)
 val CheckoutItems = new Checkout
}