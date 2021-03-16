package meerkat

import io.circe.Json
import ada.products.PageGenerator
import ada.enhancements._
import io.circe.generic.auto._, io.circe.syntax._

object PageGenerator{
    val food1 = "https://images.unsplash.com/photo-1490645935967-10de6ba17061?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1"
    val food2 = "https://images.unsplash.com/photo-1476224203421-9ac39bcb3327?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1"
    val gadget1 = "https://images.unsplash.com/photo-1519558260268-cde7e03a0152?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D"
    val gadget2 = "https://images.unsplash.com/photo-1605648916361-9bc12ad6a569?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1"
    val pet1 = "https://images.unsplash.com/photo-1548199973-03cce0bbc87b?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1"
    val pet2 = "https://images.unsplash.com/photo-1511044568932-338cba0ad803?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1"
    val trees1 = "https://images.unsplash.com/photo-1538935732373-f7a495fea3f6?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1"
    val trees2 = "https://images.unsplash.com/photo-1476177725614-cdc50f15b345?ixlib=rb-1.2.1&ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D"
    val neighbourhood1 = "https://images.unsplash.com/photo-1609134154062-59b78ecbff1c?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1"
    val neighbourhood2 = "https://images.unsplash.com/photo-1613060600396-6cd945e8292d?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1"
    val friends1 = "https://images.unsplash.com/photo-1539635278303-d4002c07eae3?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1"
    val friends2 = "https://images.unsplash.com/photo-1536010305525-f7aa0834e2c7?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1"

    case class Article(headline: String, image: String)
    val h1 = List(List(Article("99 Recipes for Lockdown", food1), Article("Don't Move - Stay Healthy", food2) ),
                    //List(Article("Do I Really Need This Gadget?", gadget1), Article("Second Hand Tech is Now In Vogue", gadget2)),
                    List(Article("What is Your Pet Like", pet1), Article("Pet Antics", pet2)),
                    List(Article("Should We Hug Trees More", trees1), Article("The Benefits of Trees for Mental Health", trees2)),
                    List(Article("6 Things to Discover in your Neighbourhood", neighbourhood1), Article("Local Exploration is Catching On", neighbourhood2)),
                    List(Article("How to Maintain Your Friendships during Lockdown", friends1), Article("Staying Friends in the Remote Era",friends2))).zipWithIndex.map{case(k, v) => (v,k)}.toMap
    
    val pageGenerator = new PageGenerator[Article](5, h1)(
        i => Json.fromString(i.toString()),
        io.circe.Decoder[Int],
        io.circe.Encoder[Article],
        io.circe.Decoder[Article])
}