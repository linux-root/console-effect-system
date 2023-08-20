package fp.runtime

import fp.effect.{Console, Print, Read, Sequence}

trait ConsoleApp {

  protected def run: Console

  private def evaluate(console: Console): Unit = {
    console match {
      case Print(value) => println(value)
      case Sequence(first, second) => evaluate(first); evaluate(second)
      case Read(f) => evaluate(
        f(scala.io.StdIn.readLine())
      )
    }
  }

  def main(args: Array[String]): Unit = {
    this.evaluate(this.run)
  }

}