package com.example.myproject.controller;

import com.example.myproject.dao.DeptRepository;
import com.example.myproject.entity.Dept01;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/dept01")
public class DeptController {
    @Autowired
    private DeptRepository deptRepository;
    @GetMapping("/findAll/{page}/{size}")
    public Page<Dept01> findAll(@PathVariable("page")Integer page, @PathVariable("size")Integer size){
        PageRequest request=PageRequest.of(page,size);
        return deptRepository.findAll(request);
    }
    @PostMapping("/save")
    public String save(@RequestBody Dept01 dept01){
        Dept01 result=deptRepository.save(dept01);
        if(result!=null){
            return "success";
        }else {
            return "error";
        }
    }
    @GetMapping("/findById/{deptno}")
    public Dept01 findById(@PathVariable("deptno") Integer deptno){
        return  deptRepository.findById(deptno).get();
    }
    @PutMapping("/update")
    public String update(@RequestBody Dept01 dept01){
        Dept01 result=deptRepository.save(dept01);
        if (result!=null){
            return "success";
        }else {
            return "error";
        }
    }

    @DeleteMapping("/delete/{deptno}")
    public void delete(@PathVariable("deptno")Integer deptno){
        deptRepository.deleteById(deptno);
    }
}
