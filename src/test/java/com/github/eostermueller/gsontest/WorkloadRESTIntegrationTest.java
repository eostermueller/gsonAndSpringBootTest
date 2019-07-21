package com.github.eostermueller.gsontest;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;

import java.net.URI;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockServletContext;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * @stolenFrom: https://www.concretepage.com/spring-5/extendwith-springextension-spring-test
 * @author erikostermueller
 *
 */
@SpringBootTest(classes = com.github.eostermueller.gsontest.WorkloadController.class)
public class WorkloadRESTIntegrationTest {

    @Autowired
    protected WebApplicationContext webAppContext;
 
    private MockMvc mockMvc;
 
    @BeforeEach
    public void setup() {
        mockMvc = webAppContextSetup(webAppContext).build();
    }
    @Test
    public void webAppContextTest() throws Exception {
    	assertTrue(webAppContext.getServletContext() instanceof MockServletContext);
    }
    @Test
    public void canGetWorkload1111111() throws Exception {
        URI uri = UriComponentsBuilder.fromUriString("/traffic/workload")
        		.build().encode().toUri();
    	
        mockMvc.perform(
	 			   get(uri)
	 				.contentType(MediaType.APPLICATION_JSON_VALUE)
	 				.accept(MediaType.APPLICATION_JSON)
	 				.characterEncoding("UTF-8")
	 		)
//        .andDo( MockMvcResultHandlers.print() )
        ;
    }
    
    
}