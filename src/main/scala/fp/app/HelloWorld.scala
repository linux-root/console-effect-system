package fp.app

import fp.effect.{Console, Print}
import fp.runtime.ConsoleApp

object HelloWorld extends ConsoleApp {
  override protected def run: Console = {
    Print("From Console effect system: Hello world! ")
  }
}
