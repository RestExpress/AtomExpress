/*
    Copyright 2011, Strategic Gains, Inc.

	Licensed under the Apache License, Version 2.0 (the "License");
	you may not use this file except in compliance with the License.
	You may obtain a copy of the License at

		http://www.apache.org/licenses/LICENSE-2.0

	Unless required by applicable law or agreed to in writing, software
	distributed under the License is distributed on an "AS IS" BASIS,
	WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
	See the License for the specific language governing permissions and
	limitations under the License.
 */
package com.strategicgains.atomexpress.domain.rss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Bean for items of RSS feeds.
 * 
 * @author toddf
 */
public class Item
{
	private String title;
	private String link;
	private String uri;
	private Description description;
	private Content content;
	private Source source;
	private List<Enclosure> enclosures;
	private List<Category> categories;
	private Guid guid;
	private String comments;
	private String author;
	private Date pubDate;
	private Date expirationDate;
	private List<String> modules;
	private List<String> foreignMarkup;

	
	public Item()
    {
	    super();
    }

	public Item(Item that)
	{
		this();
		
		if (that == null) return;
		
		setTitle(that.title);
		setLink(that.link);
		setUri(that.uri);
		setDescription(that.description);
		setContent(that.content);
		setSource(that.source);
		addAllEnclosures(that.enclosures);
		addAllCategories(that.categories);
		setGuid(that.guid);
		setComments(that.comments);
		setAuthor(that.author);
		setPubDate(that.pubDate);
		setExpirationDate(that.expirationDate);
		addAllModules(that.modules);
		addAllForeignMarkup(that.foreignMarkup);
	}

	public String getTitle()
	{
		return title;
	}

	public Item setTitle(String title)
	{
		this.title = title;
		return this;
	}

	public String getLink()
	{
		return link;
	}

	public Item setLink(String link)
	{
		this.link = link;
		return this;
	}

	public String getUri()
	{
		return uri;
	}

	public Item setUri(String uri)
	{
		this.uri = uri;
		return this;
	}

	public Description getDescription()
	{
		return new Description(description);
	}

	public Item setDescription(Description description)
	{
		this.description = new Description(description);
		return this;
	}

	public Content getContent()
	{
		return new Content(content);
	}

	public Item setContent(Content content)
	{
		this.content = new Content(content);
		return this;
	}

	public Source getSource()
	{
		return new Source(source);
	}

	public Item setSource(Source source)
	{
		this.source = new Source(source);
		return this;
	}

	public List<Enclosure> getEnclosures()
	{
		return (enclosures == null ? null : Collections.unmodifiableList(enclosures));
	}

	public Item addAllEnclosures(List<Enclosure> enclosures)
	{
		if (enclosures == null) return this;

		for (Enclosure enclosure : enclosures)
		{
			addEnclosure(enclosure);
		}

		return this;
	}
	
	public Item addEnclosure(Enclosure enclosure)
	{
		if (enclosures == null)
		{
			enclosures = new ArrayList<Enclosure>();
		}
		
		enclosures.add(enclosure);
		return this;
	}

	public List<Category> getCategories()
	{
		return (categories == null ? null : Collections.unmodifiableList(categories));
	}

	public Item addAllCategories(List<Category> categories)
	{
		if (categories == null) return this;

		for (Category category : categories)
		{
			addCategory(category);
		}

		return this;
	}
	
	public Item addCategory(Category category)
	{
		if (categories == null)
		{
			categories = new ArrayList<Category>();
		}
		
		categories.add(category);
		return this;
	}

	public Guid getGuid()
	{
		return new Guid(guid);
	}

	public Item setGuid(Guid guid)
	{
		this.guid = guid;
		return this;
	}

	public String getComments()
	{
		return comments;
	}

	public Item setComments(String comments)
	{
		this.comments = comments;
		return this;
	}

	public String getAuthor()
	{
		return author;
	}

	public Item setAuthor(String author)
	{
		this.author = author;
		return this;
	}

	public Date getPubDate()
	{
		return (pubDate == null ? null : new Date(pubDate.getTime()));
	}

	public Item setPubDate(Date pubDate)
	{
		this.pubDate = (pubDate == null ? null : new Date(pubDate.getTime()));
		return this;
	}

	public Date getExpirationDate()
	{
		return (expirationDate == null ? null : new Date(expirationDate.getTime()));
	}

	public Item setExpirationDate(Date expirationDate)
	{
		this.expirationDate = (expirationDate == null ? null : new Date(expirationDate.getTime()));
		return this;
	}

	public List<?> getModules()
	{
		return (modules == null ? null : Collections.unmodifiableList(modules));
	}

	public Item addAllModules(List<String> modules)
	{
		if (modules == null) return this;

		for (String module : modules)
		{
			addModule(module);
		}

		return this;
	}

	public Item addModule(String module)
	{
		if (modules == null)
		{
			modules = new ArrayList<String>();
		}
		
		modules.add(module);
		return this;
	}

	public List<?> getForeignMarkup()
	{
		return (foreignMarkup == null ? null : Collections.unmodifiableList(foreignMarkup));
	}

	public Item addAllForeignMarkup(List<String> foreignMarkup)
	{
		if (foreignMarkup == null) return this;

		for (String markup : foreignMarkup)
		{
			addForeignMarkup(markup);
		}

		return this;
	}

	public Item addForeignMarkup(String foreignMarkup)
	{
		if (this.foreignMarkup == null)
		{
			this.foreignMarkup = new ArrayList<String>();
		}
		
		this.foreignMarkup.add(foreignMarkup);
		return this;
	}
}
