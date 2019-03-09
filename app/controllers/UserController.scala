package controllers

import javax.inject.Inject
import models.User
import play.api.libs.json.Json
import play.api.mvc.{Action, AnyContent, BaseController, ControllerComponents}

class UserController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {
  implicit val userWrites = Json.writes[User]

  def index: Action[AnyContent] = Action { implicit request =>
    val userList = List(User(1, "Martin", "Jean"))
    Ok(Json.toJson(userList))
  }

}
