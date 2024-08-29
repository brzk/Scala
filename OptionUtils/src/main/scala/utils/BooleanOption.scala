package utils

object BooleanOption {
  implicit class BooleanOption(option: Option[Boolean]) {

    def containsTrue(option: Option[Boolean]):Boolean = {
      option.contains(true)
    }

    def containsFalse(option: Option[Boolean]):Boolean = {
      option.contains(false)
    }
  }
}
