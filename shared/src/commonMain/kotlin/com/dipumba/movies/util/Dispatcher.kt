package com.dipumba.movies.util

import kotlinx.coroutines.CoroutineDispatcher
//step-6  this will setup all the dispatcher that i would like to use for my networking
//so i m gonna use io dispatcher here when i m using android
//for default dispatcher when we are using the ios plateform
internal interface Dispatcher {
    val io: CoroutineDispatcher
}

internal expect fun provideDispatcher(): Dispatcher
//expect ---so here expect is the functionality to be exposed and then we write its implementstion
  //so actul----for the diff enviorment settings like----Android and iOS