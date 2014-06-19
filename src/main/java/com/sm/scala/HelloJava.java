package com.sm.scala;

import org.vertx.java.core.Handler;
import org.vertx.java.core.http.HttpServerRequest;
import org.vertx.java.platform.Verticle;

/**
 * Created by sascha on 19/06/14.
 */
public class HelloJava extends Verticle {

	@Override
	public void start() {
		vertx.createHttpServer().requestHandler(new Handler<HttpServerRequest>() {
			public void handle(HttpServerRequest req) {
				req.response().end("This is a Java verticle");
			}
		}).listen(8080);
	}
}
