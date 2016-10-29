package com.seek.soft.web;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;

/**
 * Created by baixiaobin on 16/10/28.
 */
public class UserVerticle extends AbstractVerticle {


    HttpServerRequest request;

    /**
     * If your verticle does a simple, synchronous start-up then override this method and put your start-up
     * code in there.
     *
     * @throws Exception
     */
    @Override
    public void start() throws Exception {

        Router router = Router.router(vertx);
        router.route().handler(BodyHandler.create());
        router.get("/user/:id").handler(this::handleGetUser);
        router.get("/user/list:id").handler(this::handleListUsers);
        router.post("/user/add/:id").handler(this::handleAddUser);
        router.delete("/user/delete:id").handler(this::handleDeleteUser);

        vertx.createHttpServer().requestHandler(router::accept).listen(8088);
    }

    /**
     * 删除用户
     *
     * @param routingContext
     */
    private void handleDeleteUser(RoutingContext routingContext) {
        String id = routingContext.request().getParam("id");
    }

    /**
     * 用户列表
     *
     * @param routingContext
     */
    private void handleListUsers(RoutingContext routingContext) {
    }

    /**
     * 新增用户
     *
     * @param routingContext
     */
    private void handleAddUser(RoutingContext routingContext) {

    }

    /**
     * 获取用户
     *
     * @param routingContext
     */
    private void handleGetUser(RoutingContext routingContext) {
    }


}
