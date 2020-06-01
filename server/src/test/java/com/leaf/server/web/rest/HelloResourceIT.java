package com.leaf.server.web.rest;

import com.leaf.server.ServerApp;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
/**
 * Test class for the HelloResource REST controller.
 *
 * @see HelloResource
 */
@SpringBootTest(classes = ServerApp.class)
public class HelloResourceIT {

    private MockMvc restMockMvc;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        HelloResource helloResource = new HelloResource();
        restMockMvc = MockMvcBuilders
            .standaloneSetup(helloResource)
            .build();
    }

    /**
     * Test hi
     */
    @Test
    public void testHi() throws Exception {
        restMockMvc.perform(get("/api/hello/hi"))
            .andExpect(status().isOk());
    }
}
