package com.awareqwx.Languages.models;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

public class Language
{

    @Size(min=2, max=20)
    private String name;
    @Size(min=2, max=20)
    private String creator;
    @NotEmpty
    private String version;
    
    public Language()
    {
    }

    public Language(String name, String creator, String version)
    {
        this.name = name;
        this.creator = creator;
        this.version = version;
    }
    
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    public String getCreator()
    {
        return creator;
    }
    public void setCreator(String creator)
    {
        this.creator = creator;
    }

    public String getVersion()
    {
        return version;
    }
    public void setVersion(String version)
    {
        this.version = version;
    }

}
