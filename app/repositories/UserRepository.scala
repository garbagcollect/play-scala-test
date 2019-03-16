package repositories

import javax.inject.Singleton
import repositories.models.UserData

trait UserRepository {
  def findAll: Iterable[UserData]
  def findById(id: Int): UserData
  def remove(id: Int)
  def add(userData: UserData)
}

@Singleton
class UserRepositoryImpl extends UserRepository {
  override def findAll: Iterable[UserData] = ???

  override def findById(id: Int): UserData = ???

  override def remove(id: Int): Unit = ???

  override def add(userData: UserData): Unit = ???
}