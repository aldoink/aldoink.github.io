package com.jockskaraoke.main;

import io.javalin.Javalin

fun main(args: Array<String>) {
    val app = Javalin.create().start(7000)
    app.get("/") {
        ctx -> ctx.result("Served via Caddy!")
    }
}