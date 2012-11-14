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
package com.strategicgains.atomexpress.activity;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.strategicgains.atomexpress.domain.activity.Activity;
import com.strategicgains.atomexpress.domain.activity.ActivityObject;
import com.strategicgains.atomexpress.domain.activity.ActivityStream;

/**
 * @author fredta2
 * @since Nov 14, 2012
 */
public class ActivityStreamTest
{
	@Test
	public void shouldConstructBasicActivityStream()
	{
		ActivityStream s = new ActivityStream();
		s.addItem(new Activity()
			.setTitle("AtomExpress JUnit Execution")
			.setActor(
				new ActivityObject()
					.setDisplayName("toddf"))
			.setVerb("run")
			.setGenerator(
				new ActivityObject()
					.setContent("JUnit"))
			.setTarget(
				new ActivityObject()
					.setContent("Eclipse")));
		
		assertNotNull(s);
		s.computeTotalItems();
		assertEquals(1, s.getTotalItems());
	}
}
