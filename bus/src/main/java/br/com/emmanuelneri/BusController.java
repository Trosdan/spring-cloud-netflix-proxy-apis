package br.com.emmanuelneri;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.ImmutableMap;

@RestController
@RequestMapping("/bus")
public class BusController {
	private static final Map<Long, String> BUS = ImmutableMap.of(
            1L, "Bus 1",
            2L, "Bus 2",
            3L, "Bus 3",
            4L, "Bus 4");
	
	@GetMapping
	public List<String> findAll() {
		return new ArrayList<>(BUS.values());
	}

    @GetMapping(path = "/{id}")
    public String findById(@PathVariable("id") Long id) {
        return BUS.get(id);
    }
}
