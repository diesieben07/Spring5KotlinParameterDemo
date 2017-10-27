package de.take_weiland.spring5kotlinparameterdemo

import org.springframework.stereotype.Component
import org.springframework.validation.annotation.Validated
import javax.validation.Valid

/**
 * @author Take Weiland
 */
@Validated
@Component
class TestBean {

    fun myValidatingMethod(@Valid name: String): String {
        val s = "Hello $name!"
        println(s)
        return s
    }

    fun String.utilityMethod() = "Hello"

}