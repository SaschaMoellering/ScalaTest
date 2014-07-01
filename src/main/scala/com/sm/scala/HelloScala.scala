package com.sm.scala


import org.vertx.scala.core.http.HttpServerRequest
import org.vertx.scala.platform.Verticle

/**
 * Created by sascha on 01/07/14.
 */
class HelloScala extends Verticle {
  override def start() {
    vertx.createHttpServer.requestHandler { req: HttpServerRequest =>
      req.response.end("This is a Verticle class written in Scala")
    }.listen(9090)
  }
}
