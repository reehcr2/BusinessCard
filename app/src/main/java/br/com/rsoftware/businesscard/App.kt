package br.com.rsoftware.businesscard

import android.app.Application
import br.com.rsoftware.businesscard.data.AppDatabase
import br.com.rsoftware.businesscard.data.BusinessCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}