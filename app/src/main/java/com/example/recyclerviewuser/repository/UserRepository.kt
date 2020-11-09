package com.example.recyclerviewuser.repository

import com.example.recyclerviewuser.model.GenderType
import com.example.recyclerviewuser.model.User

object UserRepository {

    fun findAll():List<User>{
        return listOf(
            User(id = 1,"Florence Steeves","(127)-415-3690","florence.steeeves@example.com",GenderType.FAMALE),
            User(id = 2,"Arnold Silva","(645)-421-4949","arnold.silva@example.com",GenderType.MALE),
            User(id = 3,"Edith Stone","(397)-194-9408","edith.stone@example.com",GenderType.FAMALE),
            User(id = 4,"Jo Dunn","(223)-757-1271","jo.dunn@example.com",GenderType.FAMALE),
            User(id = 5,"Brayden King","(344)-173-3943","brayden.king@example.com",GenderType.MALE),
            User(id = 6,"Yolanda Lucas","(426)-476-3434","yolanda.lucas@example.com",GenderType.FAMALE),
            User(id = 7,"Tyler Rose","(559)-360-6510","tyler.rose@example.com",GenderType.MALE),
            User(id = 8,"Thomas Walters","(197)-499-3941","thomas.walters@example.com",GenderType.MALE),
            User(id = 9,"Aubree Holmes","(007)-417-9778","aubree.holmes@example.com",GenderType.FAMALE),
            User(id = 10,"Warren Parker","(127)-415-3690","warren.parker@example.com",GenderType.MALE),
            User(id = 11,"Kevin Anderson","(304)-543-4091","kevin.anderson@example.com",GenderType.MALE),
            User(id = 12,"kyle payne","(509)-979-8186","kyle.payne@example.com",GenderType.MALE),
            User(id = 13,"Brooklyn Chapman","(871)-401-2171","brooklyn.chapman@example.com",GenderType.FAMALE),
            User(id = 14,"Austin Kelley","(342)-968-7010","austin.kelley@example.com",GenderType.MALE),
            User(id = 15,"michael sutton","(862)-029-6631","michael.sutton@example.com",GenderType.MALE),

        )
    }
}