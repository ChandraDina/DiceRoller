package com.example.diceroller

override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
        DiceRollerTheme {
            DiceRollerApp()
            @Preview
            @Composable
            fun DiceRollerApp() {
                DiceWithButtonAndImage()
            }
        }
    }
}