package org.example


fun main() {
}

fun isIPv4Valid(ip: String): Boolean {
    val segmentList = ip.trim().split('.')
    if (segmentList.size != 4) {
        return false
    }
    segmentList.forEach { segment ->
        if (segment.isBlank()) return false

        if (segment.length != 1 && segment[0] == '0') {
            return false
        }

        try {
            if (segment.toInt() !in 0..255) {
                return false
            }
        } catch (e: NumberFormatException) {
            return false
        }
    }
    return true
}
