package org.hexworks.zircon.api.kotlin

import org.hexworks.zircon.api.behavior.Subscription
import org.hexworks.zircon.api.util.Consumer
import org.hexworks.zircon.internal.behavior.Observable

/**
 * Extension function which adapts [Observable.addObserver] to
 * Kotlin idioms (eg: lambdas).
 */
inline fun <T : Any> Observable<T>.addObserver(crossinline fn: (T) -> Unit): Subscription {
    return addObserver(object : Consumer<T> {
        override fun accept(value: T) {
            fn(value)
        }
    })
}
