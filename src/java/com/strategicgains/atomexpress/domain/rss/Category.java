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

/**
 * Bean for categories of RSS feeds.
 * 
 * @author toddf
 */
public class Category
{
	private String domain;
	private String value;

	public Category()
	{
		super();
	}
	
	public Category(Category that)
	{
		this();
		
		if (that == null) return;
		
		setDomain(that.domain);
		setValue(that.value);
	}

	public String getDomain()
	{
		return domain;
	}

	public Category setDomain(String domain)
	{
		this.domain = domain;
		return this;
	}

	public String getValue()
	{
		return value;
	}

	public Category setValue(String value)
	{
		this.value = value;
		return this;
	}
}
