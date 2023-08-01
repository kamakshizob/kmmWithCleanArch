package com.dipumba.movies.util

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
//step-6.2 created a AndroidDispatcher class and its implemets the Dispatcher
internal class IosDispatcher: Dispatcher{
    override val io: CoroutineDispatcher
        get() = Dispatchers.Default  //here Default for ios
}

internal actual fun provideDispatcher(): Dispatcher = IosDispatcher()