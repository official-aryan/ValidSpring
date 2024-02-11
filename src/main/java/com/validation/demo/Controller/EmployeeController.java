package com.validation.demo.Controller;

import com.validation.demo.Entity.Employee;
import com.validation.demo.Payload.EmployeeDto;
import com.validation.demo.Respository.EmployeeRepository;
import jakarta.validation.Valid;

import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    EmployeeRepository repo;

    public EmployeeController(EmployeeRepository repo) {
        this.repo = repo;
    }

//    private ModelMapper modelMapper;
//
//    public EmployeeController(ModelMapper modelMapper) {
//        this.modelMapper = modelMapper;
//    }

    @PostMapping
    // http://localhost:8080/api/employee
    public ResponseEntity<EmployeeDto> saveEmployee(@Valid @RequestBody EmployeeDto employeeDto)
    {
        Employee e=new Employee();
        e.setId(employeeDto.getId());
        e.setName(employeeDto.getName());
        e.setEmail(employeeDto.getEmail());
        e.setMobile(employeeDto.getMobile());

        Employee save = repo.save(e);

        EmployeeDto dto = new EmployeeDto();
        dto.setId(save.getId());
        dto.setName(save.getName());
        dto.setEmail(save.getEmail());
        dto.setMobile(save.getMobile());

        return new ResponseEntity<>(dto,HttpStatus.CREATED);
    }

//    Employee maptoentity(EmployeeDto employeeDto)
//    {
//        Employee map = modelMapper.map(employeeDto, Employee.class);
//        return map;
//    }
//    EmployeeDto maptodto(Employee employee)
//    {
//        EmployeeDto dto = modelMapper.map(employee, EmployeeDto.class);
//        return dto;
//    }
    


}
