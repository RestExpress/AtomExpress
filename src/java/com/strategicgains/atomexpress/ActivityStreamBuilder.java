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
package com.strategicgains.atomexpress;

import com.strategicgains.atomexpress.domain.activity.Activity;
import com.strategicgains.atomexpress.domain.activity.ActivityObject;
import com.strategicgains.atomexpress.domain.activity.ActivityStream;

/**
 * @author toddf
 * @since Oct 9, 2012
 */
public class ActivityStreamBuilder
{
	private ActivityStream stream = new ActivityStream();

	public ActivityStreamBuilder()
	{
		super();
	}

	public ActivityStreamBuilder setUrl(String url)
	{
		stream.setUrl(url);
		return this;
	}

	public ActivityStreamBuilder addActivity(String id, ActivityObject actor, String verb, ActivityObject object, ActivityObject target)
	{
		Activity a = new Activity();
		a.setId(id);
		a.setActor(actor);
		a.setVerb(verb);
		a.setObject(object);
		a.setTarget(target);
		stream.addItem(a);
		return this;
	}
	
	public ActivityStreamBuilder addActivity(Activity activity)
	{
		stream.addItem(new Activity(activity));
		return this;
	}
	
	public ActivityStream build()
	{
		return stream;
	}
}
