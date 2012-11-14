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

/**
 * Bean for images of RSS feeds.
 * 
 * @author toddf
 */
public class Image
{
	private String title;
	private String url;
	private String link;
	private Integer width;
	private Integer height;
	private String description;

	public Image()
	{
		super();
	}
	
	public Image(Image that)
	{
		this();
		
		if (that == null) return;
		
		setTitle(that.title);
		setUrl(that.url);
		setLink(that.link);
		setWidth(that.width);
		setHeight(that.height);
		setDescription(that.description);
	}

	public String getTitle()
	{
		return title;
	}

	public Image setTitle(String title)
	{
		this.title = title;
		return this;
	}

	public String getUrl()
	{
		return url;
	}

	public Image setUrl(String url)
	{
		this.url = url;
		return this;
	}

	public String getLink()
	{
		return link;
	}

	public Image setLink(String link)
	{
		this.link = link;
		return this;
	}

	public Integer getWidth()
	{
		return (width == null ? null : new Integer(width));
	}

	public Image setWidth(Integer width)
	{
		this.width = (width == null ? null : new Integer(width));
		return this;
	}

	public Integer getHeight()
	{
		return (height == null ? null : new Integer(height));
	}

	public Image setHeight(Integer height)
	{
		this.height = (height == null ? null : new Integer(height));
		return this;
	}

	public String getDescription()
	{
		return description;
	}

	public Image setDescription(String description)
	{
		this.description = description;
		return this;
	}
}
