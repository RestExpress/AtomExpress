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
package com.strategicgains.atomexpress.domain.rss;

import java.util.*;

/**
 * Bean for RSS feeds.
 * 
 * @author toddf
 */
public class Channel
{
	private String title;
	private String description;
	private String link;
	private String uri;
	private Image image;
	private List<Item> items;
	private TextInput textInput;
	private String language;
	private String rating;
	private String copyright;
	private Date pubDate;
	private Date lastBuildDate;
	private String docs;
	private String managingEditor;
	private String webMaster;
	private List skipHours;
	private List<Days> skipDays;
	private Cloud cloud;
	private List<Category> categories;
	private String generator;
	private int ttl = -1;
	private List modules;

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
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

	public Image getImage()
	{
		return image;
	}

	public void setImage(Image image)
	{
		this.image = image;
	}

	public List<Item> getItems()
	{
		return items;
	}

	public void setItems(List<Item> items)
	{
		this.items = items;
	}

	public TextInput getTextInput()
	{
		return textInput;
	}

	public void setTextInput(TextInput textInput)
	{
		this.textInput = textInput;
	}

	public String getLanguage()
	{
		return language;
	}

	public void setLanguage(String language)
	{
		this.language = language;
	}

	public String getRating()
	{
		return rating;
	}

	public void setRating(String rating)
	{
		this.rating = rating;
	}

	public String getCopyright()
	{
		return copyright;
	}

	public void setCopyright(String copyright)
	{
		this.copyright = copyright;
	}

	public Date getPubDate()
	{
		return pubDate;
	}

	public void setPubDate(Date pubDate)
	{
		this.pubDate = pubDate;
	}

	public Date getLastBuildDate()
	{
		return lastBuildDate;
	}

	public void setLastBuildDate(Date lastBuildDate)
	{
		this.lastBuildDate = lastBuildDate;
	}

	public String getDocs()
	{
		return docs;
	}

	public void setDocs(String docs)
	{
		this.docs = docs;
	}

	public String getManagingEditor()
	{
		return managingEditor;
	}

	public void setManagingEditor(String managingEditor)
	{
		this.managingEditor = managingEditor;
	}

	public String getWebMaster()
	{
		return webMaster;
	}

	public void setWebMaster(String webMaster)
	{
		this.webMaster = webMaster;
	}

	public List getSkipHours()
	{
		return skipHours;
	}

	public void setSkipHours(List skipHours)
	{
		this.skipHours = skipHours;
	}

	public List<Days> getSkipDays()
	{
		return skipDays;
	}

	public void setSkipDays(List<Days> skipDays)
	{
		this.skipDays = skipDays;
	}

	public Cloud getCloud()
	{
		return cloud;
	}

	public void setCloud(Cloud cloud)
	{
		this.cloud = cloud;
	}

	public List<Category> getCategories()
	{
		return categories;
	}

	public void setCategories(List<Category> categories)
	{
		this.categories = categories;
	}

	public String getGenerator()
	{
		return generator;
	}

	public void setGenerator(String generator)
	{
		this.generator = generator;
	}

	public int getTtl()
	{
		return ttl;
	}

	public void setTtl(int ttl)
	{
		this.ttl = ttl;
	}

	public List getModules()
	{
		return modules;
	}

	public void setModules(List modules)
	{
		this.modules = modules;
	}
}
