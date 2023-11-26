fun main() {
    var lines = 0
    print("Enter number of rows: ")
    while (lines < 1 || lines > 8) {
        var input = ""
        while (input == "") {
            input = (readlnOrNull().toString())
            if (input == "") {
                print("Enter number of rows: ")
            }
        }
        lines = input.toInt()
        if (lines < 1 || lines > 8) {
            println("above 0 but below 9 please")
        }
    }

    for (line in 1.. lines){

        for ( spaces in line..lines ){
            print(" ")
        }
        for ( stars in 1..line ){
            print("*")
        }
        print("  ")
        for ( stars in 1..line ){
            print("*")
        }
        println()
    }
}