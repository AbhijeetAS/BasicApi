package com.project.firstspringproject.controller;


import org.springframework.web.bind.annotation.*;

@RestController
public class MyController {
   @GetMapping("/get")
    public String home()
    {
        return "hello from the home";
    };

   @PostMapping("/post")
    public String take()
   {
       return "hello from the take method";
   }

   @PutMapping("/update")
   public String update()
   {
       return "hello from the update method";
   }


   @DeleteMapping("/delete")
   public String delete()
   {
       return "hello from the delete method";
   }

}
