package utils

object BooleanOption {
  implicit class BooleanOptionImplicit(option: Option[Boolean]) {

    def containsTrue():Boolean = {
      option.contains(true)
    }

    def containsFalse():Boolean = {
      option.contains(false)
    }
  }
}