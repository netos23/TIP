import tip.Tip

import java.io.File
import java.nio.file.Paths

object TipTest extends App {
  val root = new File("examples")

  val typesTest = List(

  )

  def testTypes(filename: String): Unit = {

  }

  root.listFiles().map(f => f.getAbsoluteFile.getPath).foreach(testTypes)
}
