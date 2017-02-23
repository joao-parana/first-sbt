package myscala

import sbt.io._
import java.io.File
import java.net.{URI, URL}
import sys.process._
//import sys.process.Process.Spawn


/**
  * @author ${user.name}
  */

object App {

  def file(s: String): File = new File(s)

  def uri(s: String): URI = new URI(s)

  val targetDir = file("./target/")
  val srcDir = file("./src/")
  // val toTarget = rebase(srcDir, targetDir)
  val result = "ls -al" !;
  println(result)

  // val p: scala.sys.process.ProcessImpl = null
  // Spawn((x) => println(x))
  //  def processFile(f: File): Unit = {
  //    val newParent = toTarget(f.getParentFile) getOrElse {sys.error("wat")}
  //    val file1 = newParent / f.name
  //    println(s"""$f => $file1""")
  //    val xs = IO.readLines(f) map { _ + "!" }
  //    IO.writeLines(file1, xs)
  //  }
  //
  // val fs: Seq[File] = (srcDir ** "*.scala").get
  //  fs foreach {
  //    processFile
  //  }

  def foo(x: Array[String]) = x.foldLeft("")((a, b) => a + b)

  def main(args: Array[String]) {
    println("Hello World!")
    println("concat arguments = " + foo(args))
  }

}
