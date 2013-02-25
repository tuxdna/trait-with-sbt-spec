package ui

abstract class Widget {
  class Properties  {
    import scala.collection.mutable.HashMap
    import scala.collection.mutable.Map
    private var values: Map[String, Any] = new HashMap
    def size = values.size
    def get(key: String) = values.get(key)
    def update(key: String, value: Any) = {
      // do some preprocessing, e.g. , filtering.
      values.update(key, value)
      // ...
    }
  }

  val properties = new Properties
}
