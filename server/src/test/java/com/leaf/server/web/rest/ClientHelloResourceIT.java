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
 * Test class for the ClientHelloResource REST controller.
 *
 * @see ClientHelloResource
 */
@SpringBootTest(classes = ServerApp.class)
public class ClientHelloResourceIT {

    private MockMvc restMockMvc;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        ClientHelloResource clientHelloResource = new ClientHelloResource();
        restMockMvc = MockMvcBuilders
            .standaloneSetup(clientHelloResource)
            .build();
    }

    /**
     * Test sayHiToServer
     */
    @Test
    public void testSayHiToServer() throws Exception {
        restMockMvc.perform(get("/api/client-hello/say-hi-to-server"))
            .andExpect(status().isOk());
    }
}
