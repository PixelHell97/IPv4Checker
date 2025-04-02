package org.example

fun main() {
    test(
        name = "When given IPv4 in a valid format it should return true",
        result = isIPv4Valid("192.168.1.1"),
        correctResult = true,
    )

    test(
        name = "When given IPv4 has a segment with just zero it should return false",
        result = isIPv4Valid("192.256.1.0"),
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
        name = "When given IPv4 has a missing one segment it should return false",
        result = isIPv4Valid("192.1.1"),
        correctResult = false,
    )

    test(
        name = "When given IPv4 has an extra segment it should return false",
        result = isIPv4Valid("192.168.5.1.1"),
        correctResult = false,
    )

    test(
        name = "When given IPv4 with segment has a one leading zero it should return false",
        result = isIPv4Valid("192.05.1.1"),
        correctResult = false,
    )

    test(
        name = "When given IPv4 with segment has a leading zeros it should return false",
        result = isIPv4Valid("192.005.1.1"),
        correctResult = false,
    )

    test(
        name = "When given string with symbols it should return false",
        result = isIPv4Valid("^8as7^^A(()(%A5"),
        correctResult = false,
    )

    test(
        name = "When given string with couple of spaces it should return false",
        result = isIPv4Valid("   "),
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