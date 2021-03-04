package v1.post

import io.circe.Json
import ada.products.PageGenerator


object PageGenerator{
    val pageGenerator = new PageGenerator[Int, String](1, Map(0 -> List("1", "2"), 1 -> List("5", "6")))(i => Json.fromString(i.toString()))
}