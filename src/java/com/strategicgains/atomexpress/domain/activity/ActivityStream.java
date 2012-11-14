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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author toddf
 * @since Oct 9, 2012
 */
public class ActivityStream
{
	private int totalItems = 0;
	private List<Activity> items;
	private String url;

	public ActivityStream()
	{
		super();
	}
	
	public ActivityStream(ActivityStream that)
	{
		this();
		
		if (that == null) return;

		addAllItems(that.items);
		computeTotalItems();
		setUrl(that.url);
	}

	public int getTotalItems()
	{
		return totalItems;
	}

	public ActivityStream computeTotalItems()
	{
		this.totalItems = this.items.size();
		return this;
	}

	public ActivityStream setTotalItems(int totalItems)
	{
		this.totalItems = totalItems;
		return this;
	}

	public List<Activity> getItems()
	{
		return (this.items == null ? null : Collections.unmodifiableList(items));
	}

	public ActivityStream addAllItems(List<Activity> items)
	{
		if (items == null) return this;

		for (Activity item : items)
		{
			addItem(item);
		}
		
		return this;
	}

	public ActivityStream addItem(Activity item)
	{
		if (item == null) return this;

		if (this.items == null)
		{
			this.items = new ArrayList<Activity>();
		}
		
		this.items.add(new Activity(item));
		return this;
	}

	public String getUrl()
	{
		return url;
	}

	public ActivityStream setUrl(String url)
	{
		this.url = url;
		return this;
	}
}
