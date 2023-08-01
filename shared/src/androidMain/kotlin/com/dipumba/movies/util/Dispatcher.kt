package com.dipumba.movies.util

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

//step-6.1 created a AndroidDispatcher class and its implemets the Dispatcher
internal class AndroidDispatcher: Dispatcher{
    override val io: CoroutineDispatcher
        get() = Dispatchers.IO  //here IO for android
}

internal actual fun provideDispatcher(): Dispatcher = AndroidDispatcher()