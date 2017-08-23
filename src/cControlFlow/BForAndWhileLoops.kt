package cControlFlow

fun main(args: Array<String>) {

    /*
     * For loop
     *
     */

    val list = listOf(1, 2, 3)

    // Normal for loop is not allowed i.e. for(i = 0; i < list.size(); i++)

    for (element in list) { // list has to an iterator with next() and hasNext() methods
        print(element)
    }

    for (i in 1..9) { // including 9
        print(i)
    }

    for (i in 1..50 step 2) { // in 2 step increments
        print(i)
    }

    for (i in 1 until 10) { // excluding 10 (the same as 1..9)
        print(i)
    }

    for (i in 9 downTo 1) { // decrement
        print(i)
    }

    // With Array
    val array = arrayOf(1, 2, 3)

    // indices
    for (i in array.indices) { // array.indices is a range internally
        print(array[i])
    }

    // withIndex()
    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }



    /*
     * While & do-while loop
     *
     */
    var x = 3
    while (x > 0) {
        println("in while loop > ${x--}")
    }

    var y = 3
    do {
        println("in do-while loop > ${y--}")
    } while (y > 0)
}