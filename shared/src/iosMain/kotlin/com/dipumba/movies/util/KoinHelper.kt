package com.dipumba.movies.util

import com.dipumba.movies.di.getSharedModules
import org.koin.core.context.startKoin

/** step-23**/
fun initKoin(){
    startKoin {
        modules(getSharedModules())
    }
}