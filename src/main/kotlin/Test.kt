package org.example

fun main() {
    test(
        name = "When given IPv4 with 4 segment separated with 3 dots" +
                " and each segment is between 0 and 255" +
                " it should return true",
        result = isIPv4Valid("192.168.1.0"),
        correctResult = true,
    )

    test(
        name = "When given IPv4 with 4 segment separated with 3 dots" +
                " and each segment is between 0 and 255 with extra space at the begin or the end" +
                " it should return true",
        result = isIPv4Valid(" 192.168.1.0 "),
        correctResult = true,
    )

    test(
        name = "When given IPv4 with just 4 segment separated with 3 dots" +
                " and each segment is between 0 and 255 but" +
                " have extra space between the segment numbers" +
                " it should return false",
        result = isIPv4Valid("192.1 68.1.0"),
        correctResult = false,
    )

    test(
        name = "When given IPv4 containing a segment out off range (0 and 255) it should return false",
        result = isIPv4Valid("192.256.-21.1"),
        correctResult = false,
    )

    test(
        name = "When given IPv4 containing a character in one of it's segment it should return false", //
        result = isIPv4Valid("192.1a8.1.1"),
        correctResult = false,
    )

    test(
        name = "When given IPv4 containing less than 4 segments it should return false",
        result = isIPv4Valid("192.1.1"),
        correctResult = false,
    )

    test(
        name = "When given IPv4 containing more than 4 segments it should return false",
        result = isIPv4Valid("192.168.5.1.1"),
        correctResult = false,
    )

    test(
        name = "When given IPv4 containing any segment has a leading zero it should return false",
        result = isIPv4Valid("192.005.1.1"),
        correctResult = false,
    )

    test(
        name = "When given IPv4 with 3 segment separated with 3 dots" +
                " it should return false",
        result = isIPv4Valid("192..1.1"),
        correctResult = false,
    )

    test(
        name = "When given IPv4 with random text it should return false",
        result = isIPv4Valid("^8as7^^A(()(%A5"),
        correctResult = false,
    )

    test(
        name = "When given empty input it should return false",
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