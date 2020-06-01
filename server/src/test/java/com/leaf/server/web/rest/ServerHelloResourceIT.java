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
 * Test class for the ServerHelloResource REST controller.
 *
 * @see ServerHelloResource
 */
@SpringBootTest(classes = ServerApp.class)
public class ServerHelloResourceIT {

    private MockMvc restMockMvc;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        ServerHelloResource serverHelloResource = new ServerHelloResource();
        restMockMvc = MockMvcBuilders
            .standaloneSetup(serverHelloResource)
            .build();
    }

    /**
     * Test hi
     */
    @Test
    public void testHi() throws Exception {
        restMockMvc.perform(get("/api/server-hello/hi"))
            .andExpect(status().isOk());
    }
}
