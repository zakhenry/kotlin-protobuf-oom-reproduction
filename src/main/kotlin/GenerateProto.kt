fun main() {

    repeat(200) {
        println(
            """
            message Hello${it + 1} {
                string message1 = 1;
                string message2 = 2;
                string message3 = 3;
                string message4 = 4;
                string message5 = 5;
                string message6 = 6;
                string message7 = 7;
                string message8 = 8;
                string message9 = 9;
                string message10 = 10;
            }
            """.trimIndent()
        )
    }
}
