package sample

import org.scalatest.FunSuite

/**
 * TODO: input comments
 * @author tomohiko
 */
class HelloScalaTest extends FunSuite {
  test("1 add 1 equals 2") {
    val sut = new HelloScala()
    assert(sut.add(1, 1) === 2)
  }
}
