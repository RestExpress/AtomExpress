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

	private List extensions;

	private Date created; // Atom 0.3 only

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
		return authors;
	}

	public void setAuthors(List<Person> authors)
	{
		this.authors = authors;
	}

	public List<Person> getContributors()
	{
		return contributors;
	}

	public void setContributors(List<Person> contributors)
	{
		this.contributors = contributors;
	}

	public List<Category> getCategories()
	{
		return categories;
	}

	public void setCategories(List<Category> categories)
	{
		this.categories = categories;
	}

	public List<Content> getContents()
	{
		return contents;
	}

	public void setContents(List<Content> contents)
	{
		this.contents = contents;
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
		return published;
	}

	public void setPublished(Date published)
	{
		this.published = published;
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
		return source;
	}

	public void setSource(Feed source)
	{
		this.source = source;
	}

	public Content getSummary()
	{
		return summary;
	}

	public void setSummary(Content summary)
	{
		this.summary = summary;
	}

	public Content getTitle()
	{
		return title;
	}

	public void setTitle(Content title)
	{
		this.title = title;
	}

	public Date getUpdated()
	{
		return updated;
	}

	public void setUpdated(Date updated)
	{
		this.updated = updated;
	}

	public List<Link> getAlternateLinks()
	{
		return alternateLinks;
	}

	public void setAlternateLinks(List<Link> alternateLinks)
	{
		this.alternateLinks = alternateLinks;
	}

	public List<Link> getOtherLinks()
	{
		return otherLinks;
	}

	public void setOtherLinks(List<Link> otherLinks)
	{
		this.otherLinks = otherLinks;
	}

	public List<String> getForeignMarkup()
	{
		return foreignMarkup;
	}

	public void setForeignMarkup(List<String> foreignMarkup)
	{
		this.foreignMarkup = foreignMarkup;
	}

	public List getExtensions()
	{
		return extensions;
	}

	public void setExtensions(List extensions)
	{
		this.extensions = extensions;
	}

	public Date getCreated()
	{
		return created;
	}

	public void setCreated(Date created)
	{
		this.created = created;
	}
}
