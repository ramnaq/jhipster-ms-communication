package com.leaf.chttps://github.com/Leaf-Agriculture/fields-service/blob/dev/src/main/java/com/leaf/fields/service/ClimateFieldViewCredentialsClient.javalient.web.rest;

import com.leaf.client.ClientApp;
import com.leaf.client.service.ServerClient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
/**
 * Test class for the HelloResource REST controller.
 *
 * @see Resource
 */
@SpringBootTest(classes = ClientApp.class)
public class RestControllerIT {

    private MockMvc restMockMvc;

    @Autowired
    private ServerClient client;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.initMocks(this);

        Resource resource = new Resource(client);
        restMockMvc = MockMvcBuilders
            .standaloneSetup(resource)
            .build();
    }

    /**
     * Test helloAction
     */
    @Test
    public void testHelloAction() throws Exception {
        restMockMvc.perform(get("/api/hello/hello-action"))
            .andExpect(status().isOk());
    }

    /**
     * Test getSomethingCoolFromServer
     */
    @Test
    public void testGetSomethingCoolFromServer() throws Exception {
        restMockMvc.perform(get("/api/hello/get-something-cool-from-server"))
            .andExpect(status().isOk());
    }
}
