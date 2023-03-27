package dev.hvpaiva.smart.shopper.market

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class SumKtTest {

    @Test
    fun `should sum two numbers`() {
        val a = 1
        val b = 2
        val added = sum(a, b)
        assertAll(
            { assertThat(added).isEqualTo(3) },
        )
    }
}

