package com.jrtc.fruitfinder.data

import com.jrtc.fruitfinder.R
import com.jrtc.fruitfinder.model.Fruit

/** An object to generate a static list of fruits. */
object DataSource {

    val fruits: List<Fruit> = listOf(
        Fruit( // 1 med 3" dia
            R.drawable.apple,
            "Apple",
            95,
            0.3,
            0,
            2,
            195,
            25,
            0.5,
            14,
            1
        ),
        Fruit( // 1 cup
            R.drawable.apricots,
            "Apricots",
            79,
            0.6,
            0,
            2,
            427,
            18,
            2.3,
            27,
            2
        ),
        Fruit( // 1 medium 7-7 7/8" long
            R.drawable.banana,
            "Banana",
            105,
            0.4,
            0,
            1,
            422,
            27,
            1.3,
            17,
            0
        ),
        Fruit( // 1 cup
            R.drawable.blackberries,
            "Blackberries",
            62,
            0.7,
            0,
            1,
            233,
            14,
            2.0,
            50,
            4
        ),
        Fruit( // 1 cup
            R.drawable.blueberries,
            "Blueberries",
            57,
            0.33,
            0,
            1,
            77,
            15,
            0.74,
            12,
            1
        ),
        Fruit( // 1 cup 155 g
            R.drawable.cherries,
            "Cherries",
            77,
            0.5,
            0,
            5,
            268,
            19,
            1.6,
            25,
            2
        ),
        Fruit( // 1 small durian
            R.drawable.durian,
            "Durian",
            885,
            34.5,
            0,
            13,
            560,
            176,
            9.5,
            198,
            4
        ),
        Fruit( // 0.5 fruit 3-3/4" dia
            R.drawable.grapefruit,
            "Grapefruit",
            52,
            0.2,
            0,
            0,
            166,
            13,
            0.9,
            64,
            2
        ),
        Fruit( // 1 cup 92g
            R.drawable.grapes,
            "Grapes",
            62,
            0.3,
            0,
            2,
            176,
            16,
            0.6,
            6,
            1
        ),
        Fruit( // 1 fruit 2" dia
            R.drawable.kiwi,
            "Kiwi",
            42,
            0.4,
            0,
            2,
            215,
            10,
            0.8,
            106,
            2
        ),
        Fruit( // 1 fruit without refuse (336 g)
            R.drawable.mango,
            "Mango",
            201,
            1.3,
            0,
            3,
            564,
            50,
            2.8,
            203,
            3
        ),
        Fruit( // 1 small (2-3/8" dia)
            R.drawable.orange,
            "Orange",
            45,
            0.1,
            0,
            0,
            174,
            11,
            0.9,
            85,
            3
        ),
        Fruit( // 1 fruit small
            R.drawable.papaya,
            "Papaya",
            67,
            0.4,
            0,
            13,
            286,
            17,
            0.7,
            159,
            3
        ),
        Fruit( // One raw medium peach (147 grams)
            R.drawable.peach,
            "Peach",
            50,
            0.5,
            0,
            0,
            247,
            15,
            1.0,
            15,
            14
        ),
        Fruit( // One medium pear
            R.drawable.pear,
            "Pear",
            101,
            0.285,
            0,
            2,
            207,
            27,
            0.6,
            13,
            2
        ),
        Fruit( // 1 fruit
            R.drawable.pineapple,
            "Pineapple",
            452,
            1.1,
            0,
            9,
            986,
            119,
            4.9,
            721,
            11
        ),
        Fruit( // 1 fruit (2-1/8" dia)
            R.drawable.plum,
            "Plum",
            30,
            0.2,
            0,
            0,
            104,
            8,
            0.5,
            10,
            0
        ),
        Fruit( // 1 cup
            R.drawable.raspberries,
            "Raspberries",
            65,
            0.8,
            0,
            1,
            186,
            15,
            1.5,
            53,
            3
        ),
        Fruit( // 1 cup
            R.drawable.strawberries,
            "Strawberries",
            47,
            0.4,
            0,
            1,
            220,
            11,
            1.0,
            141,
            2
        ),
        Fruit( // 1 NLEA serving (280 g
            R.drawable.watermelon,
            "Watermelon",
            85,
            0.4,
            0,
            3,
            314,
            21,
            1.7,
            37,
            2
        )
    )

}