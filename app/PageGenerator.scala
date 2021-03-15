package meerkat

import io.circe.Json
import ada.products.PageGenerator
import ada.enhancements._

object PageGenerator{
    val h1 = List(List("a", "b"), List("c", "d"), List("e", "f")).zipWithIndex.map{case(k, v) => (v,k)}.toMap
    val pageGenerator = new PageGenerator[String](2, h1)(
        i => Json.fromString(i.toString()),
        io.circe.Decoder[Int],
        io.circe.Encoder[String],
        io.circe.Decoder[String])
}