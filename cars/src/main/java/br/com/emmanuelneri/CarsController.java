package br.com.emmanuelneri;

import com.google.common.collect.ImmutableMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/cars")
public class CarsController {
	private static final Map<Long, String> CARS = ImmutableMap.of(
            1L, "Car 1",
            2L, "Car 2",
            3L, "Car 3",
            4L, "Car 4");
	
	@GetMapping
	public List<String> findAll() {
		return new ArrayList<>(CARS.values());
	}

    @GetMapping(path = "/{id}")
    public String findById(@PathVariable("id") Long id) {
        return CARS.get(id);
    }
	
}
