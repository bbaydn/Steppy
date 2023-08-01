package com.busra.daggerkullanimi

import dagger.Module
import dagger.Provides

@Module
class AppModule {
    @Provides
    fun provideAdres():Adres{
        return Adres("Osmangazi / Bursa")
    }

    //Singleton: Nesnenin bir kere oluşturulup her yerden erişilebilmesidir.
}