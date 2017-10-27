package de.take_weiland.spring5kotlinparameterdemo

import org.hamcrest.Matchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.annotation.Configuration
import org.springframework.test.context.junit4.SpringRunner

/**
 * @author Take Weiland
 */
@RunWith(SpringRunner::class)
@SpringBootTest
class ExampleTest {

    @Autowired
    private lateinit var bean: TestBean

    @Test
    fun testValidation() {
        assertThat(bean.myValidatingMethod("World"), `is`("Hello World!"))
    }

    @Configuration
    @SpringBootApplication
    class Config

}