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

	public Feed setXmlBase(String xmlBase)
	{
		this.xmlBase = xmlBase;
		return this;
	}

	public List<Category> getCategories()
	{
		return (categories == null ? null : Collections.unmodifiableList(categories));
	}

	public Feed addAllCategories(List<Category> categories)
	{
		if (categories == null) return this;

		for (Category cat : categories)
		{
			addCategory(cat);
		}

		return this;
	}

    public Feed addCategory(Category category)
    {
    	if (category == null) return this;
    	
    	if (this.categories == null)
    	{
    		this.categories = new ArrayList<Category>();
    	}
    	
    	this.categories.add(new Category(category));
		return this;
    }

	public List<Person> getAuthors()
	{
		return (authors == null ? null : Collections.unmodifiableList(authors));
	}

	public Feed addAllAuthors(List<Person> authors)
	{
		if (authors == null) return this;

		for (Person author : authors)
		{
			addAuthor(author);
		}

		return this;
	}

    public Feed addAuthor(Person author)
    {
    	if (author == null) return this;
    	
    	if (this.authors == null)
    	{
    		this.authors = new ArrayList<Person>();
    	}
    	
    	this.authors.add(new Person(author));
		return this;
    }

	public List<Person> getContributors()
	{
		return (contributors == null ? null : Collections.unmodifiableList(contributors));
	}

	public Feed addAllContributors(List<Person> contributors)
	{
		if (contributors == null) return this;

		for (Person contributor : contributors)
		{
			addContributor(contributor);
		}

		return this;
	}

    public Feed addContributor(Person contributor)
    {
    	if (contributor == null) return this;
    	
    	if (this.contributors == null)
    	{
    		this.contributors = new ArrayList<Person>();
    	}
    	
    	this.contributors.add(new Person(contributor));
		return this;
    }

	public Generator getGenerator()
	{
		return (generator == null ? null : new Generator(generator));
	}

	public Feed setGenerator(Generator generator)
	{
		this.generator = (generator == null ? null : new Generator(generator));
		return this;
	}

	public String getIcon()
	{
		return icon;
	}

	public Feed setIcon(String icon)
	{
		this.icon = icon;
		return this;
	}

	public String getId()
	{
		return id;
	}

	public Feed setId(String id)
	{
		this.id = id;
		return this;
	}

	public String getLogo()
	{
		return logo;
	}

	public Feed setLogo(String logo)
	{
		this.logo = logo;
		return this;
	}

	public String getRights()
	{
		return rights;
	}

	public Feed setRights(String rights)
	{
		this.rights = rights;
		return this;
	}

	public Content getSubtitle()
	{
		return (subtitle == null ? null : new Content(subtitle));
	}

	public Feed setSubtitle(Content subtitle)
	{
		this.subtitle = (subtitle == null ? null : new Content(subtitle));
		return this;
	}

	public Content getTitle()
	{
		return (title == null ? null : new Content(title));
	}

	public Feed setTitle(Content title)
	{
		this.title = (title == null ? null : new Content(title));
		return this;
	}

	public Date getUpdated()
	{
		return (updated == null ? null : new Date(updated.getTime()));
	}

	public Feed setUpdated(Date updated)
	{
		this.updated = (updated == null ? null : new Date(updated.getTime()));
		return this;
	}

	public List<Link> getAlternateLinks()
	{
		return (alternateLinks == null ? null : Collections.unmodifiableList(alternateLinks));
	}

	public Feed addAllAlternateLinks(List<Link> alternateLinks)
	{
		if (alternateLinks == null) return this;

		for (Link link : alternateLinks)
		{
			addAlternateLink(link);
		}

		return this;
	}

    public Feed addAlternateLink(Link link)
    {
    	if (link == null) return this;
    	
    	if (this.alternateLinks == null)
    	{
    		this.alternateLinks = new ArrayList<Link>();
    	}
    	
    	this.alternateLinks.add(new Link(link));
		return this;
    }

	public List<Link> getOtherLinks()
	{
		return (otherLinks == null ? null : Collections.unmodifiableList(otherLinks));
	}

	public Feed addAllOtherLinks(List<Link> otherLinks)
	{
		if (otherLinks == null) return this;

		for (Link link : otherLinks)
		{
			addOtherLink(link);
		}

		return this;
	}

    public Feed addOtherLink(Link link)
    {
    	if (link == null) return this;
    	
    	if (this.otherLinks == null)
    	{
    		this.otherLinks = new ArrayList<Link>();
    	}
    	
    	this.otherLinks.add(new Link(link));
		return this;
    }

	public List<Entry> getEntries()
	{
		return (entries == null ? null : Collections.unmodifiableList(entries));
	}

	public Feed addAllEntries(List<Entry> entries)
	{
		if (entries == null) return this;

		for (Entry entry : entries)
		{
			addEntry(entry);
		}

		return this;
	}

    public Feed addEntry(Entry entry)
    {
    	if (entry == null) return this;
    	
    	if (this.entries == null)
    	{
    		this.entries = new ArrayList<Entry>();
    	}
    	
    	this.entries.add(new Entry(entry));
		return this;
    }
}
