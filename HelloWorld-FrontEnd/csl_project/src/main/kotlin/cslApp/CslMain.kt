package cslApp

import io.ktor.application.*
import io.ktor.features.CallLogging
import io.ktor.features.DefaultHeaders
import io.ktor.routing.*
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import viewApp.viewComponent;
import viewApp.viewComponentTypes

fun Application.module() {
    install(DefaultHeaders)
    install(CallLogging)
    install(Routing) {
        viewComponent(this)
        viewComponentTypes(this)
    }
}

fun main(args: Array<String>) {
    embeddedServer(Netty, 8000, watchPaths = listOf("cslApp.CslMainKt"), module = Application::module).start()
}