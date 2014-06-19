

vertx.createHttpServer.requestHandler { req: HttpServerRequest =>
  req.response.end("This is a Verticle script")
}.listen(9090)