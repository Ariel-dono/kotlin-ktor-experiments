package viewApp

import io.ktor.application.*
import io.ktor.html.*
import io.ktor.http.HttpStatusCode
import io.ktor.routing.*
import kotlinx.html.*

fun viewComponent(routes:Routing){
    routes.get("/") {
        call.respondHtml(HttpStatusCode.Accepted) {
            head {
                title {
                    +"Ktor: netty"
                }
            }
            body {
                p {
                    +"Hello from Ktor Netty engine sample application"
                }
            }
        }
    }
}

fun viewComponentTypes(routes:Routing){
    routes.get("/type") {
        call.respondHtml(HttpStatusCode.Accepted) {
            head {
                title {
                    +"Ktor: netty"
                }
            }
            body {
                p {
                    +"Hello from Ktor Netty engine sample application type"
                }
            }
        }
    }
}