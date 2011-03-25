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
	private List modules;
	private List foreignMarkup;

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getLink()
	{
		return link;
	}

	public void setLink(String link)
	{
		this.link = link;
	}

	public String getUri()
	{
		return uri;
	}

	public void setUri(String uri)
	{
		this.uri = uri;
	}

	public Description getDescription()
	{
		return description;
	}

	public void setDescription(Description description)
	{
		this.description = description;
	}

	public Content getContent()
	{
		return content;
	}

	public void setContent(Content content)
	{
		this.content = content;
	}

	public Source getSource()
	{
		return source;
	}

	public void setSource(Source source)
	{
		this.source = source;
	}

	public List<Enclosure> getEnclosures()
	{
		return enclosures;
	}

	public void setEnclosures(List<Enclosure> enclosures)
	{
		this.enclosures = enclosures;
	}

	public List<Category> getCategories()
	{
		return categories;
	}

	public void setCategories(List<Category> categories)
	{
		this.categories = categories;
	}

	public Guid getGuid()
	{
		return guid;
	}

	public void setGuid(Guid guid)
	{
		this.guid = guid;
	}

	public String getComments()
	{
		return comments;
	}

	public void setComments(String comments)
	{
		this.comments = comments;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public Date getPubDate()
	{
		return pubDate;
	}

	public void setPubDate(Date pubDate)
	{
		this.pubDate = pubDate;
	}

	public Date getExpirationDate()
	{
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate)
	{
		this.expirationDate = expirationDate;
	}

	public List getModules()
	{
		return modules;
	}

	public void setModules(List modules)
	{
		this.modules = modules;
	}

	public List getForeignMarkup()
	{
		return foreignMarkup;
	}

	public void setForeignMarkup(List foreignMarkup)
	{
		this.foreignMarkup = foreignMarkup;
	}
}
