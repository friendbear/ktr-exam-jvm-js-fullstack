import io.ktor.application.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import java.security.KeyStore

fun main() {

    embeddedServer(Netty, 9090) {
        routing {
            get("/hello") {
                call.respondText("Hello, API!")
            }

        }
    }.start(wait = true)

    println("Hello, JVM!")
}