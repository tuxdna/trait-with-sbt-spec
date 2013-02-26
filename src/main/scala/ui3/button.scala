package ui3

class Button(val label: String) extends Widget with Clickable {
  override def click() = {
    // some click logic
  }

  def draw() = {
    // some draw logic
  }

  override def toString() = 
    "(button: label=%s, %s)".format(label, super.toString())
}
