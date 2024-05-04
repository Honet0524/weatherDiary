package zerobase.weather;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

// import할때 junit인지 확인 잘 할것.(필요한 라이브러리인지 확인할것)
@SpringBootTest
class WeatherApplicationTests {

	@Test
	void equalTest() {
		assertEquals(1, 1);
	}

	@Test
	void nullTest() {
		assertNull(null);
	}

	@Test
	void trueTest() {
		assertTrue(1 == 1);
	}
}
