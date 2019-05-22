package com.study.jetpacktest.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import com.study.jetpacktest.ioThread

@Database(entities = arrayOf(Girl::class), version = 1)
abstract class GirlDB : RoomDatabase() {
    abstract fun girlDao(): GirlDao

    companion object {
        private var instance: GirlDB? = null

        @Synchronized
        fun get(context: Context): GirlDB {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    GirlDB::class.java, "GirlDateBase"
                ).addCallback(object : RoomDatabase.Callback() {
                        override fun onCreate(db: SupportSQLiteDatabase) {
                            ioThread {
                                get(context).girlDao().insert(
                                    GIRL_DATA.map {
                                        Girl(
                                            id = 0,
                                            name = it
                                        )
                                    })
                            }
                        }
                    }).build()
            }
            return instance!!
        }
    }
}

private val GIRL_DATA = arrayListOf(
    "Abbaye de Belloc", "Abbaye du Mont des Cats", "Abertam", "Abondance", "Ackawi",
    "Acorn", "Adelost", "Affidelice au Chablis", "Afuega'l Pitu", "Airag", "Airedale",
    "Aisy Cendre", "Allgauer Emmentaler", "Alverca", "Ambert", "American Cheese",
    "Ami du Chambertin", "Anejo Enchilado", "Anneau du Vic-Bilh", "Anthoriro", "Appenzell",
    "Aragon", "Ardi Gasna", "Ardrahan", "Armenian String", "Aromes au Gene de Marc",
    "Asadero", "Asiago", "Aubisque Pyrenees", "Autun", "Avaxtskyr", "Baby Swiss",
    "Babybel", "Baguette Laonnaise", "Bakers", "Baladi", "Balaton", "Bandal", "Banon",
    "Barry's Bay Cheddar", "Basing", "Basket Cheese", "Bath Cheese", "Bavarian Bergkase",
    "Baylough", "Beaufort", "Beauvoorde", "Beenleigh Blue", "Beer Cheese", "Bel Paese",
    "Bergader", "Bergere Bleue", "Berkswell", "Beyaz Peynir", "Bierkase", "Bishop Kennedy",
    "Blarney", "Bleu d'Auvergne", "Bleu de Gex", "Bleu de Laqueuille",
    "Bleu de Septmoncel", "Bleu Des Causses", "Blue", "Blue Castello", "Blue Rathgore",
    "Blue Vein (Australian)", "Blue Vein Cheeses", "Bocconcini", "Bocconcini (Australian)"
)