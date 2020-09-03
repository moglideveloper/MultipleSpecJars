package eg4

import org.scalatest.flatspec.AsyncFlatSpecLike
import org.scalatest.matchers.should.Matchers

class Spec4 extends AsyncFlatSpecLike with Matchers{

  val simpleClassName = this.getClass.getSimpleName

  it should s"pass for ${simpleClassName}" in {
    succeed
  }
}
