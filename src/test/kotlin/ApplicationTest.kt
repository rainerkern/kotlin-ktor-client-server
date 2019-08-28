package at.rainerkern.ktor

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test


internal class ApplicationTest {

    @Test fun `Can execute Api call`() {
        assertThat(apiCall()).isEqualTo(
            """{"id":1,"name":"test entity"}"""
        )
    }
}
