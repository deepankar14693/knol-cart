package knolcart.inventory
import org.apache.log4j.Logger.getLogger
import scala.io.StdIn._

trait InventoryMaintenance {
 def menu(items: Map[Int, Items]): Map[Int, Items]
 def viewItems(items: Map[Int, Items]): Map[Int, Items]
 def searchItemById(items: Map[Int, Items]): Map[Int, Items]
 def searchItemsByCategory(items: Map[Int, Items]): Map[Int, Items]
 def priceLowToHigh(items: Map[Int, Items]): Map[Int, Items]
 def priceHighToLow(items: Map[Int, Items]): Map[Int, Items]
}

case class Items(val itemType: String, val itemName: String,
                 val itemVendor: String, val itemPrice: Int,
                 val itemDescription: String)

class User extends InventoryMaintenance {
 val log = getLogger(this.getClass)

 override def menu(items: Map[Int, Items]): Map[Int, Items] = {
  log.debug("Choose options :\n 1 for viewing items\n 2 for searching items by id\n 3 for searching items by category\n 4 for viewing items in ascending order of price\n 5 for viewing items in descending order of price\n")
  val select = readInt()
  select match {
   case 1 => viewItems(items)
   case 2 => searchItemById(items)
   case 3 => searchItemsByCategory(items)
   case 4 => priceLowToHigh(items)
   case 5 => priceHighToLow(items)
   case _ => items
  }
 }

 override def viewItems(items: Map[Int, Items]): Map[Int, Items] = {
  for (x <- items) {
   log.debug(x + "\n")
  }
  log.debug("press 1 to go back to menu and 2 to exit")
  val select = readInt()
  select match {
   case 1 => this.menu(items)
   case 2 => items
  }
 }

 override def searchItemById(items: Map[Int, Items]): Map[Int, Items] = {
  for (x <- items) {
   log.debug(x + "\n")
  }
  log.debug("enter the id of item you want to search\n")
  val elemId = readInt()
  val product = items(elemId)
  log.debug(product)
  log.debug("press 1 to go back to menu and 2 to exit")
  val select = readInt()
  select match {
   case 1 => this.menu(items)
   case 2 => items
  }
 }

 override def searchItemsByCategory(items: Map[Int, Items]): Map[Int, Items] = {
  log.debug("press 1 for bags\n press 2 for shoes\n press 3 for trousers\n press 4 for shirts\n")
  val input = readInt()
  if (input == 1) {
   val checked = items.filter(_._2.itemType == "BAGS")
   for (x <- checked) {
    log.debug(x + "\n")
   }
   log.debug("press 1 to go back to menu and 2 to exit")
   val select = readInt()
   select match {
    case 1 => this.menu(items)
    case 2 => items
   }
  }
  else if (input == 2) {
   val checked = items.filter(_._2.itemType == "SHOES")
   for (x <- checked) {
    log.debug(x + "\n")
   }
   log.debug("press 1 to go back to menu and 2 to exit")
   val select = readInt()
   select match {
    case 1 => this.menu(items)
    case 2 => items
   }
  }

  else if (input == 3) {
   val checked = items.filter(_._2.itemType == "TROUSERS")
   for (x <- checked) {
    log.debug(x + "\n")
   }
   log.debug("press 1 to go back to menu and 2 to exit")
   val select = readInt()
   select match {
    case 1 => this.menu(items)
    case 2 => items
   }
  }

  else if (input == 4) {
   val checked = items.filter(_._2.itemType == "SHIRTS")
   for (x <- checked) {
    log.debug(x + "\n")
   }
   log.debug("press 1 to go back to menu and 2 to exit")
   val select = readInt()
   select match {
    case 1 => this.menu(items)
    case 2 => items
   }
  }

  else
   println("invalid selection")
  this.menu(items)
 }

 override def priceLowToHigh(items: Map[Int, Items]): Map[Int, Items] = {
  val sorted = items.toSeq.sortWith(_._2.itemPrice < _._2.itemPrice)
  for (x <- sorted) {
   log.debug(x + "\n")
  }
  log.debug("press 1 to go back to menu and 2 to exit")
  val select = readInt()
  select match {
   case 1 => this.menu(items)
   case 2 => items
  }
 }

 override def priceHighToLow(items: Map[Int, Items]): Map[Int, Items] = {
  val sorted = items.toSeq.sortWith(_._2.itemPrice > _._2.itemPrice)
  for (x <- sorted) {
   log.debug(x + "\n")
  }
  log.debug("press 1 to go back to menu and 2 to exit")
  val select = readInt()
  select match {
   case 1 => this.menu(items)
   case 2 => items
  }
 }
}

