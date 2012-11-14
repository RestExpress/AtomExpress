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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

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
	private List<String> skipHours;
	private List<Days> skipDays;
	private Cloud cloud;
	private List<Category> categories;
	private String generator;
	private int ttl = -1;
	private List<String> modules;

	public Channel()
	{
		super();
	}

	public Channel(Channel that)
	{
		this();
		
		if (that == null) return;
		
		setTitle(that.title);
		setDescription(that.description);
		setLink(that.link);
		setUri(that.uri);
		setImage(that.image);
		addAllItems(that.items);
		setTextInput(that.textInput);
		setLanguage(that.language);
		setRating(that.rating);
		setCopyright(that.copyright);
		setPubDate(that.pubDate);
		setLastBuildDate(that.lastBuildDate);
		setDocs(that.docs);
		setManagingEditor(that.managingEditor);
		setWebMaster(that.webMaster);
		addAllSkipHours(that.skipHours);
		addAllSkipDays(that.skipDays);
		setCloud(that.cloud);
		addAllCategories(that.categories);
		setGenerator(that.generator);
		setTtl(that.ttl);
		addAllModules(that.modules);
	}

	public String getTitle()
	{
		return title;
	}

	public Channel setTitle(String title)
	{
		this.title = title;
		return this;
	}

	public String getDescription()
	{
		return description;
	}

	public Channel setDescription(String description)
	{
		this.description = description;
		return this;
	}

	public String getLink()
	{
		return link;
	}

	public Channel setLink(String link)
	{
		this.link = link;
		return this;
	}

	public String getUri()
	{
		return uri;
	}

	public Channel setUri(String uri)
	{
		this.uri = uri;
		return this;
	}

	public Image getImage()
	{
		return new Image(image);
	}

	public Channel setImage(Image image)
	{
		this.image = new Image(image);
		return this;
	}

	public List<Item> getItems()
	{
		return (items == null ? null : Collections.unmodifiableList(items));
	}

	public Channel addAllItems(List<Item> items)
	{
		if (items == null) return this;

		for (Item item : items)
		{
			addItem(item);
		}

		return this;
	}

	public Channel addItem(Item item)
	{
		if (items == null)
		{
			items = new ArrayList<Item>();
		}
		
		items.add(new Item(item));
		return this;
	}

	public TextInput getTextInput()
	{
		return new TextInput(textInput);
	}

	public Channel setTextInput(TextInput textInput)
	{
		this.textInput = new TextInput(textInput);
		return this;
	}

	public String getLanguage()
	{
		return language;
	}

	public Channel setLanguage(String language)
	{
		this.language = language;
		return this;
	}

	public String getRating()
	{
		return rating;
	}

	public Channel setRating(String rating)
	{
		this.rating = rating;
		return this;
	}

	public String getCopyright()
	{
		return copyright;
	}

	public Channel setCopyright(String copyright)
	{
		this.copyright = copyright;
		return this;
	}

	public Date getPubDate()
	{
		return (pubDate == null ? null : new Date(pubDate.getTime()));
	}

	public Channel setPubDate(Date pubDate)
	{
		this.pubDate = (pubDate == null ? null : new Date(pubDate.getTime()));
		return this;
	}

	public Date getLastBuildDate()
	{
		return (lastBuildDate == null ? null : new Date(lastBuildDate.getTime()));
	}

	public Channel setLastBuildDate(Date lastBuildDate)
	{
		this.lastBuildDate = (lastBuildDate == null ? null : new Date(lastBuildDate.getTime()));
		return this;
	}

	public String getDocs()
	{
		return docs;
	}

	public Channel setDocs(String docs)
	{
		this.docs = docs;
		return this;
	}

	public String getManagingEditor()
	{
		return managingEditor;
	}

	public Channel setManagingEditor(String managingEditor)
	{
		this.managingEditor = managingEditor;
		return this;
	}

	public String getWebMaster()
	{
		return webMaster;
	}

	public Channel setWebMaster(String webMaster)
	{
		this.webMaster = webMaster;
		return this;
	}

	public List<?> getSkipHours()
	{
		return (skipHours == null ? null : Collections.unmodifiableList(skipHours));
	}

	public Channel addAllSkipHours(List<String> skipHours)
	{
		if (skipHours == null) return this;

		for (String skipHour : skipHours)
		{
			addSkipHour(skipHour);
		}

		return this;
	}

	public Channel addSkipHour(String skipHour)
    {
		if (skipHours == null)
		{
			skipHours = new ArrayList<String>();
		}
		
		skipHours.add(skipHour);
		return this;
    }

	public List<Days> getSkipDays()
	{
		return (skipDays == null ? null : Collections.unmodifiableList(skipDays));
	}

	public Channel addAllSkipDays(List<Days> skipDays)
	{
		if (skipDays == null) return this;

		for (Days skipDay : skipDays)
		{
			addSkipDay(skipDay);
		}

		return this;
	}
	
	public Channel addSkipDay(Days skipDay)
	{
		if (skipDays == null)
		{
			skipDays = new ArrayList<Days>();
		}
		
		skipDays.add(skipDay);
		return this;
	}

	public Cloud getCloud()
	{
		return cloud;
	}

	public Channel setCloud(Cloud cloud)
	{
		this.cloud = cloud;
		return this;
	}

	public List<Category> getCategories()
	{
		return (categories == null ? null : Collections.unmodifiableList(categories));
	}

	public Channel addAllCategories(List<Category> categories)
	{
		if (categories == null) return this;

		for (Category category : categories)
		{
			addCategory(category);
		}

		return this;
	}
	
	public Channel addCategory(Category category)
	{
		if (categories == null)
		{
			categories = new ArrayList<Category>();
		}
		
		categories.add(new Category(category));
		return this;
	}

	public String getGenerator()
	{
		return generator;
	}

	public Channel setGenerator(String generator)
	{
		this.generator = generator;
		return this;
	}

	public int getTtl()
	{
		return ttl;
	}

	public Channel setTtl(int ttl)
	{
		this.ttl = ttl;
		return this;
	}

	public List<?> getModules()
	{
		return (modules == null ? null : Collections.unmodifiableList(modules));
	}

	public Channel addModule(String module)
	{
		if (modules == null)
		{
			modules = new ArrayList<String>();
		}
		
		modules.add(module);
		return this;
	}

	public Channel addAllModules(List<String> modules)
	{
		if (modules == null) return this;

		for (String module : modules)
		{
			addModule(module);
		}

		return this;
	}
}
