package com.jennerdulce.songr;

import com.jennerdulce.songr.models.Album;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@SpringBootTest
@AutoConfigureMockMvc
class SongrApplicationTests {

	@Autowired
	MockMvc mockMvc;

	@Test
	public void album_test()
	{
		Album sut = new Album("Acid Rap", "Chance The Rapper", 14, 3234, "images/AcidRap.jpeg");

		assertEquals("Acid Rap", sut.getTitle());
		assertEquals(14, sut.getSongCount());
	}

	@Test
	public void render_app() throws Exception
	{
		mockMvc.perform(get("/albums"))
				.andDo(print())  // shows output on server console for debugging
				.andExpect(content().string(containsString("<h1>Songr</h1>")))
				.andExpect(status().isOk());
	}

}
