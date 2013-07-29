package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {
  
  def index = Action {
    Ok("")
  }
  
  def split(str:String) = Action {
  	Ok(str.split("\\W+").filter(_.length()>2).foldLeft("") {
  		(response,str) => response + str
	  })
  }
  
}