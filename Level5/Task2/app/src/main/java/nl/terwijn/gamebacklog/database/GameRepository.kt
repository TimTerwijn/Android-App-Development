package nl.terwijn.gamebacklog.database

import android.content.Context
import androidx.lifecycle.LiveData
import nl.terwijn.gamebacklog.model.Game

class GameRepository(context: Context) {

    private var gameDao: GameDao

    init {
        val gameRoomDatabase = GameRoomDatabase.getDatabase(context)
        gameDao = gameRoomDatabase!!.gameDao()
    }

    fun getAllGames(): LiveData<List<Game>> {
        return gameDao.getAllGames()
    }

    fun insertGame(game: Game) {
         gameDao.insertGame(game)
    }

    fun deleteGame(game: Game) {
        gameDao.deleteGame(game)
    }

    fun deleteAllGames() {
        gameDao.deleteAllGames()
    }
}