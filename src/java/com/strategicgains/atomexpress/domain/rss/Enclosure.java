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
 * Bean for item enclosures of RSS feeds.
 * 
 * @author toddf
 */
public class Enclosure
{
	private String url;
	private long length;
	private String type;

	public Enclosure()
	{
		super();
	}
	
	public Enclosure(Enclosure that)
	{
		this();
		
		if (that == null) return;
		
		setUrl(that.url);
	}
	public String getUrl()
	{
		return url;
	}

	public Enclosure setUrl(String url)
	{
		this.url = url;
		return this;
	}

	public long getLength()
	{
		return length;
	}

	public Enclosure setLength(long length)
	{
		this.length = length;
		return this;
	}

	public String getType()
	{
		return type;
	}

	public Enclosure setType(String type)
	{
		this.type = type;
		return this;
	}
}
