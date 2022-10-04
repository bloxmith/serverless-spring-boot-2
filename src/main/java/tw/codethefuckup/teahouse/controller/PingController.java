package tw.codethefuckup.teahouse.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

@EnableWebMvc
@RestController("/")
public class PingController {

	@GetMapping(path = "ping")
	public Map<String, String> ping() {
		Map<String, String> pong = new HashMap<>();
		pong.put("pong", "Hello, World!");
		return pong;
	}

	@PostMapping(path = "ping")
	public String ping(HttpServletRequest request) {
		return request.getServerName();
	}
}
