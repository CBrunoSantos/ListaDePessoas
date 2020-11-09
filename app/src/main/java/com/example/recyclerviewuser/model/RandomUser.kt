package com.example.recyclerviewuser.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Name(
    @JsonProperty("title") val title:String,
    @JsonProperty("first") val first:String,
    @JsonProperty("last") val last:String
)
data class Street(
    @JsonProperty("number") val number:Int,
    @JsonProperty("name") val name:String
)
data class Coordinates(
    @JsonProperty("latitude") val latitude:String,
    @JsonProperty("longitude") val longitude:String
)

data class Timezone(
    @JsonProperty("offset") val offset:String,
    @JsonProperty("description") val description:String
)

data class Location(
    @JsonProperty("street") val street:Street,
    @JsonProperty("city") val city: String,
    @JsonProperty("state") val state:String,
    @JsonProperty("country") val country:String,
    @JsonProperty("postcode") val postcode:String,
    @JsonProperty("coordinates") val coordinates:Coordinates,
    @JsonProperty("timezone") val timezone:Timezone
)

data class Login(
    @JsonProperty("uuid") val uuid:String,
    @JsonProperty("username") val username:String,
    @JsonProperty("password") val password:String,
    @JsonProperty("salt") val salt:String,
    @JsonProperty("md5") val md5:String,
    @JsonProperty("sha1") val sha1:String,
    @JsonProperty("sha256") val sha256:String
)

data class DateOfBirth(
    @JsonProperty("date") val date:String,
    @JsonProperty("age") val age:Int
)

data class Resgistered(
    @JsonProperty("date") val date:String,
    @JsonProperty("age") val age:Int
)

data class Identification(
    @JsonProperty("name") val name:String,
    @JsonProperty("value") val value:String?
)

data class Picture(
    @JsonProperty("large") val large:String,
    @JsonProperty("medium") val medium:String,
    @JsonProperty("thumbnail") val thumbnail: String
)

data class Result(
    @JsonProperty("gender") val gender: String,
    @JsonProperty("name") val name: Name,
    @JsonProperty("location") val location: Location,
    @JsonProperty("email") val email: String,
    @JsonProperty("login") val login: Login,
    @JsonProperty("dob") val dateOfBirth: DateOfBirth,
    @JsonProperty("registered") val registered: Resgistered,
    @JsonProperty("phone") val phone: String,
    @JsonProperty("cell") val cell: String,
    @JsonProperty("id") val id: Identification,
    @JsonProperty("picture") val picture: Picture,
    @JsonProperty("nat") val nationality: String
)

data class Info(
    @JsonProperty("seed") val seed:String,
    @JsonProperty("results") val results: Int,
    @JsonProperty("page") val page:Int,
    @JsonProperty("version") val version:String
)

data class RandomUser (
    @JsonProperty("results") val results: MutableList<Result>,
    @JsonProperty("info") val info: Info
)