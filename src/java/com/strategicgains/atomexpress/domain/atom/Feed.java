/*
 * Copyright 2011 Strategic Gains, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.strategicgains.atomexpress.domain.atom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Bean for Atom feeds.
 * 
 * @author toddf
 */
public class Feed
{
	private String xmlBase;
	private List<Category> categories;
	private List<Person> authors;
	private List<Person> contributors;
	private Generator generator;
	private String icon;
	private String id;
	private String logo;
	private String rights; // AKA copyright
	private Content subtitle; // AKA tagline
	private Content title;
	private Date updated; // AKA modified
	private List<Link> alternateLinks;
	private List<Link> otherLinks;
	private List<Entry> entries;

	// private List extensions;

	// private Content info; // Atom 0.3 only
	// private String language; // Atom 0.3 only

	public Feed()
	{
		super();
	}
	
	public Feed(Feed that)
	{
		this();
		this.xmlBase = that.xmlBase;
		addAllCategories(that.categories);
		addAllAuthors(that.authors);
		addAllContributors(that.contributors);
		setGenerator(that.generator);
		setIcon(that.icon);
		setId(that.id);
		setLogo(that.logo);
		setRights(that.rights);
		setSubtitle(that.subtitle);
		setTitle(that.title);
		setUpdated(that.updated);
		addAllAlternateLinks(that.alternateLinks);
		addAllOtherLinks(that.otherLinks);
		addAllEntries(that.entries);
	}

	public String getXmlBase()
	{
		return xmlBase;
	}

	public void setXmlBase(String xmlBase)
	{
		this.xmlBase = xmlBase;
	}

	public List<Category> getCategories()
	{
		return (categories == null ? null : Collections.unmodifiableList(categories));
	}

	public void addAllCategories(List<Category> categories)
	{
		if (categories == null) return;

		for (Category cat : categories)
		{
			addCategory(cat);
		}
	}

    public void addCategory(Category category)
    {
    	if (category == null) return;
    	
    	if (this.categories == null)
    	{
    		this.categories = new ArrayList<Category>();
    	}
    	
    	this.categories.add(new Category(category));
    }

	public List<Person> getAuthors()
	{
		return (authors == null ? null : Collections.unmodifiableList(authors));
	}

	public void addAllAuthors(List<Person> authors)
	{
		if (authors == null) return;

		for (Person author : authors)
		{
			addAuthor(author);
		}
	}

    public void addAuthor(Person author)
    {
    	if (author == null) return;
    	
    	if (this.authors == null)
    	{
    		this.authors = new ArrayList<Person>();
    	}
    	
    	this.authors.add(new Person(author));
    }

	public List<Person> getContributors()
	{
		return (contributors == null ? null : Collections.unmodifiableList(contributors));
	}

	public void addAllContributors(List<Person> contributors)
	{
		if (contributors == null) return;
		
		for (Person contributor : contributors)
		{
			addContributor(contributor);
		}
	}

    public void addContributor(Person contributor)
    {
    	if (contributor == null) return;
    	
    	if (this.contributors == null)
    	{
    		this.contributors = new ArrayList<Person>();
    	}
    	
    	this.contributors.add(new Person(contributor));
    }

	public Generator getGenerator()
	{
		return (generator == null ? null : new Generator(generator));
	}

	public void setGenerator(Generator generator)
	{
		this.generator = (generator == null ? null : new Generator(generator));
	}

	public String getIcon()
	{
		return icon;
	}

	public void setIcon(String icon)
	{
		this.icon = icon;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getLogo()
	{
		return logo;
	}

	public void setLogo(String logo)
	{
		this.logo = logo;
	}

	public String getRights()
	{
		return rights;
	}

	public void setRights(String rights)
	{
		this.rights = rights;
	}

	public Content getSubtitle()
	{
		return (subtitle == null ? null : new Content(subtitle));
	}

	public void setSubtitle(Content subtitle)
	{
		this.subtitle = (subtitle == null ? null : new Content(subtitle));
	}

	public Content getTitle()
	{
		return (title == null ? null : new Content(title));
	}

	public void setTitle(Content title)
	{
		this.title = (title == null ? null : new Content(title));
	}

	public Date getUpdated()
	{
		return (updated == null ? null : new Date(updated.getTime()));
	}

	public void setUpdated(Date updated)
	{
		this.updated = (updated == null ? null : new Date(updated.getTime()));
	}

	public List<Link> getAlternateLinks()
	{
		return (alternateLinks == null ? null : Collections.unmodifiableList(alternateLinks));
	}

	public void addAllAlternateLinks(List<Link> alternateLinks)
	{
		if (alternateLinks == null) return;
		
		for (Link link : alternateLinks)
		{
			addAlternateLink(link);
		}
	}

    public void addAlternateLink(Link link)
    {
    	if (link == null) return;
    	
    	if (this.alternateLinks == null)
    	{
    		this.alternateLinks = new ArrayList<Link>();
    	}
    	
    	this.alternateLinks.add(new Link(link));
    }

	public List<Link> getOtherLinks()
	{
		return (otherLinks == null ? null : Collections.unmodifiableList(otherLinks));
	}

	public void addAllOtherLinks(List<Link> otherLinks)
	{
		if (otherLinks == null) return;
		
		for (Link link : otherLinks)
		{
			addOtherLink(link);
		}
	}

    public void addOtherLink(Link link)
    {
    	if (link == null) return;
    	
    	if (this.otherLinks == null)
    	{
    		this.otherLinks = new ArrayList<Link>();
    	}
    	
    	this.otherLinks.add(new Link(link));
    }

	public List<Entry> getEntries()
	{
		return (entries == null ? null : Collections.unmodifiableList(entries));
	}

	public void addAllEntries(List<Entry> entries)
	{
		if (entries == null) return;
		
		for (Entry entry : entries)
		{
			addEntry(entry);
		}
	}

    public void addEntry(Entry entry)
    {
    	if (entry == null) return;
    	
    	if (this.entries == null)
    	{
    		this.entries = new ArrayList<Entry>();
    	}
    	
    	this.entries.add(new Entry(entry));
    }
}
