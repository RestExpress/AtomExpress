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

/**
 * Bean for link elements of an Atom feed.
 * 
 * @author toddf
 * @since 24 Feb 2011
 */
public class Link
{
	private String href;
	private String hrefResolved;
	private String rel = "alternate";
	private String type;
	private String hreflang;
	private String title;
	private long length;

	public Link()
	{
		super();
	}
	
	public Link(Link that)
	{
		this();
		setHref(that.href);
		setHrefResolved(that.hrefResolved);
		setRel(that.rel);
		setType(that.type);
		setHreflang(that.hreflang);
		setTitle(that.title);
		setLength(that.length);
	}

	public String getHref()
	{
		return href;
	}

	public Link setHref(String href)
	{
		this.href = href;
		return this;
	}

	public String getHrefResolved()
	{
		return hrefResolved;
	}

	public Link setHrefResolved(String hrefResolved)
	{
		this.hrefResolved = hrefResolved;
		return this;
	}

	public String getRel()
	{
		return rel;
	}

	public Link setRel(String rel)
	{
		this.rel = rel;
		return this;
	}

	public String getType()
	{
		return type;
	}

	public Link setType(String type)
	{
		this.type = type;
		return this;
	}

	public String getHreflang()
	{
		return hreflang;
	}

	public Link setHreflang(String hreflang)
	{
		this.hreflang = hreflang;
		return this;
	}

	public String getTitle()
	{
		return title;
	}

	public Link setTitle(String title)
	{
		this.title = title;
		return this;
	}

	public long getLength()
	{
		return length;
	}

	public Link setLength(long length)
	{
		this.length = length;
		return this;
	}
}
