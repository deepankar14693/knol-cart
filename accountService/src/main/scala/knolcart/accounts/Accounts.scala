package knolcart.accounts
import org.apache.log4j.Logger.getLogger
import scala.io.StdIn._

trait AccountsServices{
 def registerUser(userMap: Map[Long,String]): Long
 //def getToken: Long
 def signIn(userMap: Map[Long,String]):Boolean
}

class Accounts extends AccountsServices{
 val log = getLogger(this.getClass)
 override def registerUser(userMap: Map[Long,String]): Long= {
  log.debug("enter your name")
  val name = readLine()
  log.debug("enter your phone number")
  val phone = readLong()
  val userReg = Map(phone -> name)
  val updatedUsers = userReg ++ userMap
  log.debug(updatedUsers)
  log.debug(s"successfully registered and your token is $phone\n")
  phone
 }

 /*override def getToken: Long = {
  log.debug("enter phone number to get token")
  val num = readLong()
  s"your token is $num"
  num
 }*/

 override def signIn(userMap: Map[Long,String]): Boolean = {
  log.debug("enter token to sign in")
  val num = readLong()
  if (userMap.contains(num)){true}
  else {false}
 }
}

