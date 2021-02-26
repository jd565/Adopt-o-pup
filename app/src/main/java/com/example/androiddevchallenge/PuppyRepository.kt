/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge

class PuppyRepository {
    fun getPuppies(): List<Puppy> {
        return puppies
    }

    fun getPuppy(id: Long): Puppy {
        return puppies.first { it.id == id }
    }

    private val puppies = listOf(
        Puppy(
            id = 16L,
            name = "Puggy",
            imageUrl = "https://cdn.pixabay.com/photo/2015/03/26/09/54/pug-690566__480.jpg",
            breed = "Pug",
            age = "10 months",
            description = listOf(
                "Puggy is a loveable little character and really enjoys human company.",
                "He has an infectious smile that brightens the day of everyone he meets."
            ),
        ),
        Puppy(
            id = 15L,
            name = "Rex",
            imageUrl = "https://cdn.pixabay.com/photo/2016/12/13/05/15/puppy-1903313__480.jpg",
            breed = "Golden Retriever",
            age = "5 months",
            description = listOf(
                "While Rex may seem cute and cuddly, he loves to be outside chasing birds.",
                "Any potential adopters must be prepared for a lot of exercise to keep Rex satisfied."
            )
        ),
        Puppy(
            id = 14L,
            name = "Freddie",
            imageUrl = "https://cdn.pixabay.com/photo/2015/06/08/15/02/pug-801826__480.jpg",
            breed = "Pug",
            age = "16 months",
            description = listOf(
                "Freddie just loves his blanket, and won't go anywhere without it!"
            ),
        ),
        Puppy(
            id = 13L,
            name = "Bettie",
            imageUrl = "https://cdn.pixabay.com/photo/2016/07/15/15/55/dachshund-1519374__480.jpg",
            breed = "Dachshund",
            age = "3 months",
            description = listOf(
                "Little Bettie is only just old enough for adoption.",
                "Who could say no to those eyes!"
            ),
        ),
        Puppy(
            id = 12L,
            name = "Daisey",
            imageUrl = "https://cdn.pixabay.com/photo/2017/09/25/13/12/dog-2785074__480.jpg",
            breed = "Cockerspaniel",
            age = "20 months",
            description = listOf(
                "A little older than our other puppies, Daisey is still a puppy at heart.",
                "She will provide years of fun and enjoyment as a companion."
            ),
        ),
        Puppy(
            id = 11L,
            name = "Bertie",
            imageUrl = "https://cdn.pixabay.com/photo/2015/11/17/13/13/dogue-de-bordeaux-1047521__480.jpg",
            breed = "Bordeaux",
            age = "14 months",
            description = listOf(
                "Bertie is full of character, but can be aggressive towards other dogs. Lots of training required."
            ),
        ),
        Puppy(
            id = 10L,
            name = "Jumper & Dancer",
            imageUrl = "https://cdn.pixabay.com/photo/2016/10/31/14/55/rottweiler-1785760__480.jpg",
            breed = "Rottweiler",
            age = "8 months",
            description = listOf(
                "These twins come together and should not be separated.",
                "A couple of loveable little rogues, they are most happy when they have found a big stick."
            ),
        ),
        Puppy(
            id = 9L,
            name = "Sally",
            imageUrl = "https://cdn.pixabay.com/photo/2016/02/18/18/37/puppy-1207816__480.jpg",
            breed = "Golden Retriever",
            age = "5 months",
            description = listOf(
                "Little sally is very cute.",
                "We are expecting she will get adopted very quickly."
            ),
        ),
        Puppy(
            id = 8L,
            name = "Starz",
            imageUrl = "https://cdn.pixabay.com/photo/2018/01/09/11/04/dog-3071334__480.jpg",
            breed = "Unknown",
            age = "7 months",
            description = listOf(
                "Nobody is quite sure exactly what breed Starz is.",
                "What we do know is that they are a lot of fun to be around, and they love little chew toys.",
                "Watch out for your furniture. Very tasty!"
            ),
        ),
        Puppy(
            id = 7L,
            name = "Flopsy",
            imageUrl = "https://cdn.pixabay.com/photo/2016/03/27/21/16/animal-1284307__480.jpg",
            breed = "Pug",
            age = "14 months",
            description = listOf(
                "Another of the older dogs up for adoption.",
                "Flopsy is very mild and spends a lot of time lying on the sofa."
            ),
        ),
        Puppy(
            id = 6L,
            name = "Casie",
            imageUrl = "https://cdn.pixabay.com/photo/2021/01/26/17/18/cavalier-king-charles-spaniel-5952324__480.jpg",
            breed = "Cockerspaniel",
            age = "13 months",
            description = listOf(
                "Casie is a natural hunter. If there is anything moving, she is catching it"
            ),
        ),
        Puppy(
            id = 5L,
            name = "Bart",
            imageUrl = "https://cdn.pixabay.com/photo/2015/11/17/13/13/bulldog-1047518__480.jpg",
            breed = "Bulldog",
            age = "6 months",
            description = listOf(
                "Bart is very cute looking right now, but he will grow into a large powerful dog."
            ),
        ),
        Puppy(
            id = 4L,
            name = "Shooter",
            imageUrl = "https://cdn.pixabay.com/photo/2016/02/19/10/13/pug-1209129__480.jpg",
            breed = "Pug",
            age = "4 months",
            description = listOf(
                "Named for his desire to chase, Shooter is usually seen shooting off into a field after some small animal."
            ),
        ),
        Puppy(
            id = 3L,
            name = "Audrey",
            imageUrl = "https://cdn.pixabay.com/photo/2016/01/05/17/51/maltese-1123016__480.jpg",
            breed = "Maltese",
            age = "20 months",
            description = listOf(
                "A more docile breed, Audrey is perfectly suited to people who can't manage hours of walking every day."
            ),
        ),
        Puppy(
            id = 2L,
            name = "Arron",
            imageUrl = "https://cdn.pixabay.com/photo/2015/12/08/00/52/puppy-1082141__480.jpg",
            breed = "Labrador",
            age = "4 months",
            description = listOf(
                "A beautiful example of a pedigree Lab.",
                "Arron will grow to be a classic Lab, with everything that goes with it."
            ),
        ),
        Puppy(
            id = 1L,
            name = "Rocket",
            imageUrl = "https://cdn.pixabay.com/photo/2016/05/09/10/42/weimaraner-1381186__480.jpg",
            breed = "Weimaraner",
            age = "5 months",
            description = listOf(
                "Rocket just loves to run!",
                "He would spend all day running, if he could. He is very responsive to calls to come back."
            ),
        ),
        Puppy(
            id = 0L,
            name = "Otto",
            imageUrl = "https://cdn.pixabay.com/photo/2016/11/22/19/41/adorable-1850276__480.jpg",
            breed = "Unknown",
            age = "10 months",
            description = listOf(
                "Otto is a natural snuggler. Determined to find the warmest place for him to curl up and sleep."
            ),
        ),
    )
}
