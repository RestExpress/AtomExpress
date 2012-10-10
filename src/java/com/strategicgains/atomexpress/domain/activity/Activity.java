/*
    Copyright 2012, Strategic Gains, Inc.

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
package com.strategicgains.atomexpress.domain.activity;

import java.util.Date;

/**
 * @author toddf
 * @since Oct 9, 2012
 */
public class Activity
{
	private Object actor;
	private String content;
	private Object generator;
	private MediaLink icon;
	private String id;
	private Object object;
	private Date published = new Date();
	private Object provider;
	private Object target;
	private String title;
	private Date updated;
	private String url;
	private String verb = "post";

	public Activity()
	{
		super();
	}

	public Object getActor()
	{
		return actor;
	}

	public void setActor(Object actor)
	{
		this.actor = actor;
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public Object getGenerator()
	{
		return generator;
	}

	public void setGenerator(Object generator)
	{
		this.generator = generator;
	}

	public MediaLink getIcon()
	{
		return icon;
	}

	public void setIcon(MediaLink icon)
	{
		this.icon = icon;
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public Object getObject()
	{
		return object;
	}

	public void setObject(Object object)
	{
		this.object = object;
	}

	public Date getPublished()
	{
		return published;
	}

	public void setPublished(Date published)
	{
		this.published = published;
	}

	public Object getProvider()
	{
		return provider;
	}

	public void setProvider(Object provider)
	{
		this.provider = provider;
	}

	public Object getTarget()
	{
		return target;
	}

	public void setTarget(Object target)
	{
		this.target = target;
	}

	public String getTitle()
	{
		return title;
	}

	public void setTitle(String title)
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

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}

	public String getVerb()
	{
		return verb;
	}

	public void setVerb(String verb)
	{
		this.verb = verb;
	}
}
