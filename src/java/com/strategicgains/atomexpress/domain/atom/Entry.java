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
 * Bean for entry elements of an Atom feed.
 * 
 * @author toddf
 * @since 24 Feb 2011
 */
public class Entry
{
	private String xmlBase;
	private List<Person> authors;
	private List<Person> contributors;
	private List<Category> categories;
	private List<Content> contents;
	private String id;
	private Date published; // AKA issued
	private String rights;
	private Feed source;
	private Content summary;
	private Content title;
	private Date updated; // AKA modified
	private List<Link> alternateLinks;
	private List<Link> otherLinks;
	private List<String> foreignMarkup;

//	private List extensions;

//	private Date created; // Atom 0.3 only

	public Entry()
	{
		super();
	}
	
	public Entry(Entry that)
	{
		this();
		setXmlBase(that.xmlBase);
		addAllAuthors(that.authors);
		addAllContributors(that.contributors);
		addAllCategories(that.categories);
		addAllContents(that.contents);
		setId(that.id);
		setPublished(that.published);
		setRights(that.rights);
		setSource(that.source);
		setSummary(that.summary);
		setTitle(that.title);
		setUpdated(that.updated);
		addAllAlternateLinks(that.alternateLinks);
		addAllOtherLinks(that.otherLinks);
		addAllForeignMarkup(that.foreignMarkup);
	}

	public String getXmlBase()
	{
		return xmlBase;
	}

	public void setXmlBase(String xmlBase)
	{
		this.xmlBase = xmlBase;
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

    private void addContributor(Person contributor)
    {
    	if (contributor == null) return;
    	

		if (this.contributors == null)
		{
			this.contributors = new ArrayList<Person>();
		}
		
		this.contributors.add(new Person(contributor));
    }

	public List<Category> getCategories()
	{
		return (categories == null ? null : Collections.unmodifiableList(categories));
	}

	public void addAllCategories(List<Category> categories)
	{
		if (categories == null) return;

		for (Category category : categories)
		{
			addCategory(category);
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

	public List<Content> getContents()
	{
		return (contents == null ? null : Collections.unmodifiableList(contents));
	}

	public void addAllContents(List<Content> contents)
	{
		if (contents == null) return;
		
		for (Content content : contents)
		{
			addContent(content);
		}
	}

    public void addContent(Content content)
    {
    	if (content == null) return;
    	
    	if (this.contents == null)
    	{
    		this.contents = new ArrayList<Content>();
    	}
    	
    	this.contents.add(new Content(content));
    }

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public Date getPublished()
	{
		return (published == null ? null : new Date(published.getTime()));
	}

	public void setPublished(Date published)
	{
		this.published = (published == null ? null : new Date(published.getTime()));
	}

	public String getRights()
	{
		return rights;
	}

	public void setRights(String rights)
	{
		this.rights = rights;
	}

	public Feed getSource()
	{
		return (source == null ? null : new Feed(source));
	}

	public void setSource(Feed source)
	{
		this.source = (source == null ? null : new Feed(source));
	}

	public Content getSummary()
	{
		return (summary == null ? null : new Content(summary));
	}

	public void setSummary(Content summary)
	{
		this.summary = (summary == null ? null : new Content(summary));
	}

	public Content getTitle()
	{
		return (title == null ? null: new Content(title));
	}

	public void setTitle(Content title)
	{
		this.title = (title == null ? null: new Content(title));
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

	public List<String> getForeignMarkup()
	{
		return (foreignMarkup == null ? null : Collections.unmodifiableList(foreignMarkup));
	}

	public void addAllForeignMarkup(List<String> foreignMarkup)
	{
		if (foreignMarkup == null) return;
		
		for (String markup : foreignMarkup)
		{
			addForeignMarkup(markup);
		}
	}

    public void addForeignMarkup(String markup)
    {
    	if (markup == null) return;
    	
    	if (this.foreignMarkup == null)
    	{
    		this.foreignMarkup = new ArrayList<String>();
    	}
    	
    	this.foreignMarkup.add(markup);
    }
}
