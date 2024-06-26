package work.wander.example.data.roomdemo

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import work.wander.example.data.roomdemo.entity.DemoEntity

@Database(entities = [DemoEntity::class], version = 1, exportSchema = false)
@TypeConverters(InstantConverter::class)
abstract class DemoRoomDatabase : RoomDatabase() {
    abstract fun demoEntityDao(): DemoEntityDao
}