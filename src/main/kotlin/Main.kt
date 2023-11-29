fun main() {
    var lines: Int
    do {
        print("Enter number of rows between 1 & 8: ")
        lines = readlnOrNull()?.toIntOrNull() ?: 0
        if (lines !in 1..8) println("Above 0 but below 9 please")
    } while (lines !in 1..8)

    repeat(lines) { line ->
        print(" ".repeat(lines - line - 1))
        print("*".repeat(line + 1))
        print("  ")
        println("*".repeat(line + 1))
    }
}
