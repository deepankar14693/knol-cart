import knolcart.api.Test
import org.apache.log4j.Logger.getLogger

import scala.io.StdIn._

object ImplementCart extends App {
 val log = getLogger(this.getClass)
 val account = new Test

 def userMenu {
  log.debug("press 1 to sign up\n")
  //log.debug("press 2 to fetch token\n")
  log.debug("press 2 to sign in\n")

  val input = readInt()
  input match {
   case 1 => {
    account.AccountServices.registerUser(account.initmap)
    userMenu
   }
   case 2 => {
    account.AccountServices.signIn(account.initmap) match {
     case true => {
      log.debug("press 1 to go to items and 2 to your cart")
      val input = readInt()
      input match {
       case 1 => account.InventoryMaintenance.menu(account.productMap)
       case 2 => account.CheckoutItems.menu(account.checkMap)
      }
     }
     case false => {
      log.debug("invalid token")
      userMenu
     }
    }
   }
  }
 }

 userMenu
}
