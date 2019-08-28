package at.rainerkern.ktor

import io.ktor.application.ApplicationCall
import io.ktor.application.call
import io.ktor.html.respondHtml
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import kotlinx.html.ATarget
import kotlinx.html.a
import kotlinx.html.body
import kotlinx.html.div


fun main() {
    embeddedServer(Netty, 8080) {
        routing {
            get("/") {
                mainPage(call)
            }
        }
    }.start(wait = true)
}

suspend fun mainPage(call: ApplicationCall) = call.respondHtml {
    body {
        div {
            a("https://kotlinlang.org") {
                target = ATarget.blank
                +"Main site"
            }
        }
    }
}
