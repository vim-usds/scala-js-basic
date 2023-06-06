package tutorial.webapp

import org.scalajs.dom
import org.scalajs.dom.document

import scala.scalajs.js.annotation.JSExportTopLevel

import scala.scalajs.js

object TutorialApp {
  def main(args: Array[String]): Unit = {
    appendPar(document.body, "Hello World")
  }

  def appendPar(targetNode: dom.Node, text: String): Unit = {
    val parNode = document.createElement("p")
    parNode.textContent = text
    targetNode.appendChild(parNode)
  }

  @JSExportTopLevel("addClickedMessage")
  def addClickedMessage(): Unit = {
    appendPar(document.body, "You clicked the button!")
  }

  @JSExportTopLevel("testError")
  def testError():Unit = {
    try{
      require(1==0, "sorry 1 doesn't equal 0")
    } catch {
      case e: Throwable => throw js.JavaScriptException(e)
    }
  }
}

