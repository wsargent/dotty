import scala.quoted._

object Q {
  inline def f(inline f: Any): Any = ${ Q2.fExpr('f) }
}

object Q2 {
  val m = C.m
  def fExpr(f: Expr[Any])(using QuoteContext): Expr[Any] = '{ () }
}