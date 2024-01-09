package com.devstromo.behavioral.observer.delegation

import org.junit.jupiter.api.Test

class ObserverDelegationUnitTest {
    @Test
    fun `Test Observer Delegation Pattern`() {
        val observerDelegation = Newsletter()
        observerDelegation.newestArticleObservers.add { url -> println("Observer 1 notified with URL: $url") }
        observerDelegation.newestArticleObservers.add { url -> println("Observer 2 notified with URL: $url") }

        observerDelegation.newestArticleUrl = "https://example.com/article1"

        observerDelegation.newestArticleUrl = "https://example.com/article2"
    }
}