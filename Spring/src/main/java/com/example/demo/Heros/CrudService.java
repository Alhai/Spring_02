package com.example.demo.Heros;

import org.springframework.boot.Banner;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CrudService {

    private static List<Hero> listHero = new ArrayList<>();

    static {
        listHero.add(new Hero(1, "Francis", 5, "Mage"));
    }

    /*      private String listHeros(Model model){
              model.addAttribute("list", Arrays.asList(
                      new Hero(1,"Francis",5, "Mage")
              ));
              return "list";
          }*/
    public String getListHero(Model model) {
        model.addAttribute("heros", listHero);
        return "list";
    }

    public String getFormCreate(Model model) {

        HeroForm heroForm = new HeroForm();
        model.addAttribute("heroForm", heroForm);
        return "create";
    }

    public String createHero(@ModelAttribute("heroForm") HeroForm heroForm) {
        int id = heroForm.getId();
        String name = heroForm.getName();
        int hp = heroForm.getHp();
        String type = heroForm.getType();

        Hero newHero = new Hero(id, name, hp, type);
        listHero.add(newHero);
        return "redirect:/all";
    }

    public Hero getHeroById(int id) {
        for (Hero findHero : listHero) {
            if (findHero.getId() == id)
                return findHero;
        }
        return null;
    }

/*    public Hero deleteOneHero(int id){
        Iterator<Hero> iterator = listHero.iterator();
        while (iterator.hasNext()){
            Hero hero = iterator.next();
            if(hero.getId() == id){
               iterator.remove();
               return hero;
            }
        }
        return null;
    }*/

}
