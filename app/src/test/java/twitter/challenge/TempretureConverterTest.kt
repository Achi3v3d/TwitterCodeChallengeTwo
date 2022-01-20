package twitter.challenge

import com.example.twittercodechallengetwo.twitter.challenge.TemperatureConverter
import org.assertj.core.api.Assertions.assertThat
import org.assertj.core.api.Java6Assertions
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
class TemperatureConverterTests {
    @Test
    fun testCelsiusToFahrenheitConversion() {
        val precision = Java6Assertions.within(0.01f)
        assertThat(TemperatureConverter().celsiusToFahrenheit(-50f)).isEqualTo(-58f, precision)
        assertThat(TemperatureConverter().celsiusToFahrenheit(0f)).isEqualTo(32f, precision)
        assertThat(TemperatureConverter().celsiusToFahrenheit(10.0f)).isEqualTo(50f, precision)
        assertThat(TemperatureConverter().celsiusToFahrenheit(21.11f)).isEqualTo(70f, precision)
        assertThat(TemperatureConverter().celsiusToFahrenheit(37.78f)).isEqualTo(100f, precision)
        assertThat(TemperatureConverter().celsiusToFahrenheit(100f)).isEqualTo(212f, precision)
        assertThat(TemperatureConverter().celsiusToFahrenheit(1000f)).isEqualTo(1832f, precision)
    }
}
