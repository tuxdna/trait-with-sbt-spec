package ui2

import observer._

trait ObservableClicks extends Clickable with Subject {
  abstract override def click():Unit = {
    super.click()
    notifyObservers
  }
}
