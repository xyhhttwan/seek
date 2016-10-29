package com.seek.soft.web.common;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;
import io.vertx.ext.web.Router;

/**
 *
 */
public class BaseVerticle extends AbstractVerticle {

    protected static Vertx vertx;
    protected static Router router;

    static {
        vertx = Vertx.vertx(new VertxOptions().setWorkerPoolSize(40));
        router = Router.router(vertx);
        vertx.createHttpServer().requestHandler(router::accept).listen(8088);
    }


}
