package com.asivquark.advancedkotlincourse

object Section1CollectionOperations {
    
    private val users = getUserList()
    
    // NOTE: In these exercises using always operators of collections
    // Also use only "users" to do these exercises
    // e.g.: .map   .filter   .foreach   .last    .first   ...
    
    
    // Return first user of list
    fun task1() = Any()
    
    // Return first user of list that contains the Smith surname
    fun task2() = Any()
    
    // Return last user of list
    fun task3() = Any()
    
    // Return three first users of list
    fun task4() = listOf<Any>()
    
    // Return 3 lists with users grouping in pairs in order of original list
    fun task5() = listOf<Any>()
    
    // Returns a list of users that have more than 30 years old
    fun task6() = listOf<Any>()
    
    // Returns a list of the pretty info text of each user with next style:
    // "id[1001] - John T. Brown 21yo (171.4) - 455, avenue High, Gallington - car[yes]"
    fun task7() = listOf<Any>()
    
    // Returns a list of height of users
    fun task8() = listOf<Any>()
    
    // Returns a map with name as key and age as value
    fun task9() = mapOf<Any,Any>()
    
    // Returns a map with "name surname" as key and age as value
    fun task10() = mapOf<Any,Any>()
    
    // Returns the height sum rounded to integer of all user that have a car
    fun task11() = mapOf<Any,Any>()
    
    //Return the name length average rounded to integer of all users
    fun task12() = listOf<Any>()
    
    //Return the max age of users list
    fun task13() = listOf<Any>()
    
    //Return map with address as key and entire user as valueAny()
    fun task14() = listOf<Any>()
    
    // Return two list of users: first list with the users that have car
    // and second list with users that not have car
    fun task15() = listOf<Any>()
    
    // Return a map with The user Counters of users have car and the users that not have car
    // and second list with users that not have car
    fun task16() = mapOf<Any,Any>()
    
    // Return the sum of age plus height of all users
    fun task17() = Any()
    
    //return all users list ordered by age ascending
    fun task18() = listOf<User>()
    
    //return all users list ordered by height descending
    fun task19() = listOf<User>()
    
    
    data class User(
        val id: Long,
        val name: String,
        val surname: String,
        val age: Int,
        val address: String,
        val height: Float,
        val hasVehicle: Boolean
    )
    
    fun getUserList(): List<User> {
        return listOf(
            User(
                id = 1001,
                name = "John",
                surname = "T. Brown",
                age = 21,
                address = "455, avenue High, Gallington",
                height = 171.4f,
                hasVehicle = true
            ),
            User(
                id = 1002,
                name = "Mathew",
                surname = "G. Smith",
                age = 37,
                address = "12 1-1, street old caravan, Traxton",
                height = 173.45f,
                hasVehicle = false
            ),
            User(
                id = 1003,
                name = "Mark",
                surname = "J. Jones",
                age = 49,
                address = "745, street riverside, Blackstone",
                height = 184.2f,
                hasVehicle = true
            ),
            User(
                id = 1004,
                name = "Charlotte",
                surname = "Town Miller",
                age = 26,
                address = "mi 1.1, road to Kellis, Michantown",
                height = 167.5f,
                hasVehicle = true
            ),
            User(
                id = 1005,
                name = "Rose",
                surname = "X. Johnson",
                age = 35,
                address = "54 3-b, street middleTown, Hardstreet",
                height = 172.8f,
                hasVehicle = false
            ),
            User(
                id = 1006,
                name = "Michael",
                surname = "William Mcleod",
                age = 30,
                address = "2175, 5th avenue, NewVillage",
                height = 165.4f,
                hasVehicle = true
            )
        )
    }
}