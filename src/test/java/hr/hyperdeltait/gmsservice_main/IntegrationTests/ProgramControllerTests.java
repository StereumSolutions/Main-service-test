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




import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import hr.hyperdeltait.gmsservice_main.Base.Models.Classes.Program;
import hr.hyperdeltait.gmsservice_main.Base.Models.Commands.ProgramCommand;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

//import javax.transaction.Transactional;
import java.time.LocalDate;

//import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.csrf;
//import static org.springframework.security.test.web.servlet.request.SecurityMockMvcRequestPostProcessors.user;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;


@SpringBootTest
@AutoConfigureMockMvc
class ProgramControllerTests {

    @Autowired
    private MockMvc mvc;

    @Autowired
    private ObjectMapper objectMapper;

    //String adminToken = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJhZG1pbiIsImV4cCI6MTY2MjU2Nzc1OSwiaWF0IjoxNjYxOTYyOTU5LCJhdXRob3JpdGllcyI6IlJPTEVfQURNSU4ifQ.lPYc6dZbQaCG3amPBYzV7OQUBomcVDqF3tNlP9_B-1u-WBMcLHJLXPgLhHGsAJ3_iBvY6Jg_JxKGuhc0niiUPQ";

    final String TEST_NAME = "placeholderName";
    final String TEST_DESCRIPTION = "placeholderDescription";
    final String TEST_IMAGE = "placeholderImage";
    ProgramCommand programCommand = new ProgramCommand(TEST_NAME, TEST_DESCRIPTION, TEST_IMAGE);


    @Test
    void findAll() throws Exception {
        this.mvc.perform(
                        get("/program"))

                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
    }

    /*
        Check ID if fail
     */
    @Test
    void findByID() throws Exception {
        this.mvc.perform(
                        get("/program/1"))

                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8));
    }

    @Test
    void findByIDFail() throws Exception {
        this.mvc.perform(
                        get("/program/XDDDD"))

                .andExpect(status().isBadRequest());
    }

}