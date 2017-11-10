package com.awareqwx.Languages.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.awareqwx.Languages.models.Language;
import com.awareqwx.Languages.services.LanguageService;

@Controller
public class LanguageController
{

    private LanguageService languageService;

    public LanguageController()
    {
        languageService = new LanguageService();
        languageService.add("Java", "Oracle", "8.1");
        languageService.add("C#", "Microsoft", "???");
        languageService.add("Crystal", "KnightCode", "4.56.3");
    }

    @RequestMapping("/languages")
    public String index(Model model)
    {
        model.addAttribute("language", new Language());
        model.addAttribute("languages", languageService.allLanguages());
        return "index.jsp";
    }

    @PostMapping("/languages/add")
    public String add(@Valid @ModelAttribute("language") Language l, BindingResult result, Model model)
    {
        if (result.hasErrors())
        {
            model.addAttribute("languages", languageService.allLanguages());
            return "index.jsp";
        } else
        {
            languageService.add(l);
            return "redirect:/languages/" + (languageService.allLanguages().size() - 1);
        }
    }

    @RequestMapping("/languages/delete/{index}")
    public String delete(@PathVariable("index") int index)
    {
        languageService.remove(index);
        return "redirect:/languages";
    }

    @RequestMapping("/languages/{index}")
    public String show(@PathVariable("index") int index, Model model)
    {
        model.addAttribute("index", index);
        model.addAttribute("language", languageService.allLanguages().get(index));
        return "show.jsp";
    }

    @RequestMapping("/languages/edit/{index}")
    public String edit(@PathVariable("index") int index, Model model)
    {
        model.addAttribute("index", index);
        model.addAttribute("oldLanguage", languageService.allLanguages().get(index));
        model.addAttribute("newLanguage", new Language());
        return "edit.jsp";
    }

    @PostMapping("/languages/update/{index}")
    public String update(@PathVariable("index") int index, @Valid @ModelAttribute("newLanguage") Language l,
            BindingResult result, Model model)
    {
        if (result.hasErrors())
        {
            model.addAttribute("oldLanguage", languageService.allLanguages().get(index));
            model.addAttribute("newLanguage", new Language());
            return "edit.jsp";
        } else
        {
            languageService.allLanguages().set(index, l);
            return "redirect:/languages/" + index;
        }
    }

}
