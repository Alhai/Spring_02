package com.example.demo.Heros;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class HeroController {
    @GetMapping("/all")
    public String getListTemplate(Model model){
        CrudService crudService = new CrudService();
        return crudService.getListHero(model);
    }


    @GetMapping("/create")
    public String getFormCreate(Model model){
        CrudService crudService = new CrudService();
     return crudService.getFormCreate(model);
    }

    @PostMapping("/create")
    public String createHero( @ModelAttribute("heroForm") HeroForm heroForm ){
        CrudService crudService = new CrudService();
        return crudService.createHero(heroForm);
    }
/*    @GetMapping("/{id}")
    public String getHeroById(int id){
        CrudService crudService = new CrudService();
        return  crudService.getHeroById(id);
    }*/

/*    @DeleteMapping("/all/{id}")
    public Hero deleteHero(@PathVariable int id){
    CrudService crudService = new CrudService();
    return crudService.deleteOneHero(id);
    }*/


}
