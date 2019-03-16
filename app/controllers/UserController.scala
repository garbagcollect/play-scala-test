package controllers

import javax.inject.Inject
import models.UserRest
import play.api.libs.json.Json
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents}

class UserController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  implicit val userWrites = Json.writes[UserRest]

  def index: Action[AnyContent] = Action { implicit request =>
    val userList = List(UserRest(1, "Martin", "Jean"))
    Ok(Json.toJson(userList))
  }

  def create: Action[AnyContent] = Action { implicit request =>
    var user = UserRest(1, "Martin", "Jean")
    Created(Json.toJson(user))
  }

}
