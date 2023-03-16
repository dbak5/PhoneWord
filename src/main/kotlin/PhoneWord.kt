/*
Name: DaHye Baker
ID: 30063368
Assessment 1: Activity 1
*/

fun main() {
    // Map letters to numbers
    val mapping = mapOf(
        'A' to 2, 'B' to 2, 'C' to 2,
        'D' to 3, 'E' to 3, 'F' to 3,
        'G' to 4, 'H' to 4, 'I' to 4,
        'J' to 5, 'K' to 5, 'L' to 5,
        'M' to 6, 'N' to 6, 'O' to 6,
        'P' to 7, 'Q' to 7, 'R' to 7, 'S' to 7,
        'T' to 8, 'U' to 8, 'V' to 8,
        'W' to 9, 'X' to 9, 'Y' to 9, 'Z' to 9
    )

    // Take in a user input
    print("Enter word to convert: ")
    val word = readln().uppercase()

    // Loop through the user input word and add to the phone number
    var phoneNumber = ""
    for (i in word) {
        if (i.isDigit()) {
            phoneNumber += i
        } else {
            var number = mapping[i]
            phoneNumber += number
        }
    }
    print(phoneNumber)
}


