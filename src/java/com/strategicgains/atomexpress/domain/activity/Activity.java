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
	private ActivityObject actor;
	private String content;
	private ActivityObject generator;
	private MediaLink icon;
	private String id;
	private ActivityObject object;
	private Date published = new Date();
	private ActivityObject provider;
	private ActivityObject target;
	private String title;
	private Date updated;
	private String url;
	private String verb = "post";

	public Activity()
	{
		super();
	}

	/**
	 * @param that
	 */
    public Activity(Activity that)
    {
    	this();
    	setActor(that.actor);
    	setContent(that.content);
    	setGenerator(that.generator);
    	setIcon(that.icon);
    	setId(that.id);
    	setObject(that.object);
    	setPublished(that.published);
    	setProvider(that.provider);
    	setTarget(that.target);
    	setTitle(that.title);
    	setUpdated(that.updated);
    	setUrl(that.url);
    	setVerb(that.verb);
    }

	public ActivityObject getActor()
	{
		return (actor == null ? null : new ActivityObject(actor));
	}

	public void setActor(ActivityObject actor)
	{
		this.actor = (actor == null ? null : new ActivityObject(actor));
	}

	public String getContent()
	{
		return content;
	}

	public void setContent(String content)
	{
		this.content = content;
	}

	public ActivityObject getGenerator()
	{
		return (generator == null ? null : new ActivityObject(generator));
	}

	public void setGenerator(ActivityObject generator)
	{
		this.generator = (generator == null ? null : new ActivityObject(generator));
	}

	public MediaLink getIcon()
	{
		return (icon == null ? null : new MediaLink(icon));
	}

	public void setIcon(MediaLink icon)
	{
		this.icon = (icon == null ? null : new MediaLink(icon));
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public ActivityObject getObject()
	{
		return (object == null ? null : new ActivityObject(object));
	}

	public void setObject(ActivityObject object)
	{
		this.object = (object == null ? null : new ActivityObject(object));
	}

	public Date getPublished()
	{
		return (published == null ? null : new Date(published.getTime()));
	}

	public void setPublished(Date published)
	{
		this.published = (published == null ? null : new Date(published.getTime()));
	}

	public ActivityObject getProvider()
	{
		return (provider == null ? null : new ActivityObject(provider));
	}

	public void setProvider(ActivityObject provider)
	{
		this.provider = (provider == null ? null : new ActivityObject(provider));
	}

	public ActivityObject getTarget()
	{
		return (target == null ? null : new ActivityObject(target));
	}

	public void setTarget(ActivityObject target)
	{
		this.target = (target == null ? null : new ActivityObject(target));
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
		return (updated == null ? null : new Date(updated.getTime()));
	}

	public void setUpdated(Date updated)
	{
		this.updated = (updated == null ? null : new Date(updated.getTime()));
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
