package net.selfdotlearn.javalin;

import io.javalin.Javalin;
import io.javalin.plugin.metrics.MicrometerPlugin;

public class App {
    public static void main(String[] args) {
        Javalin app = Javalin.create(config -> {
            config.registerPlugin(new MicrometerPlugin());
        });
        app.get("/", ctx -> ctx.result("Hello World"));
        app.start(8080);
    }
}
