package fp.effect

sealed trait Console {
  def >>(next: Console): Console = Sequence(this, next)
}

case class Print(value: String) extends Console
case class Read(f: String => Console) extends Console
case class Sequence(first: Console, second: Console) extends Console





