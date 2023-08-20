package fp.app

import fp.effect.{Console, Print, Read, Sequence}
import fp.runtime.ConsoleApp

object Greeting extends ConsoleApp{
  override protected def run: Console = {
    Sequence(
      Print("Enter your name: "),
      Read(name => Print(s"Hello, $name"))
    )
  }
}
