/*
* Copyright (C) 2021 The Android Open Source Project.
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
*     http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.example.dogglers.data

import com.example.dogglers.R
import com.example.dogglers.model.Pokemon


/**
 * An object to generate a static list of dogs
 */
object DataSource {

    val pokemons: List<Pokemon> = listOf(
        Pokemon(
            R.drawable.snore,
            "Snorelax",
            "160",
            "Normal"
        ),
        Pokemon(
            R.drawable.chard,
            "Charizard",
            "200",
            "Fire"
        ),
        Pokemon(
            R.drawable.venus,
            "Venusaur",
            "120",
            "Grass"
        ),
        Pokemon(
            R.drawable.blast,
            "Blastoise",
            "150",
            "Water"
        ),
        Pokemon(
            R.drawable.arc,
            "Arcanine",
            "140",
            "Fire"
        ),

        Pokemon(
            R.drawable.grou,
            "Groudon",
            "220",
            "Fire"
        ),

        Pokemon(
            R.drawable.kyogre,
            "Kyogre",
            "220",
            "Water"
        ),

        Pokemon(
            R.drawable.meta,
            "Metagross",
            "130",
            "Steel"
        ),

        Pokemon(
            R.drawable.ray,
            "Rayquaza",
            "220",
            "Grass"
        ),

        Pokemon(
            R.drawable.pika,
            "Pikachu",
            "90",
            "Lighting"
        )
    )
}
