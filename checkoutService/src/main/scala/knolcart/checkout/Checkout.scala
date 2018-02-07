package knolcart.checkout

import org.apache.log4j.Logger.getLogger

import scala.io.StdIn.readInt
import org.apache.log4j.Logger.getLogger
import scala.io.StdIn._

trait CheckoutItems {
 def menu(itemsMap: Map[Int, Products]): Map[Int, Products]
 def addItem(itemsMap: Map[Int, Products]): Map[Int, Products]
 def deleteItems(itemsMap: Map[Int, Products]): Map[Int, Products]
 def viewItems(itemsMap: Map[Int, Products]): Map[Int, Products]
}

case class Products(val itemType: String, val itemName: String,
                 val itemVendor: String, val itemPrice: Int,
                 val itemDescription: String)

class Checkout extends CheckoutItems {

 val log = getLogger(this.getClass)

 override def menu(itemsMap: Map[Int, Products]): Map[Int, Products] = {
  log.debug("Choose options :\n 1 for adding new item\n 2 for deleting item\n 3 for viewing items\n")
  val select = readInt()
  select match {
   case 1 => addItem(itemsMap)
   case 2 => deleteItems(itemsMap)
   case 3 => viewItems(itemsMap)
   case _ => itemsMap
  }
 }

 override def addItem(itemsMap: Map[Int, Products]): Map[Int, Products] = {
  for (x <- itemsMap) {
   log.debug(x + "\n")
  }
  log.debug("enter the item type \n")
  val itemType = readLine()
  log.debug("enter the item name \n")
  val itemName = readLine()
  log.debug("enter the item vendor \n")
  val itemVendor = readLine()
  log.debug("enter the item price \n")
  val itemPrice = readInt()
  log.debug("enter the item description \n")
  val itemDesc = readLine()
  val newItem = Products(itemType, itemName, itemVendor, itemPrice, itemDesc)
  val addedItems = Map((itemsMap.size + 1) -> newItem)
  val updatedMap = itemsMap ++ addedItems
  for(x <- updatedMap)
   {
    log.debug(x + "\n")
   }
  log.debug("press 1 to go back to menu and 2 to exit")
  val select = readInt()
  select match {
   case 1 => this.menu(updatedMap)
   case 2 => updatedMap
  }
 }

 override def deleteItems(itemsMap: Map[Int, Products]): Map[Int, Products] = {
  for (x <- itemsMap) {
   log.debug(x + "\n")
  }
  log.debug("enter item key which you want to delete ")
  val itemId = readInt()
  val deletedMap = itemsMap - (itemId)
  for(x <- deletedMap) {
   log.debug(x + "\n")
  }
  log.debug("press 1 to go back to menu and 2 to exit")
  val select = readInt()
  select match {
   case 1 => this.menu(deletedMap)
   case 2 => deletedMap
  }
 }

 override def viewItems(itemsMap: Map[Int, Products]): Map[Int, Products] = {
  for (x <- itemsMap) {
   log.debug(x + "\n")
  }
  log.debug("press 1 to go back to menu and 2 to exit")
  val select = readInt()
  select match {
   case 1 => this.menu(itemsMap)
   case 2 => itemsMap
  }
 }
}