package com.company.kotlin_flaggame

object Constants {

    fun getQuestion(): ArrayList<Question> {

        val questionList = ArrayList<Question>()
        var questionString: String = "What country does this flag belong to?"

        val que1 = Question(1, questionString,
        R.drawable.argentina,
        "Argentina", "Belgium","Denmark","Canada",
        1)
        questionList.add(que1)

        val que2 = Question(2,questionString,
            R.drawable.australia,
            "China", "USA","Australia","Britain",
            3)
        questionList.add(que2)

        val que3 = Question(3,questionString,
            R.drawable.belgium,
            "Egypt", "Belgium","France","India",
            2)
        questionList.add(que3)

        val que4 = Question(4,questionString,
            R.drawable.brazil,
            "Brazil", "Israel","Mexico","Romania",
            1)
        questionList.add(que4)

        val que5 = Question(5,questionString,
            R.drawable.britain,
            "Japan", "Turkey","Norway","Britain",
            4)
        questionList.add(que5)

        val que6 = Question(6,questionString,
            R.drawable.canada,
            "Spain", "Canada","Kuwait","Italy",
            2)
        questionList.add(que6)

        val que7 = Question(7,questionString,
            R.drawable.china,
            "Belgium", "South Korea","China","Germany",
            3)
        questionList.add(que7)

        val que8 = Question(8,questionString,
            R.drawable.denmark,
            "Denmark", "USA","Lebanon","Brazil",
            1)
        questionList.add(que8)

        val que9 = Question(9,questionString,
            R.drawable.egypt,
            "Denmark", "USA","Lebanon","Egypt",
            4)
        questionList.add(que9)

        val que10 = Question(10,questionString,
            R.drawable.spain,
            "Denmark", "USA","Lebanon","Egypt",
            4)
        questionList.add(que10)

        val que11 = Question(11,questionString,
            R.drawable.france,
            "Denmark", "USA","Lebanon","Egypt",
            4)
        questionList.add(que11)

        val que12 = Question(12,questionString,
            R.drawable.germany,
            "Denmark", "USA","Lebanon","Egypt",
            4)
        questionList.add(que12)

        val que13 = Question(13,questionString,
            R.drawable.greece,
            "Denmark", "USA","Lebanon","Egypt",
            4)
        questionList.add(que13)

        val que14 = Question(14,questionString,
            R.drawable.india,
            "Denmark", "USA","Lebanon","Egypt",
            4)
        questionList.add(que14)

        val que15 = Question(15,questionString,
            R.drawable.israel,
            "Denmark", "USA","Lebanon","Egypt",
            4)
        questionList.add(que15)

        val que16 = Question(16,questionString,
            R.drawable.italy,
            "Denmark", "USA","Lebanon","Egypt",
            4)
        questionList.add(que16)

        val que17 = Question(17,questionString,
            R.drawable.japan,
            "Denmark", "USA","Lebanon","Egypt",
            4)
        questionList.add(que17)

        val que18 = Question(18,questionString,
            R.drawable.kuwait,
            "Denmark", "USA","Lebanon","Egypt",
            4)
        questionList.add(que18)

        val que19 = Question(19,questionString,
            R.drawable.lebanon,
            "Denmark", "USA","Lebanon","Egypt",
            4)
        questionList.add(que19)

        val que20 = Question(20,questionString,
            R.drawable.mexico,
            "Denmark", "USA","Lebanon","Egypt",
            4)
        questionList.add(que20)

        val que21 = Question(21,questionString,
            R.drawable.norway,
            "Denmark", "USA","Lebanon","Egypt",
            4)
        questionList.add(que21)

        val que22 = Question(22,questionString,
            R.drawable.romania,
            "Denmark", "USA","Lebanon","Egypt",
            4)
        questionList.add(que22)

        val que23 = Question(23,questionString,
            R.drawable.southkorea,
            "Denmark", "USA","Lebanon","Egypt",
            4)
        questionList.add(que23)

        val que24 = Question(24,questionString,
            R.drawable.turkey,
            "Denmark", "USA","Lebanon","Egypt",
            4)
        questionList.add(que24)

        val que25 = Question(25,questionString,
            R.drawable.usa,
            "Denmark", "USA","Lebanon","Egypt",
            4)
        questionList.add(que25)

        return questionList
    }
}