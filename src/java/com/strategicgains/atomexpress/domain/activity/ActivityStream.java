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

	public int getTotalItems()
	{
		return totalItems;
	}

	public void setTotalItems()
	{
		this.totalItems = this.items.size();
	}

	public void setTotalItems(int totalItems)
	{
		this.totalItems = totalItems;
	}

	public List<Activity> getItems()
	{
		return (this.items == null ? null : Collections.unmodifiableList(items));
	}

	public void addAllItems(List<Activity> items)
	{
		if (this.items == null)
		{
			this.items = new ArrayList<Activity>(items.size());
		}
		
		this.items.addAll(items);
	}

	public void addItem(Activity item)
	{
		if (this.items == null)
		{
			this.items = new ArrayList<Activity>();
		}
		
		this.items.add(item);
	}

	public String getUrl()
	{
		return url;
	}

	public void setUrl(String url)
	{
		this.url = url;
	}
}
