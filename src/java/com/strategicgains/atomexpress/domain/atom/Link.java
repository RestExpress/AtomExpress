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

	public void setHref(String href)
	{
		this.href = href;
	}

	public String getHrefResolved()
	{
		return hrefResolved;
	}

	public void setHrefResolved(String hrefResolved)
	{
		this.hrefResolved = hrefResolved;
	}

	public String getRel()
	{
		return rel;
	}

	public void setRel(String rel)
	{
		this.rel = rel;
	}

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getHreflang()
	{
		return hreflang;
	}

	public void setHreflang(String hreflang)
	{
		this.hreflang = hreflang;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
	{
		this.title = title;
	}

	public long getLength()
	{
		return length;
	}

	public void setLength(long length)
	{
		this.length = length;
	}
}
