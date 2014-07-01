package com.sm.scala;

import org.vertx.java.platform.Verticle;

/**
 * Created by sascha on 19/06/14.
 */
public class StarterVerticle extends Verticle {

	@Override
	public void start() {
		container.deployVerticle(HelloJava.class.getName());
		container.deployVerticle("scala:com.sm.scala.HelloScala");
	}

}
