package org.example

class FizzBuzz {
    fun generateNumbers(): MutableList<Int> {
        var numbers = mutableListOf<Int>()
        for (n in 1..100) {
            numbers.add(n)
        }
        return numbers

        // return listOf(1)
        //return emptyList()
    }

}