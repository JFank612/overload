fun customer(name: String, number: String) {
    println(name + "\n" + number)
    return
}

fun customer(name: String, number: String, email: String) {
    println(name + "\n" + number + "\n" + email)
    return
}

fun main(arg: Array<String>){
    do {
        println("1. Residential")
        println("2. Business")
        println("3. Exit")
        print("Enter your selection:")
        val input = readLine()!!.toInt()



        if (input == 1) {
            print("Enter your name:")
            val name = readLine()!!
            print("Enter your phone number:")
            val number = readLine()!!
            customer(name, number)
        }
        else if (input == 2) {
            print("Enter your name:")
            val name = readLine()!!
            print("Enter your number:")
            val number = readLine()!!
            print("Enter your email:")
            val email = readLine()!!
            customer(name, number, email)

        } else {
            println("Invalid Number.")
        }
    }
    while(input != 3)
}