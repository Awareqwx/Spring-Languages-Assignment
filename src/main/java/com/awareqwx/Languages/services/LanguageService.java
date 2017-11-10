package com.awareqwx.Languages.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.awareqwx.Languages.models.Language;

@Service
public class LanguageService
{
    
    private ArrayList<Language> languages;

    public LanguageService()
    {
        languages = new ArrayList<Language>();
    }
    
    public void add(String name, String creator, String version)
    {
        languages.add(new Language(name, creator, version));
    }

    public void add(Language l)
    {
        languages.add(l);
    }
    
    public void remove(int i)
    {
        languages.remove(i);
    }
    
    public ArrayList<Language> allLanguages()
    {
        return languages;
    }

}
