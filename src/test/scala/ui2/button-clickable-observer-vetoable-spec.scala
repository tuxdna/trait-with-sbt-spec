package ui2
import org.specs._
import observer._
import ui.ButtonCountObserver

object ButtonClickableObserverVetoableSpec extends Specification {
  "A Button Observer with Vetoable Clicks" should {
    "observe only the first button click" in {
      val observableButton = 
	new Button("Okay") with ObservableClicks with VetoableClicks
	// new Button("Okay") with  VetoableClicks with ObservableClicks

      val buttonClickCountObserver = new ButtonCountObserver
      observableButton.addObserver(buttonClickCountObserver)

      for(i <- 1 to 3) observableButton.click()
      buttonClickCountObserver.count mustEqual 1
    }
  }
}
