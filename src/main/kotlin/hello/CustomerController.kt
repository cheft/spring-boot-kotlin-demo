package hello

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/customers")
class CustomerController(private val repository: CustomerRepository) {

    @GetMapping
    fun findAll() = repository.findAll()

    @GetMapping("/{lastName}")
    fun findByLastName(@PathVariable lastName: String) = repository.findByLastName(lastName)

    @PostMapping
    fun save() = repository.findAll()

    @DeleteMapping("/{firstName}")
    fun del(@PathVariable firstName: String) = Customer(firstName, "Chen")
}
