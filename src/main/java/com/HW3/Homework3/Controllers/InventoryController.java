package com.HW3.Homework3.Controllers;
import com.HW3.Homework3.Models.InventoryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class InventoryController {
    @Autowired
    InventoryRepo inventoryRepo;

    @RequestMapping("/")
    public ModelAndView doHome(){
        ModelAndView ModelView = new ModelAndView("style");
        ModelView.addObject("inventorylist", inventoryRepo.findAll());

        return ModelView;
    }

}
