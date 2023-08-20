package fp.app

import fp.effect.{Console, Print, Read, Sequence}
import fp.runtime.ConsoleApp

import java.time.LocalDate

object GreetingWithBetterSyntax extends ConsoleApp {

  /**
   * representing usage of method '>>' (combine 2 Console)
   */
  override protected def run: Console = {
    Print(s"Today is ${LocalDate.now}") >>
      Print("Enter your name: ") >>
        Read(name => Print(s"Hello, $name")) >>
          Print("Goodbye")
  }

}
