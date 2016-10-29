package com.seek.soft.web;

import com.seek.soft.utils.Runner;
import com.seek.soft.web.common.BaseVerticle;

/**
 * Created by baixiaobin on 16/10/26.
 */
public class HelloWordService extends BaseVerticle {

    /**
     * If your verticle does a simple, synchronous start-up then override this method and put your start-up
     * code in there.
     *
     * @throws Exception
     */
    @Override
    public void start() throws Exception {
        router.get("/user/list").handler(ctx -> {
            ctx.response()
                    .putHeader("Content-Type", "text/html")
                    .end("haha");
        });
        router.get("/user/add").handler(ctx -> {
            String name = ctx.request().getParam("name");
            ctx.response()
                    .putHeader("Content-Type", "text/html")
                    .end(name);
        });
    }


    public static void main(String[] args) {
        Runner.runExample(HelloWordService.class);
    }

}
