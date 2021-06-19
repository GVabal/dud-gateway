package dev.vabalas.dudgateway.rest;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestController {
  private final RestTemplate restTemplate;

  public TestController(RestTemplate restTemplate) {
    this.restTemplate = restTemplate;
  }

  @GetMapping
  public String hello() {
    return "Hello from dud-gateway";
  }

  @GetMapping(path = "hello-reader")
  public ResponseEntity<Integer> helloReader() {
    return restTemplate.exchange("http://localhost:8010", HttpMethod.GET, null, Integer.class);
  }
}
