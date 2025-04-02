package org.example

fun main() {
    test(
        name = "When given IPv4 with just 4 segment separated with just 3 dots" +
                " and each segment is between 0 and 255" +
                " it should return true",
        result = isIPv4Valid("192.168.1.1"),
        correctResult = true,
    )

    test(
        name = "When given IPv4 with just 4 segment separated with 3 dots" +
                " and each segment is between 0 and 255 and one of it's segment is zero" +
                " it should return true",
        result = isIPv4Valid("192.168.1.0"),
        correctResult = true,
    )

    test(
        name = "When given IPv4 with just 4 segment separated with 2 dots" +
                " and each segment is between 0 and 255" +
                " it should return false",
        result = isIPv4Valid("192.168.10"),
        correctResult = false,
    )

    test(
        name = "When given IPv4 with just 4 segment separated with 2 dots" +
                " and each segment is between 0 and 255 with extra space at the begin" +
                " it should return true",
        result = isIPv4Valid(" 192.168.1.0"),
        correctResult = true,
    )

    test(
        name = "When given IPv4 with just 4 segment separated with 2 dots" +
                " and each segment is between 0 and 255 with extra space at the end" +
                " it should return true",
        result = isIPv4Valid("192.168.1.0 "),
        correctResult = true,
    )

    test(
        name = "When given IPv4 with just 4 segment separated with 2 dots" +
                " and each segment is between 0 and 255 with" +
                " extra space inside the segment" +
                " it should return false",
        result = isIPv4Valid("192.1 68.1.0"),
        correctResult = false,
    )

    test(
        name = "When given IPv4 has a segment bigger than 255 it should return false",
        result = isIPv4Valid("192.256.1.1"),
        correctResult = false,
    )

    test(
        name = "When given IPv4 has a segment smaller than 0 it should return false",
        result = isIPv4Valid("192.-156.1.1"),
        correctResult = false,
    )

    test(
        name = "When given IPv4 has a character in one of it's segment it should return false",
        result = isIPv4Valid("192.1a8.1.1"),
        correctResult = false,
    )

    test(
        name = "When given IPv4 has less than 4 segments it should return false",
        result = isIPv4Valid("192.1.1"),
        correctResult = false,
    )

    test(
        name = "When given IPv4 has more than 4 segments it should return false",
        result = isIPv4Valid("192.168.5.1.1"),
        correctResult = false,
    )

    test(
        name = "When given IPv4 with segment has a one leading zero it should return false",
        result = isIPv4Valid("192.05.1.1"),
        correctResult = false,
    )

    test(
        name = "When given IPv4 with segment has any leading zeros it should return false",
        result = isIPv4Valid("192.005.1.1"),
        correctResult = false,
    )

    test(
        name = "When given string with symbols it should return false",
        result = isIPv4Valid("^8as7^^A(()(%A5"),
        correctResult = false,
    )

    test(
        name = "When given empty string it should return false",
        result = isIPv4Valid(""),
        correctResult = false,
    )
}

fun test(name: String, result: Boolean, correctResult: Boolean) {
    if (correctResult == result) {
        println("Success - $name")
    } else {
        println("Failed - $name")
    }
}