package ru.alfabank.currencyrates

import spock.lang.Specification
import spock.lang.Unroll

class FormatUtilsTest2 extends Specification {

    @Unroll
    def "format #initAmount to #expect"() {
        expect:
            FormatUtils.formatAmount(initAmount) == expect
        where:
            initAmount || expect
            "10.11"    || "10.11"
            "10.11"    || "10.11"
            "10.11"    || "10.11"
            "10.11"    || "10.11"
            "10.11"    || "10.11"
            "10.11"    || "10.11"
            "10.11"    || "10.11"
            null       || null
    }
}
