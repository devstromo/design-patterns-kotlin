package com.devstromo.behavioral.observer.standard

import org.junit.jupiter.api.Test

class ObserverUnitTest {
    @Test
    fun testObserver() {
        val editor = Editor()
        val logListener = LogOpenListener("input.txt")
        val emailListener = EmailNotificationListener("test@test.com")
        editor.events.subscribe("open", logListener)
        editor.events.subscribe("open", emailListener)
        editor.events.subscribe("save", emailListener)
        editor.events.subscribe("edit", emailListener)
        editor.openFile("test.txt")
        editor.editFile()
        editor.saveFile()

        editor.events.unsubscribe("edit", emailListener)
        editor.openFile("test-read-only.txt")
        editor.editFile()
        editor.saveFile()
    }
}