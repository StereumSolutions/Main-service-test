package hr.hyperdeltait.gmsservice_main.IntegrationTests;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class PricingControllerTests {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper objectMapper;

    //String adminToken = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTY2MjU2Nzc1OSwiaWF0IjoxNjYxOTYyOTU5LCJhdXRob3JpdGllcyI6IlJPTEVfQURNSU4ifQ.lPYc6dZbQaCG3amPBYzV7OQUBomcVDqF3tNlP9_B-1u-WBMcLHJLXPgLhHGsAJ3_iBvY6Jg_JxKGuhc0niiUPQ";

    @Test
    void findAll() throws Exception {
        this.mvc.perform(
                        get("/pricing"))

                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
    }

    /*
        Check ID if fail
     */
    @Test
    void findByID() throws Exception {
        this.mvc.perform(
                        get("/pricing/1"))

                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
    }

    @Test
    void findByIDFail() throws Exception {
        this.mvc.perform(
                        get("/pricing/XDDDD"))

                .andExpect(status().isBadRequest());
    }
}