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
 * Bean for item sources of RSS feeds.
 * 
 * @author toddf
 */
public class Source
{
	private String url;
	private String value;

	public Source()
	{
		super();
	}
	
	public Source(Source that)
	{
		this();
		
		if (that == null) return;

		setUrl(that.getUrl());
		setValue(that.getValue());
	}

	public String getUrl()
	{
		return url;
	}

	public Source setUrl(String url)
	{
		this.url = url;
		return this;
	}

	public String getValue()
	{
		return value;
	}

	public Source setValue(String value)
	{
		this.value = value;
		return this;
	}
}
