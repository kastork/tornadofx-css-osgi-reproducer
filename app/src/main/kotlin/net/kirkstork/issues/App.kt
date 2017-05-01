package net.kirkstork.issues

import org.osgi.service.component.annotations.Component
import tornadofx.*
import tornadofx.osgi.ApplicationProvider
import tornadofx.osgi.StylesheetProvider

@Component
class AppRegistration : ApplicationProvider {
	override val application = MyApp::class
}

/*
@Component
class StyleRegistration : StylesheetProvider {
	override val stylesheet = MasterStyles::class
}
*/

//class MyApp() : App(MainView::class, MasterStyles::class) {
class MyApp() : App(MainView::class) {
	init {
		System.err.println("MyApp init...")
		reloadStylesheetsOnFocus()
	}
}

class MainView : View() {
	override val root = vbox {
		button("Press Me")
		label("Fu !") 
//      {
//			addClass(MasterStyles.foo)
//		}
	}
}

/*
class MasterStyles : Stylesheet() {
	companion object {
		val foo by cssclass()
	}

	init {
		foo {
			fontFamily = "Verdana"
			fontSize = 48.pt
		}
	}

}
*/
